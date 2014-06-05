package org.GW2Mon.model;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Logger;

import cz.zweistein.gw2.api.GW2API;
import cz.zweistein.gw2.api.dto.Recipe;
import cz.zweistein.gw2.api.dto.items.Item;
import cz.zweistein.gw2.api.util.SupportedLanguage;

/**
 * 
 * @author GW2Mon[at]gmail.com
 * @version 0.0001 This class is constructed to fill the Database while
 *          engineering the Tool
 */
public class Inserter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JLabel lblKind;
	private static JProgressBar progressbar;
	private static GW2API api;
	private static Connection connection;
	private static Logger logger;
//	private static boolean EraseItem, EraseRecipe = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Inserter();
	}

	/**
	 * Calling the Methods insertRecipe and insertItem as often as Items and
	 * Recipes are in the Lists.
	 * 
	 * @param Recipes
	 * @param Items
	 */
	private static void insert(final List<Long> Recipes,
			final List<Long> Items, int I, final int J) {

		lblKind.setText("Rezezepte");
		
		RecipeThread(Recipes,Items,I);

		lblKind.setText("Items");

		ItemThread(Recipes, Items, J);
	}

	private static void ItemThread(final List<Long> Recipes,
			final List<Long> Items, final int J) {
		final Thread ItemThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int j = J; j < 5; j++) {
					try {
						progressbar.setValue(Recipes.size() + j);
						System.out.println(progressbar.getValue());
						InsertItems(Items.get(j).longValue());
					} catch (Exception e) {
						logger.error("Fehler bei Item-Id:"
								+ Items.get(j).intValue());
						insert(Recipes, Items, Recipes.size(), j + 2);
					}
					System.out.println("Item-Nummer:" + j + "/" + Items.size()
							+ " mit Id:" + Items.get(j).intValue());
				}

			}
		});
		ItemThread.run();
	}

	private static void RecipeThread(final List<Long> Recipes,final List<Long> Items,final int I) {
		
		Thread RecipeThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				}
		});
		RecipeThread.run();
	}

	/**
	 * Inserts the Item into the DB
	 * 
	 * @param id
	 */
	protected static void InsertItems(Long id) {
		Item item, itemEng;
		try {
			item = api.getItemDetails(id, SupportedLanguage.DEUTCH);
			itemEng = api.getItemDetails(id, SupportedLanguage.ENGLISH);
			String SQL = "Insert into item (NameGer,NameEng,DescGer,DescEng,Level,"
					+ "Rarity,vendorValue";
			if (item.getArmor() != null) {
				SQL += ",Armor,Defence,ArmorType,WeightClass";
				if (item.getArmor().getInfusionSlots() != null)
					SQL += ",InfusionSlot";
				if (item.getArmor().getInfixUpgrade() != null)
					if (item.getArmor().getInfixUpgrade().getAttributes() != null) {
						SQL += ",Attribute1Id,Attribute1Mod";
						if (item.getArmor().getInfixUpgrade().getAttributes()
								.size() > 1)
							SQL += ",Attribute2Id,Attribute2Mod";
						if (item.getArmor().getInfixUpgrade().getAttributes()
								.size() > 2)
							SQL += ",Attribute3Id,Attribute3Mod";
					}
			}

			if (item.getWeapon() != null) {
				SQL += ",Weapon,WeaponType,DamageType,MinPower,MaxPower,InfusionSlot";
				if (item.getWeapon().getInfixUpgrade() != null)
					if (item.getWeapon().getInfixUpgrade().getAttributes() != null) {
						SQL += ",Attribute1Id,Attribute1Mod";
						if (item.getWeapon().getInfixUpgrade().getAttributes()
								.size() > 1)
							SQL += ",Attribute2Id,Attribute2Mod";
						if (item.getWeapon().getInfixUpgrade().getAttributes()
								.size() > 2)
							SQL += ",Attribute3Id,Attribute3Mod";
					}
			}

			if (item.getBag() != null)
				SQL += ",Bag,Size";

			if (item.getConsumable() != null)
				SQL += ",Consumable,Duration,RecipeId,Type,UnlockType";

			if (item.getContainer() != null)
				SQL += ",Container,Type";

			if (item.getTrinket() != null) {
				SQL += ",Trinket,Type,InfusionSlot";
				if (item.getTrinket().getInfixUpgrade() != null)
					if (item.getTrinket().getInfixUpgrade().getAttributes() != null) {
						SQL += ",Attribute1Id,Attribute1Mod";
						if (item.getTrinket().getInfixUpgrade().getAttributes()
								.size() > 1)
							SQL += ",Attribute2Id,Attribute2Mod";
						if (item.getTrinket().getInfixUpgrade().getAttributes()
								.size() > 2)
							SQL += ",Attribute3Id,Attribute3Mod";
					}
			}

			if (item.getUpgradeComponent() != null) {
				SQL += ",UpgradeComponent,InfusionSlot";
				if (item.getUpgradeComponent().getInfixUpgrade() != null)
					if (item.getUpgradeComponent().getInfixUpgrade()
							.getAttributes() != null) {
						SQL += ",Attribute1Id,Attribute1Mod";
						if (item.getUpgradeComponent().getInfixUpgrade()
								.getAttributes().size() > 1)
							SQL += ",Attribute2Id,Attribute2Mod";
						if (item.getUpgradeComponent().getInfixUpgrade()
								.getAttributes().size() > 2)
							SQL += ",Attribute3Id,Attribute3Mod";
					}
			}

			if (item.getBack() != null) {
				SQL += ",Back,InfusionSlot";
				if (item.getBack().getInfixUpgrade() != null)
					if (item.getBack().getInfixUpgrade().getAttributes() != null) {
						SQL += ",Attribute1ID,Attribute1Mod";
						if (item.getBack().getInfixUpgrade().getAttributes()
								.size() > 1)
							SQL += ",Attribute2Id,Attribute2Mod";
						if (item.getBack().getInfixUpgrade().getAttributes()
								.size() > 2)
							SQL += ",Attribute3Id,Attribute3Mod";
					}
			}

			if (item.getGathering() != null)
				SQL += ",Gathering,Type";

			if (item.getGizmo() != null)
				SQL += ",Gizmo,Type";

			if (item.getTool() != null)
				SQL += ",Tool,Charges,Type";
			SQL += ",ApiId)Values(\""
					+ item.getName()
							.replaceAll("[_[^\\w\\däüöÄÜÖ\\+\\- ]]", "")
					+ "\",\""
					+ itemEng.getName().replaceAll("[_[^\\w\\däüöÄÜÖ\\+\\- ]]",
							"")
					+ "\",\""
					+ item.getDescription().replaceAll(
							"[_[^\\w\\däüöÄÜÖ\\+\\- ]]", "")
					+ "\",\""
					+ itemEng.getDescription().replaceAll(
							"[_[^\\w\\däüöÄÜÖ\\+\\- ]]", "") + "\","
					+ item.getLevel() + ",";
			/**
			 * TODO Rarity
			 */
			SQL += "," + item.getVendorValue();

			if (item.getArmor() != null) {
				SQL += ",1," + item.getArmor().getDefense() + ",";
				/**
				 * TODO ArmorType
				 */
				SQL += ",";
				//TODO Weigthclass
				if (item.getArmor().getInfusionSlots() != null)
					SQL += "," + item.getArmor().getInfusionSlots().size();
				if (item.getArmor().getInfixUpgrade() != null)
					if (item.getArmor().getInfixUpgrade().getAttributes() != null) {
					//TODO Attribute
					}
			}

			if (item.getWeapon() != null) {
				SQL += ",1,'" + item.getWeapon().getWeaponType() + "','"
						+ item.getWeapon().getDamageType() + "',"
						+ item.getWeapon().getMinPower().intValue() + ","
						+ item.getWeapon().getMaxPower().intValue() + ","
						+ item.getWeapon().getInfusionSlots().size();
				if (item.getWeapon().getInfixUpgrade() != null)
					if (item.getWeapon().getInfixUpgrade().getAttributes() != null) {
					//TODO Attribute
					}
			}

			if (item.getBag() != null)
				SQL += ",1," + item.getBag().getSize().intValue();

			if (item.getConsumable() != null)
				SQL += ",1," + item.getConsumable().getDuration().intValue()
						+ "," + item.getConsumable().getRecipeId().intValue()
						+ "," + item.getConsumable().getType().name() + ","
						+ item.getConsumable().getUnlockType().name();

			if (item.getContainer() != null)
				SQL += ",1,'" + item.getContainer().getType() + "'";

			if (item.getTrinket() != null) {
				//TODO ArmorType
				if (item.getTrinket().getInfixUpgrade() != null)
					if (item.getTrinket().getInfixUpgrade().getAttributes() != null) {
						//TODO Attribute
					}
			}

			if (item.getUpgradeComponent() != null) {
				SQL += ",1,"
						+ item.getUpgradeComponent().getInfusionUpgradeFlags()
								.size();
				if (item.getUpgradeComponent().getInfixUpgrade() != null)
					if (item.getUpgradeComponent().getInfixUpgrade()
							.getAttributes() != null) {
						//TODO Attribute
					}
			}

			if (item.getBack() != null) {
				SQL += ",1," + item.getBack().getInfusionSlots().size();
				if (item.getBack().getInfixUpgrade() != null)
					if (item.getBack().getInfixUpgrade().getAttributes() != null) {
						//TODO Attribute
					}
			}

			if (item.getGathering() != null)
				SQL += ",1," + item.getGathering().getType().name();

			if (item.getGizmo() != null)
				SQL += ",1,'" + item.getGizmo().getType().name() + "'";

			if (item.getTool() != null)
				SQL += ",1," + item.getTool().getCharges().intValue() + ","
						+ item.getTool().getType().name();

			SQL += "," + item.getItemId() + ");";
			try {
				Statement stmt = connection.createStatement();
				if (!connection.isClosed() && connection != null) {
					System.out.println(SQL);
					stmt.executeUpdate(SQL);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Inserts the Recipe into the DB
	 * 
	 * @param Id
	 */
	private static void InsertRecipes(Long Id) {
		String SQL = "Insert into Recipe (ItemId,ItemAmount,Ingredient1Id,Ingredient1Amount,";
		try {
			Recipe recipe = api.getRecipeDetails(Id, SupportedLanguage.DEUTCH);
			if (recipe.getIngredients().size() > 1)
				SQL += "Ingredient2Id,Ingredient2Amount,";
			if (recipe.getIngredients().size() > 2)
				SQL += "Ingredient3Id,Ingredient3Amount,";
			if (recipe.getIngredients().size() > 3)
				SQL += "Ingredient4Id,Ingredient4Amount,";

			SQL += "Rating,CraftDisc1Id,";

			if (recipe.getCraftingDisciplines().size() > 2)
				SQL += "CraftDisc2Id,";
			if (recipe.getCraftingDisciplines().size() > 3)
				SQL += "CraftDisc3Id,";

			SQL += "AutoLearned,ApiId)values(" + recipe.getOutputItem() + ","
					+ recipe.getOutputCount() + ","
					+ recipe.getIngredients().get(0).getItemId() + ","
					+ recipe.getIngredients().get(0).getCount() + ",";

			if (recipe.getIngredients().size() > 1)
				SQL += recipe.getIngredients().get(1).getItemId() + ","
						+ recipe.getIngredients().get(1).getCount() + ",";

			if (recipe.getIngredients().size() > 2)
				SQL += recipe.getIngredients().get(2).getItemId() + ","
						+ recipe.getIngredients().get(2).getCount() + ",";

			if (recipe.getIngredients().size() > 3)
				SQL += recipe.getIngredients().get(3).getItemId() + ","
						+ recipe.getIngredients().get(3).getCount() + ",";

			SQL += recipe.getRating();
			//TODO CraftingDisciplines
			SQL += "," + recipe.getFlags().size() + "," + recipe.getRecipeId()
					+ ");";

			try {
				Statement stmt = connection.createStatement();
				if (!connection.isClosed() && connection != null)
					stmt.executeUpdate(SQL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Inserter() {
		setTitle("Datenbank-Inserter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 112);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		progressbar = new JProgressBar();
		progressbar.setBounds(10, 61, 422, 16);
		progressbar.setVisible(true);
		contentPane.add(progressbar);

		JLabel lblLaedt = new JLabel("l\u00E4dt ...");
		lblLaedt.setBounds(10, 11, 46, 14);
		contentPane.add(lblLaedt);

		lblKind = new JLabel("New label");
		lblKind.setBounds(10, 36, 46, 14);
		contentPane.add(lblKind);
		logger = Logger.getLogger(Inserter.class);

		setVisible(true);
		frameInit();
		List<Long> Recipes = null;
		List<Long> Items = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:"
					+ System.getProperty("user.dir") + "\\Data\\GW2Mon.db");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					if (!connection.isClosed() && connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		try {
			api = new GW2API();
			Recipes = api.getRecipes();
			Items = api.getItems();
			progressbar.setMaximum(Recipes.size() + Items.size());
			insert(Recipes, Items, 0, 0);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
