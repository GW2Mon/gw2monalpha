package org.GW2Mon.model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTree;

import org.GW2Mon.lib.DefaultMutableTreeNode;
import org.GW2Mon.pojo.Item;

/**
 * 
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
public class ItemVzb extends JDialog {

	private static DefaultMutableTreeNode ItemTreeNode = new DefaultMutableTreeNode(
			"Item");
	private JTree ItemTree = null;
	private static Item ItemSelected;
	private JLabel lblItemNameGer, lblItemNameEng;
	private static final long serialVersionUID = 1L;
	protected static boolean closed = false;

	public ItemVzb() {
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		ItemTree.setBounds(10, 11, 213, 252);
		getContentPane().add(ItemTree);

		JLabel lblNameGer = new JLabel("Name deu.:");
		lblNameGer.setBounds(233, 12, 56, 14);
		getContentPane().add(lblNameGer);

		JLabel lblNameEng = new JLabel("Name eng.:");
		lblNameEng.setBounds(233, 62, 56, 14);
		getContentPane().add(lblNameEng);

		lblItemNameGer = new JLabel("");
		lblItemNameGer.setBounds(233, 37, 201, 14);
		getContentPane().add(lblItemNameGer);

		lblItemNameEng = new JLabel("");
		lblItemNameEng.setBounds(233, 87, 201, 14);
		getContentPane().add(lblItemNameEng);
	}

	public ItemVzb(final Equipment equip, final Item item) {
		ItemVzb itemvzb = new ItemVzb();
		itemvzb.Tree_Anlegen();
		ItemTree = new JTree(ItemTreeNode);
		ItemTree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent mevt) {
				DefaultMutableTreeNode Sel = (DefaultMutableTreeNode) ItemTree
						.getLastSelectedPathComponent();
				if (Sel != null) {
					ItemSelected = (org.GW2Mon.pojo.Item) Sel.getMainObject();
					lblItemNameGer.setText(ItemSelected.getNameGer());
					lblItemNameEng.setText(ItemSelected.getNameEng());
				}
				if (mevt.getClickCount() > 1) {
					ItemSelected = (org.GW2Mon.pojo.Item) Sel.getMainObject();
					if (item.getArmor() == 1) {
					}
					if (item.getTrinket() == 1) {
					}
					if (item.getWeapon() == 1) {

					}
				}
			}
		});
	}

	public ItemVzb(Coredata core) {
		ItemVzb itemvzb = new ItemVzb();
		itemvzb.Tree_Anlegen();
		ItemTree = new JTree(ItemTreeNode);
		ItemTree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent mevt) {
				DefaultMutableTreeNode Sel = (DefaultMutableTreeNode) ItemTree
						.getLastSelectedPathComponent();
				if (Sel != null) {
					ItemSelected = (org.GW2Mon.pojo.Item) Sel.getMainObject();
					lblItemNameGer.setText(ItemSelected.getNameGer());
					lblItemNameEng.setText(ItemSelected.getNameEng());
				}
				if (mevt.getClickCount() > 1) {
					ItemSelected = (org.GW2Mon.pojo.Item) Sel.getMainObject();
				}
			}
		});
	}

	private void Tree_Anlegen() {

	}
}
