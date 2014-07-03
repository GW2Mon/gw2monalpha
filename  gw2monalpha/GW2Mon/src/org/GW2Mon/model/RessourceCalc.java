package org.GW2Mon.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
public class RessourceCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	static RessourceCalc instance = null;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	@SuppressWarnings("unused")
	private Account account;
	@SuppressWarnings("unused")
	private Charakter charakter;

	public RessourceCalc getInstance(org.GW2Mon.pojo.Account account,
			org.GW2Mon.pojo.Charakter charakter) {
		if (instance == null)
			instance = new RessourceCalc(account, charakter);
		return instance;
	}

	/**
	 * Create the frame.
	 */
	public RessourceCalc(Account acc, Charakter Char) {
		account = acc;
		charakter = Char;
		setTitle("Ressourcen-Calculator");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 559);

		init_Components();

		tabbedPane.setSelectedIndex(0);
	}

	private void init_Components() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnProgramm = new JMenu("Programm");
		menuBar.add(mnProgramm);

		JMenuItem mntmNeu = new JMenuItem("Neu");
		mntmNeu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnProgramm.add(mntmNeu);

		JMenuItem mntmffnen = new JMenuItem("\u00D6ffnen");
		mnProgramm.add(mntmffnen);

		JMenuItem mntmSpeichern = new JMenuItem("Speichern");
		mnProgramm.add(mntmSpeichern);

		JMenuItem mntmSchlieen = new JMenuItem("Schlie\u00DFen");
		mntmSchlieen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnProgramm.add(mntmSchlieen);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(0, 11, 442, 493);
		contentPane.add(tabbedPane);

	}
}
