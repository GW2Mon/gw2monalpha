package org.GW2Mon.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author gw2mon[at]gmail.com
 * @version 0.0001
 */
public class Skillplaner extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Skillplaner(org.GW2Mon.pojo.Account Account,
			org.GW2Mon.pojo.Charakter Charakter) {
		setTitle("Skillplaner");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 442, 21);
		contentPane.add(menuBar);

		JMenu mnProgram = new JMenu("Programm");
		menuBar.add(mnProgram);

		JMenuItem mntmClose = new JMenuItem("Fenster schlie\u00DFen");
		mntmClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JMenuItem mntmNeu = new JMenuItem("Neu");
		mnProgram.add(mntmNeu);

		JMenuItem mntmffnen = new JMenuItem("\u00D6ffnen");
		mnProgram.add(mntmffnen);

		JMenuItem mntmSpeichern = new JMenuItem("Speichern");
		mnProgram.add(mntmSpeichern);
		mnProgram.add(mntmClose);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 32, 35, 14);
		contentPane.add(lblName);

		JLabel lblCharname = new JLabel("Charname");
		lblCharname.setBounds(66, 32, 78, 14);
		contentPane.add(lblCharname);

		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(12, 57, 35, 14);
		contentPane.add(lblLevel);

		JLabel lblCharlevel = new JLabel("CharLevel");
		lblCharlevel.setBounds(66, 57, 63, 14);
		contentPane.add(lblCharlevel);

		JTabbedPane tpSkillplanner = new JTabbedPane(SwingConstants.TOP);
		tpSkillplanner.setBounds(10, 127, 422, 396);
		contentPane.add(tpSkillplanner);

		JPanel pOverview = new JPanel();
		tpSkillplanner.addTab("\u00DCbersicht", null, pOverview, null);
		pOverview.setLayout(null);

		JPanel panel_1 = new JPanel();
		tpSkillplanner.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		tpSkillplanner.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
	}
}
