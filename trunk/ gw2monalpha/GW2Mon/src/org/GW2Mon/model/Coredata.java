package org.GW2Mon.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.GW2Mon.pojo.Item;

/**
 * @author Gw2Mon[at]gmail.com
 * @version 0.0001
 */
public class Coredata extends JFrame {

	/**
	 * Initializing class objects
	 */
	private static final long serialVersionUID = 1L;
	private Coredata instance = null;
	private JTabbedPane tabbedPane;
	private JPanel contentPane, pMenue, pRace, pProfession, pTrait, pSkill,
			pCraftingDiscipline, pItem, pAchievment, pBoonCondition, pRecept;
	private JTextField txtRaceNameGer, txtRaceNameEng, txtReceptNameGer,
			txtReceptNameEng, txtProNameGer, txtProNameEng, txtTraitNameGer,
			txtTraitNameEng, txtSkillNameGer, txtSkillNameEng, txtItemNameGer,
			txtItemNameEng, txtBCNameGer, txtBCNameEng, txtCraftDiscNameGer,
			txtCraftDiscNameEng, txtAchievNameGer, txtAchievNameEng;
	private JComboBox<String> cbRace, cbRaceCapital, cbProfession, cbTrait,
			cbSkill, cbRecept, cbCraftingDiscipline, cbBoonCondition,
			cbAchievment, cbProfTyp, cbProfTrait1, cbProfTrait2, cbProfTrait3;
	public static Item SelectedItem;

