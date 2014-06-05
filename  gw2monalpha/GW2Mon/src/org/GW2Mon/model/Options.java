package org.GW2Mon.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Options extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPathIni;
	private JTextField txtPathCoreDB;
	private JTextField txtPathAccDB;
	private JTextField txtPathCharDB;

	/**
	 * Create the frame.
	 */
	public Options() {
		setTitle("Optionen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 352, 206);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtPathIni = new JTextField();
		txtPathIni.setBounds(139, 11, 202, 20);
		panel.add(txtPathIni);
		txtPathIni.setColumns(10);
		
		txtPathCoreDB = new JTextField();
		txtPathCoreDB.setBounds(139, 42, 202, 20);
		panel.add(txtPathCoreDB);
		txtPathCoreDB.setColumns(10);
		
		txtPathAccDB = new JTextField();
		txtPathAccDB.setBounds(139, 73, 202, 20);
		panel.add(txtPathAccDB);
		txtPathAccDB.setColumns(10);
		
		txtPathCharDB = new JTextField();
		txtPathCharDB.setBounds(139, 104, 202, 20);
		panel.add(txtPathCharDB);
		txtPathCharDB.setColumns(10);
		
		JLabel lblPathIni = new JLabel("Pfad der Ini-Datei");
		lblPathIni.setBounds(10, 14, 119, 14);
		panel.add(lblPathIni);
		
		JLabel lblPathCoreDB = new JLabel("Pfad der CoreDB-Datei");
		lblPathCoreDB.setBounds(10, 45, 119, 14);
		panel.add(lblPathCoreDB);
		
		JLabel lblPathAccDB = new JLabel("Pfad der AccDB-Datei");
		lblPathAccDB.setBounds(10, 76, 119, 14);
		panel.add(lblPathAccDB);
		
		JLabel lblPathCharDB = new JLabel("Pfad der CharDB-Datei");
		lblPathCharDB.setBounds(10, 107, 119, 14);
		panel.add(lblPathCharDB);
		
		JButton btnSave = new JButton("Speichern");
		btnSave.setBounds(10, 228, 89, 23);
		contentPane.add(btnSave);
	}
}
