package org.GW2Mon.model;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Charakter extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Charakter instance = null;
	public Charakter Char = null;

	/**
	 * Create the panel.
	 * @return 
	 */
	public Charakter(org.GW2Mon.pojo.Charakter Char){
		initialize(Char);
		instance=this;		
	}
	
	public static Charakter getInstance(org.GW2Mon.pojo.Charakter Char){
		if (instance==null)
			instance = new Charakter(Char);
		return instance;
	}
	
	public void initialize(org.GW2Mon.pojo.Charakter Char) {
		setLayout(null);
		
		JLabel lblCharName = new JLabel(Char.getName());
		lblCharName.setBounds(10, 11, 121, 14);
		add(lblCharName);
		
		JLabel lblCharLevel = new JLabel("Level: "+Integer.toString(Char.getLevel()));
		lblCharLevel.setBounds(141, 11, 46, 14);
		add(lblCharLevel);
		
		JLabel lblCharRace = new JLabel(Char.getRace().getNameGer());
		lblCharRace.setBounds(10, 36, 46, 14);
		add(lblCharRace);
		
		JLabel lblCharProfession = new JLabel(Char.getProfession().getNameGer());
		lblCharProfession.setBounds(66, 36, 46, 14);
		add(lblCharProfession);

	}
}