	public Coredata() {
		instance = this;
		init_Component();
		init_actions();
		tabbedPane.setSelectedComponent(pMenue);

		JButton btnNeu = new JButton("Neu");
		btnNeu.setEnabled(false);
		btnNeu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (tabbedPane.getSelectedComponent() == pRace) {
				}
				if (tabbedPane.getSelectedComponent() == pProfession) {
				}
				if (tabbedPane.getSelectedComponent() == pTrait) {
				}
				if (tabbedPane.getSelectedComponent() == pSkill) {
				}
			}
		});
		btnNeu.setBounds(5, 259, 53, 23);
		contentPane.add(btnNeu);
	}

	public Coredata getInstance() {
		if (instance == null) {
			instance = this;
		}
		return instance;
	}

	private void init_actions() {
		pRace.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbRace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pProfession.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbProfession.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pTrait.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbTrait.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pSkill.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbSkill.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pItem.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				if (SelectedItem == null)
					new ItemVzb().setVisible(true);
			}
		});

		pRecept.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbRecept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pBoonCondition.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbBoonCondition.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pCraftingDiscipline.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbCraftingDiscipline.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		pAchievment.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});

		cbAchievment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

	private void init_Component() {
		setTitle("Grunddaten");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 427, 314);

		contentPane = new JPanel();
		tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(5, 5, 409, 250);
		pMenue = new JPanel();
		pMenue.setName("pMenue");
		pRace = new JPanel();
		txtRaceNameGer = new JTextField();
		txtRaceNameEng = new JTextField();

		pRace.setName("pRace");
		pTrait = new JPanel();

		pTrait.setName("pTrait");
		pSkill = new JPanel();

		pSkill.setName("pSkill");
		pItem = new JPanel();

		pItem.setName("pItem");
		pRecept = new JPanel();

		pBoonCondition = new JPanel();

		pBoonCondition.setName("pBoonCondition");
		pRecept.setName("pRecept");
		pCraftingDiscipline = new JPanel();

		pCraftingDiscipline.setName("pCraftingDiscipline");
		pAchievment = new JPanel();

		pAchievment.setName("pAchievment");
		JButton btnRace = new JButton("Rassen");
		JButton btnProfession = new JButton("Klassen");
		JButton btnTrait = new JButton("Talente");
		JButton btnSkill = new JButton("Fertigkeiten");
		JButton btnItem = new JButton("Gegenst\u00E4nde");
		JButton btnRecept = new JButton("Rezepte");
		JButton btnBoonCondition = new JButton("Segen & Zust\u00E4nde");
		JButton btnCraftingDiscipline = new JButton("Berufe");
		JButton btnAchievment = new JButton("Erfolge");
		cbRaceCapital = new JComboBox<String>();
		cbRaceCapital.setBounds(246, 68, 140, 20);
		cbProfession = new JComboBox<String>();

		cbTrait = new JComboBox<String>();
		cbTrait.setBounds(10, 11, 85, 19);

		cbRecept = new JComboBox<String>();
		txtReceptNameGer = new JTextField();
		txtReceptNameEng = new JTextField();

		cbRecept.setBounds(10, 11, 119, 21);
		cbSkill = new JComboBox<String>();
		cbSkill.setBounds(10, 11, 119, 21);
		cbCraftingDiscipline = new JComboBox<String>();
		cbCraftingDiscipline.setBounds(10, 11, 119, 21);
		cbBoonCondition = new JComboBox<String>();
		cbBoonCondition.setBounds(10, 11, 119, 21);
		cbAchievment = new JComboBox<String>();
		cbAchievment.setBounds(10, 11, 119, 21);
		cbRace = new JComboBox<String>();

		cbRace.setBounds(10, 11, 129, 20);

		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.add(tabbedPane);
		tabbedPane.addTab("Men\u00FC", null, pMenue, null);
		pMenue.setLayout(null);

		tabbedPane.addTab("Rassen", null, pRace, null);

		txtRaceNameGer.setBounds(254, 11, 132, 20);
		txtRaceNameGer.setColumns(10);
		txtRaceNameEng.setBounds(253, 37, 133, 20);
		txtRaceNameEng.setColumns(10);
		JLabel lblRaceNameGer = new JLabel("Deutscher Name");
		lblRaceNameGer.setBounds(157, 14, 79, 14);
		JLabel lblRaceNameEng = new JLabel("Englischer Name");
		lblRaceNameEng.setBounds(157, 40, 78, 14);
		JLabel lblRaceCapital = new JLabel("Stadt");
		lblRaceCapital.setBounds(157, 71, 26, 14);
		pRace.setLayout(null);
		pRace.add(cbRace);
		pRace.add(lblRaceCapital);
		pRace.add(cbRaceCapital);
		pRace.add(lblRaceNameGer);
		pRace.add(txtRaceNameGer);
		pRace.add(lblRaceNameEng);
		pRace.add(txtRaceNameEng);
		pProfession = new JPanel();

		pProfession.setName("pProfession");
		tabbedPane.addTab("Klassen", null, pProfession,
				"Charakterklassen in Guild Wars 2");
		JLabel lblProNameGer = new JLabel("Deutscher Name");
		lblProNameGer.setBounds(148, 14, 79, 14);
		JLabel lblProEnglishName = new JLabel("English Name");
		lblProEnglishName.setBounds(148, 40, 63, 14);
		txtProNameGer = new JTextField();
		txtProNameGer.setBounds(237, 11, 157, 20);
		txtProNameGer.setColumns(10);
		txtProNameEng = new JTextField();
		txtProNameEng.setBounds(237, 37, 157, 20);
		txtProNameEng.setColumns(10);

		JLabel lblProfTrait1 = new JLabel("Talent 1");
		lblProfTrait1.setBounds(10, 71, 39, 14);

		JLabel lblProfTrait2 = new JLabel("Talent 2");
		lblProfTrait2.setBounds(10, 103, 39, 14);

		cbProfTrait1 = new JComboBox<String>();
		cbProfTrait1.setBounds(59, 68, 119, 21);

		cbProfTrait2 = new JComboBox<String>();
		cbProfTrait2.setBounds(59, 100, 119, 21);

		cbProfTrait3 = new JComboBox<String>();
		cbProfTrait3.setBounds(59, 132, 119, 21);

		JLabel lblProfTrait3 = new JLabel("Talent 3");
		lblProfTrait3.setBounds(10, 135, 39, 14);
		pProfession.setLayout(null);
		pProfession.add(lblProNameGer);
		pProfession.add(lblProEnglishName);
		pProfession.add(txtProNameEng);
		pProfession.add(txtProNameGer);
		pProfession.add(lblProfTrait1);
		pProfession.add(cbProfTrait1);
		pProfession.add(lblProfTrait2);
		pProfession.add(lblProfTrait3);
		pProfession.add(cbProfTrait3);
		pProfession.add(cbProfTrait2);
		cbProfession.setBounds(10, 11, 85, 19);
		pProfession.add(cbProfession);

		cbProfTyp = new JComboBox<String>();
		cbProfTyp.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Schwer ger\u00FCstet", "Mittelschwer ger\u00FCstet",
				"Leicht ger\u00FCstet" }));
		cbProfTyp.setBounds(258, 69, 136, 18);
		pProfession.add(cbProfTyp);

		JLabel lblProfTyp = new JLabel("Typ");
		lblProfTyp.setBounds(202, 71, 46, 14);
		pProfession.add(lblProfTyp);

		tabbedPane.addTab("Talente", null, pTrait, null);

		JLabel lblTraitNameEng = new JLabel("English Name");
		lblTraitNameEng.setBounds(140, 40, 63, 14);

		JLabel lblTraitNameGer = new JLabel("Deutscher Name");
		lblTraitNameGer.setBounds(140, 14, 79, 14);

		txtTraitNameGer = new JTextField();
		txtTraitNameGer.setBounds(229, 11, 157, 20);
		txtTraitNameGer.setColumns(10);

		txtTraitNameEng = new JTextField();
		txtTraitNameEng.setBounds(229, 37, 157, 20);
		txtTraitNameEng.setColumns(10);
		pTrait.setLayout(null);
		pTrait.add(cbTrait);
		pTrait.add(lblTraitNameGer);
		pTrait.add(txtTraitNameGer);
		pTrait.add(lblTraitNameEng);
		pTrait.add(txtTraitNameEng);

		tabbedPane.addTab("Fertigkeiten", null, pSkill, null);

		JLabel lblSkillNameEng = new JLabel("English Name");
		lblSkillNameEng.setBounds(140, 40, 63, 14);

		JLabel lblSkillNameGer = new JLabel("Deutscher Name");
		lblSkillNameGer.setBounds(140, 14, 79, 14);

		txtSkillNameGer = new JTextField();
		txtSkillNameGer.setBounds(229, 11, 157, 20);
		txtSkillNameGer.setColumns(10);

		txtSkillNameEng = new JTextField();
		txtSkillNameEng.setBounds(229, 37, 157, 20);
		txtSkillNameEng.setColumns(10);
		pSkill.setLayout(null);
		pSkill.add(cbSkill);
		pSkill.add(lblSkillNameGer);
		pSkill.add(txtSkillNameGer);
		pSkill.add(lblSkillNameEng);
		pSkill.add(txtSkillNameEng);

		tabbedPane.addTab("Gegenst\u00E4nde", null, pItem, null);

		JLabel lblItemNameEng = new JLabel("English Name");
		lblItemNameEng.setBounds(10, 72, 63, 14);

		JLabel lblItemNameGer = new JLabel("Deutscher Name");
		lblItemNameGer.setBounds(10, 46, 79, 14);

		txtItemNameGer = new JTextField();
		txtItemNameGer.setBounds(99, 43, 295, 20);
		txtItemNameGer.setColumns(10);

		txtItemNameEng = new JTextField();
		txtItemNameEng.setBounds(99, 69, 295, 20);
		txtItemNameEng.setColumns(10);
		pItem.setLayout(null);
		pItem.add(lblItemNameGer);
		pItem.add(txtItemNameGer);
		pItem.add(lblItemNameEng);
		pItem.add(txtItemNameEng);

		JButton btnItemAuswhlen = new JButton("Item ausw\u00E4hlen");
		btnItemAuswhlen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ItemVzb().setVisible(true);
				if (SelectedItem != null) {
					txtItemNameGer.setText(SelectedItem.getNameGer());
					txtItemNameEng.setText(SelectedItem.getNameEng());
				}
			}
		});
		btnItemAuswhlen.setBounds(10, 11, 111, 23);
		pItem.add(btnItemAuswhlen);

		tabbedPane.addTab("Rezepte", null, pRecept, null);

		JLabel lblReceptNameEng = new JLabel("English Name");
		lblReceptNameEng.setBounds(140, 40, 63, 14);

		JLabel lblReceptNameGer = new JLabel("Deutscher Name");
		lblReceptNameGer.setBounds(140, 14, 79, 14);
		txtReceptNameGer.setBounds(229, 11, 157, 20);
		txtReceptNameGer.setColumns(10);
		txtReceptNameEng.setBounds(229, 37, 157, 20);
		txtReceptNameEng.setColumns(10);
		pRecept.setLayout(null);
		pRecept.add(cbRecept);
		pRecept.add(lblReceptNameGer);
		pRecept.add(txtReceptNameGer);
		pRecept.add(lblReceptNameEng);
		pRecept.add(txtReceptNameEng);

		tabbedPane.addTab("Segen & Zust\u00E4nde", null, pBoonCondition, null);
		pBoonCondition.setLayout(null);
		pBoonCondition.add(cbBoonCondition);

		JLabel lblBCNameEng = new JLabel("English Name");
		lblBCNameEng.setBounds(140, 40, 63, 14);
		pBoonCondition.add(lblBCNameEng);

		JLabel lblBCNameGer = new JLabel("Deutscher Name");
		lblBCNameGer.setBounds(140, 14, 79, 14);
		pBoonCondition.add(lblBCNameGer);

		txtBCNameGer = new JTextField();
		txtBCNameGer.setBounds(229, 11, 157, 20);
		txtBCNameGer.setColumns(10);
		pBoonCondition.add(txtBCNameGer);

		txtBCNameEng = new JTextField();
		txtBCNameEng.setBounds(229, 37, 157, 20);
		txtBCNameEng.setColumns(10);
		pBoonCondition.add(txtBCNameEng);
		btnBoonCondition.setBounds(119, 45, 135, 23);

		pMenue.add(btnBoonCondition);
		btnCraftingDiscipline.setBounds(141, 79, 89, 23);
		pMenue.add(btnCraftingDiscipline);
		btnAchievment.setBounds(274, 79, 89, 23);
		tabbedPane.addTab("Erfolge", null, pAchievment, null);
		pAchievment.setLayout(null);
		pAchievment.add(cbAchievment);

		JLabel label_6 = new JLabel("English Name");
		label_6.setBounds(140, 40, 63, 14);
		pAchievment.add(label_6);

		JLabel label_7 = new JLabel("Deutscher Name");
		label_7.setBounds(140, 14, 79, 14);
		pAchievment.add(label_7);

		txtAchievNameGer = new JTextField();
		txtAchievNameGer.setBounds(229, 11, 157, 20);
		txtAchievNameGer.setColumns(10);
		pAchievment.add(txtAchievNameGer);

		txtAchievNameEng = new JTextField();
		txtAchievNameEng.setBounds(229, 37, 157, 20);
		txtAchievNameEng.setColumns(10);
		pAchievment.add(txtAchievNameEng);

		pMenue.add(btnAchievment);
		tabbedPane.addTab("Berufe", null, pCraftingDiscipline, null);

		pCraftingDiscipline.setLayout(null);
		pCraftingDiscipline.add(cbCraftingDiscipline);

		JLabel label_4 = new JLabel("English Name");
		label_4.setBounds(140, 40, 63, 14);
		pCraftingDiscipline.add(label_4);

		JLabel label_5 = new JLabel("Deutscher Name");
		label_5.setBounds(140, 14, 79, 14);
		pCraftingDiscipline.add(label_5);

		txtCraftDiscNameGer = new JTextField();
		txtCraftDiscNameGer.setBounds(229, 11, 157, 20);
		txtCraftDiscNameGer.setColumns(10);
		pCraftingDiscipline.add(txtCraftDiscNameGer);

		txtCraftDiscNameEng = new JTextField();
		txtCraftDiscNameEng.setBounds(229, 37, 157, 20);
		txtCraftDiscNameEng.setColumns(10);
		pCraftingDiscipline.add(txtCraftDiscNameEng);

		btnRace.setBounds(10, 11, 89, 23);
		pMenue.add(btnRace);

		btnProfession.setBounds(141, 11, 89, 23);
		pMenue.add(btnProfession);

		btnTrait.setBounds(277, 11, 89, 23);
		pMenue.add(btnTrait);

		btnSkill.setBounds(10, 45, 89, 23);
		pMenue.add(btnSkill);

		btnItem.setBounds(264, 45, 102, 23);
		pMenue.add(btnItem);

		btnRecept.setBounds(10, 79, 89, 23);
		pMenue.add(btnRecept);

		btnBoonCondition.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pBoonCondition);
			}
		});

		btnAchievment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pAchievment);
			}
		});

		btnCraftingDiscipline.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pCraftingDiscipline);
			}
		});

		btnRace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				tabbedPane.setSelectedComponent(pRace);
			}
		});

		btnProfession.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pProfession);
				;
			}
		});

		btnTrait.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pTrait);
			}
		});

		btnSkill.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pSkill);
			}
		});

		btnItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pItem);
			}
		});

		btnRecept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedComponent(pRecept);
			}
		});
	}
}
