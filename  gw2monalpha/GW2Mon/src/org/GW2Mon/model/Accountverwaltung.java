package org.GW2Mon.model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.GW2Mon.function.AccountverwaltungFunction;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
public class Accountverwaltung extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblAccName, lblAccEmail, lblAccCountChar, lblCharWName,
			lblCharWLevel, lblCharWProfession, lblCharWRace, lblAccWName,
			lblAccWEmail, lblAccWCountChar, lblCharRace;
	private JPanel contentPane, pAccAusw, pAcc, pCharAusw, pCharakter;
	private JTabbedPane tabbedPane;
	private JList<String> lAccount, lCharakter;
	private DefaultListModel<String> Acclist, Charlist;
	private static Accountverwaltung instance = null;
	private JTextField txtAccName, txtCharName, txtAccEmail, txtAccPW;
	private JComboBox<String> cbCharProfession, cbCharLevel, cbCharCraftDisc1,
			cbCharCraftDisc2, cbCharRace;
	private JTextField txtAccCountChar;
	private AccountverwaltungFunction accFunction = new AccountverwaltungFunction();

	/**
	 * Create the frame.
	 * 
	 * @param account
	 * @param charakter
	 */
	public Accountverwaltung() {
		Charlist = new DefaultListModel<String>();
		Acclist = new DefaultListModel<String>();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
			}
		});
		init_Components();
		instance = this;
	}

	/**
	 * creating and checking if there's only one instance of this class
	 * 
	 * @return instance
	 */
	public static Accountverwaltung getInstance() {
		if (instance == null) {
			instance = new Accountverwaltung();
		}
		return instance;
	}

	/**
	 * 
	 */
	private void init_Components() {
		setTitle("Accountverwaltung");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 319, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(SwingConstants.TOP);
		lAccount = new JList<String>(Acclist);
		tabbedPane.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
			}
		});
		tabbedPane.setBounds(5, 5, 301, 382);
		contentPane.add(tabbedPane);

		pAccAusw = new JPanel();
		tabbedPane.addTab("Accountauswahl", null, pAccAusw, null);
		pAccAusw.setLayout(null);

		lblAccName = new JLabel("");
		lblAccName.setBounds(131, 38, 127, 14);
		pAccAusw.add(lblAccName);

		lblAccEmail = new JLabel("");
		lblAccEmail.setBounds(131, 88, 127, 14);
		pAccAusw.add(lblAccEmail);

		lblAccCountChar = new JLabel("");
		lblAccCountChar.setBounds(131, 138, 127, 14);
		pAccAusw.add(lblAccCountChar);

		lAccount = new JList<String>(Acclist);
		lAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lAccount.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lAccount.setBounds(10, 12, 111, 334);
		pAccAusw.add(lAccount);

		lblAccWName = new JLabel("Name");
		lblAccWName.setBounds(131, 13, 35, 14);
		pAccAusw.add(lblAccWName);

		lblAccWEmail = new JLabel("Email");
		lblAccWEmail.setBounds(131, 63, 35, 14);
		pAccAusw.add(lblAccWEmail);

		lblAccWCountChar = new JLabel("Anzahl Charaktere");
		lblAccWCountChar.setBounds(131, 113, 127, 14);
		pAccAusw.add(lblAccWCountChar);

		pAcc = new JPanel();
		pAcc.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});
		tabbedPane.addTab("Account", null, pAcc, null);
		pAcc.setLayout(null);

		JLabel lblAccountname = new JLabel("Account-Name:");
		lblAccountname.setBounds(10, 11, 86, 14);
		pAcc.add(lblAccountname);

		txtAccName = new JTextField();
		txtAccName.setBounds(106, 8, 158, 20);
		pAcc.add(txtAccName);
		txtAccName.setColumns(10);

		JLabel lblAccountEmail = new JLabel("Email-Adresse:");
		lblAccountEmail.setBounds(10, 42, 86, 14);
		pAcc.add(lblAccountEmail);

		JLabel lblAccountPW = new JLabel("Passwort:");
		lblAccountPW.setBounds(10, 73, 86, 14);
		pAcc.add(lblAccountPW);

		txtAccEmail = new JTextField();
		txtAccEmail.setColumns(10);
		txtAccEmail.setBounds(106, 39, 158, 20);
		pAcc.add(txtAccEmail);

		txtAccPW = new JTextField();
		txtAccPW.setColumns(10);
		txtAccPW.setBounds(106, 70, 158, 20);
		pAcc.add(txtAccPW);

		txtAccCountChar = new JTextField();
		txtAccCountChar.setBounds(178, 101, 86, 20);
		pAcc.add(txtAccCountChar);
		txtAccCountChar.setColumns(10);

		JLabel lblAccountCountChar = new JLabel("Anzahl Char.");
		lblAccountCountChar.setBounds(106, 101, 62, 14);
		pAcc.add(lblAccountCountChar);

		pCharAusw = new JPanel();
		pCharAusw.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});
		tabbedPane.addTab("Charakterauswahl", null, pCharAusw, null);
		pCharAusw.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(134, 12, 46, 14);
		pCharAusw.add(lblName);

		lblCharWName = new JLabel("CharName");
		lblCharWName.setBounds(134, 37, 152, 14);
		pCharAusw.add(lblCharWName);

		JLabel lblRace = new JLabel("Rasse");
		lblRace.setBounds(134, 62, 46, 14);
		pCharAusw.add(lblRace);

		lblCharWRace = new JLabel("CharRasse");
		lblCharWRace.setBounds(190, 62, 96, 14);
		pCharAusw.add(lblCharWRace);

		JLabel lblProfession = new JLabel("Klasse");
		lblProfession.setBounds(134, 87, 46, 14);
		pCharAusw.add(lblProfession);

		lblCharWProfession = new JLabel("CharKlasse");
		lblCharWProfession.setBounds(190, 87, 96, 14);
		pCharAusw.add(lblCharWProfession);

		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(134, 112, 46, 14);
		pCharAusw.add(lblLevel);

		lblCharWLevel = new JLabel("CharLevel");
		lblCharWLevel.setBounds(190, 112, 46, 14);
		pCharAusw.add(lblCharWLevel);

		cbCharLevel = new JComboBox<String>();

		lCharakter = new JList<String>(Charlist);
		lCharakter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lCharakter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lCharakter.setBounds(10, 11, 114, 335);
		pCharAusw.add(lCharakter);

		pCharakter = new JPanel();
		pCharakter.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});
		tabbedPane.addTab("Charakter", null, pCharakter, null);
		pCharakter.setLayout(null);

		JLabel lblCharName = new JLabel("Charakter-Name:");
		lblCharName.setBounds(10, 11, 86, 14);
		pCharakter.add(lblCharName);

		txtCharName = new JTextField();
		txtCharName.setColumns(10);
		txtCharName.setBounds(106, 8, 145, 20);
		pCharakter.add(txtCharName);

		lblCharRace = new JLabel("Rasse");
		lblCharRace.setBounds(10, 43, 46, 14);
		pCharakter.add(lblCharRace);

		cbCharRace = new JComboBox<String>();
		cbCharRace.setBounds(106, 39, 91, 22);
		pCharakter.add(cbCharRace);

		JLabel lblCharProfession = new JLabel("Klasse");
		lblCharProfession.setBounds(10, 76, 46, 14);
		pCharakter.add(lblCharProfession);

		cbCharProfession = new JComboBox<String>();
		cbCharProfession.setBounds(106, 72, 91, 22);
		pCharakter.add(cbCharProfession);

		cbCharLevel.setBounds(106, 105, 91, 22);
		pCharakter.add(cbCharLevel);

		JLabel lblCharLevel = new JLabel("Level");
		lblCharLevel.setBounds(10, 109, 46, 14);
		pCharakter.add(lblCharLevel);

		cbCharCraftDisc1 = new JComboBox<String>();
		cbCharCraftDisc1.setBounds(106, 138, 91, 22);
		pCharakter.add(cbCharCraftDisc1);

		JLabel lblCharCraftDisc1 = new JLabel("Beruf 1");
		lblCharCraftDisc1.setBounds(10, 142, 46, 14);
		pCharakter.add(lblCharCraftDisc1);

		cbCharCraftDisc2 = new JComboBox<String>();
		cbCharCraftDisc2.setBounds(106, 171, 91, 22);
		pCharakter.add(cbCharCraftDisc2);

		JLabel lblCharCraftDisc2 = new JLabel("Beruf 2");
		lblCharCraftDisc2.setBounds(10, 175, 46, 14);
		pCharakter.add(lblCharCraftDisc2);

		JButton btnNew = new JButton("Neu");
		btnNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNew.setBounds(10, 393, 70, 23);
		contentPane.add(btnNew);
	}
}
