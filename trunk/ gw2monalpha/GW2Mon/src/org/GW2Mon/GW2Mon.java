package org.GW2Mon;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import org.GW2Mon.function.GW2MonFunction;
import org.GW2Mon.model.About;
import org.GW2Mon.model.Accountverwaltung;
import org.GW2Mon.model.Coredata;
import org.GW2Mon.model.Options;
import org.GW2Mon.model.Splashscreen;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;

/**
 * @author Gw2Mon[at]gmail.com
 * @version 0.0001
 */
public class GW2Mon {
	private static GW2Mon instance = null;
	public static String lang = "DE";
	public static File CorePath, AccPath, CharPath, CoreCfg, AccCfg,
			CharCfg = null;
	@SuppressWarnings("unused")
	private Account account = null;
	@SuppressWarnings("unused")
	private Charakter charakter = null;
	private JFrame frmGwmon;
	private JMenuBar menuBar;
	private static GW2MonFunction function = new GW2MonFunction();
	public static DefaultListModel<String> CharList=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				function.iniLoad();
				try {
					Splashscreen splash = new Splashscreen();
					splash.setModal(true);
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					GW2Mon window = GW2Mon.getInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GW2Mon() {
		initialize();
		instance = this;
		frmGwmon.setVisible(true);
	}

	public static GW2Mon getInstance() {
		if (instance == null) {
			instance = new GW2Mon();
		}
		return instance;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGwmon = new JFrame();
		frmGwmon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGwmon.setTitle("GW2Mon");
		frmGwmon.setBounds(100, 100, 305, 485);
		menuBar = new JMenuBar();

		frmGwmon.setJMenuBar(menuBar);

		JMenu mnProgramm = new JMenu("Programm");
		menuBar.add(mnProgramm);

		JMenuItem mnOeffnen = new JMenuItem("\u00D6ffnen");
		mnProgramm.add(mnOeffnen);

		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mnProgramm.add(mntmBeenden);

		JMenu mnStammdaten = new JMenu("Stammdaten");
		menuBar.add(mnStammdaten);

		JMenuItem mntmAccount = new JMenuItem("Account");
		mntmAccount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Accountverwaltung Accverw = Accountverwaltung.getInstance();
			}
		});
		mnStammdaten.add(mntmAccount);

		JMenuItem mntmGrunddaten = new JMenuItem("Grunddaten");
		mntmGrunddaten.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Coredata().setVisible(true);
			}
		});
		mnStammdaten.add(mntmGrunddaten);

		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);

		JMenuItem mntmSkillplaner = new JMenuItem("Skill-Planer");
		mntmSkillplaner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mnTools.add(mntmSkillplaner);

		JMenuItem mntmRessourcencalc = new JMenuItem("Ressourcen-Calc");
		mntmRessourcencalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				function.mntmRessourcencalcClicked();
			}
		});
		mnTools.add(mntmRessourcencalc);

		JMenu mnUeber = new JMenu("\u00DCber");
		menuBar.add(mnUeber);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new About().setVisible(true);
			}
		});

		JMenuItem mntmOptions = new JMenuItem("Optionen");
		mntmOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Options().setVisible(true);
			}
		});
		mnUeber.add(mntmOptions);
		mnUeber.add(mntmAbout);
		frmGwmon.getContentPane().setLayout(null);

		final JTabbedPane tpMain = new JTabbedPane(SwingConstants.TOP);
		tpMain.setBounds(0, 0, 297, 437);
		frmGwmon.getContentPane().add(tpMain);

		final JPanel pAccounts = new JPanel();
		tpMain.addTab("Accounts", null, pAccounts, null);
		pAccounts.setLayout(null);

		final JPanel pCharakters = new JPanel();
		tpMain.addTab("Charaktere", null, pCharakters, null);
		pCharakters.setLayout(null);

		final DefaultListModel<String> AccList = new DefaultListModel<String>();
		CharList = new DefaultListModel<String>();

		final JList<String> lAccounts = new JList<String>(AccList);
		lAccounts.setBounds(10, 11, 125, 390);
		pAccounts.add(lAccounts);

		lAccounts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() > 1){
					account = function.lAccountClicked(lAccounts);
					tpMain.setSelectedComponent(pCharakters);
				}
			}
		});

		JList<String> lCharakters = new JList<String>(CharList);
		lCharakters.setBounds(10, 11, 128, 390);
		pCharakters.add(lCharakters);

		lCharakters.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				charakter = function.lCharakterClicked(CharList);
			}
		});

		frmGwmon.addWindowListener(new WindowListener() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				function.WindowClosed();
				System.exit(0);
			}

			@Override
			public void windowActivated(WindowEvent arg0) {
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				function.WindowOpened(AccList, CharList);

			}
		});
	}
}