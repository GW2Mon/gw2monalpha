package org.GW2Mon.model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */

public class AccCharSelection extends JFrame {

	private static final long serialVersionUID = 1L;
	static AccCharSelection instance = null;
	private JPanel contentPane;
	private JComboBox<String> cbAccount, cbCharakter;
	public boolean Ok = false;

	public AccCharSelection getInstance() {
		if (instance == null)
			instance = new AccCharSelection();
		return instance;
	}

	/**
	 * Create the frame.
	 */
	public AccCharSelection() {
		setTitle("Account & Charakterauswahl");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 304, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cbAccount = new JComboBox<String>();
		cbAccount.setBounds(76, 11, 210, 22);
		cbAccount.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				
			}
		});
		contentPane.add(cbAccount);

		JLabel lblAccount = new JLabel("Account");
		lblAccount.setBounds(10, 15, 46, 14);
		contentPane.add(lblAccount);

		JLabel lblCharakter = new JLabel("Charakter");
		lblCharakter.setBounds(10, 48, 57, 14);
		contentPane.add(lblCharakter);

		cbCharakter = new JComboBox<String>();
		cbCharakter.setBounds(76, 44, 210, 22);
		cbCharakter.removeAllItems();
		contentPane.add(cbCharakter);

		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnOk.setBounds(86, 80, 91, 23);
		contentPane.add(btnOk);
		instance = this;
	}
}
