package org.GW2Mon.model;

import javax.swing.JPanel;
import javax.swing.JLabel;
import org.GW2Mon.pojo.Charakter;

public class Charakter extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Charakter Char = null;

	/**
	 * Create the panel.
	 * @return 
	 */
	public Charakter(){
		
	}
	
	public void initialize() {
		setLayout(null);
		
		JLabel lblCharName = new JLabel(Char.getName());
		lblCharName.setBounds(10, 11, 121, 14);
		add(lblCharName);
		
		JLabel lblCharLevel = new JLabel("Level: "+Integer.toString(Char.getLevel()));
		lblCharLevel.setBounds(141, 11, 46, 14);
		add(lblCharLevel);

	}
}
