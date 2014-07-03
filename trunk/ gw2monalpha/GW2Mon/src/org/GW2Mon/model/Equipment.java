package org.GW2Mon.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Equipment extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtEquipName;
	private org.GW2Mon.pojo.Item Head, Shoulder, Torso, Hands, Legs, Feet,
			Back, Necklage, RingR, RingL, EarringR, EarringL;

	/**
	 * Create the panel.
	 */
	public Equipment(org.GW2Mon.pojo.Equipment equip) {
		setLayout(null);
		if (equip != null) {
		} else {
		}
		JTabbedPane tpEquipment = new JTabbedPane(SwingConstants.TOP);
		tpEquipment.setBounds(0, 0, 437, 454);
		add(tpEquipment);

		JPanel pOverview = new JPanel();
		pOverview.setLayout(null);
		tpEquipment.addTab("\u00DCbersicht", null, pOverview, null);

		JLabel lblEquipName = new JLabel("Name:");
		lblEquipName.setBounds(10, 11, 31, 14);
		pOverview.add(lblEquipName);

		txtEquipName = new JTextField();
		txtEquipName.setColumns(10);
		txtEquipName.setBounds(51, 8, 109, 20);
		txtEquipName.setText(equip.getName());
		pOverview.add(txtEquipName);

		JPanel pArmor = new JPanel();
		pArmor.setLayout(null);
		tpEquipment.addTab("R\u00FCstung", null, pArmor, null);

		JTabbedPane tpArmor = new JTabbedPane(SwingConstants.TOP);
		tpArmor.setBounds(0, 11, 432, 415);
		pArmor.add(tpArmor);

		JPanel pHead = new JPanel();
		pHead.setLayout(null);
		tpArmor.addTab("Kopf", null, pHead, null);

		JButton btnHead = new JButton("Item ausw\u00E4hlen");
		btnHead.setBounds(10, 11, 109, 23);
		btnHead.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ItemVzb(getEquipment(), getHead()).setModal(true);
			}
		});
		pHead.add(btnHead);

		JPanel pShoulders = new JPanel();
		pShoulders.setLayout(null);
		tpArmor.addTab("Schultern", null, pShoulders, null);

		JButton btnShoulders = new JButton("Item ausw\u00E4hlen");
		btnShoulders.setBounds(10, 11, 109, 23);
		btnShoulders.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ItemVzb(getEquipment(), getShoulder()).setModal(true);
			}
		});
		pShoulders.add(btnShoulders);

		JPanel pTorso = new JPanel();
		pTorso.setLayout(null);
		tpArmor.addTab("Torso", null, pTorso, null);

		JButton btnTorso = new JButton("Item ausw\u00E4hlen");
		btnTorso.setBounds(10, 11, 109, 23);
		btnTorso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ItemVzb(getEquipment(), getTorso()).setModal(true);
			}
		});
		pTorso.add(btnTorso);

		JPanel pHands = new JPanel();
		pHands.setLayout(null);
		tpArmor.addTab("H\u00E4nde", null, pHands, null);

		JButton btnHands = new JButton("Item ausw\u00E4hlen");
		btnHands.setBounds(10, 11, 109, 23);
		btnHands.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ItemVzb(getEquipment(), getHands()).setModal(true);
			}
		});
		pHands.add(btnHands);

		JPanel pLegs = new JPanel();
		pLegs.setLayout(null);
		tpArmor.addTab("Beine", null, pLegs, null);

		JButton btnLegs = new JButton("Item ausw\u00E4hlen");
		btnLegs.setBounds(10, 11, 109, 23);
		btnLegs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ItemVzb(getEquipment(), getLegs()).setModal(true);
			}
		});
		pLegs.add(btnLegs);

		JPanel pFeet = new JPanel();
		pFeet.setLayout(null);
		tpArmor.addTab("F\u00FC\u00DFe", null, pFeet, null);

		JButton btnFeet = new JButton("Item ausw\u00E4hlen");
		btnFeet.setBounds(10, 11, 109, 23);
		btnFeet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ItemVzb(getEquipment(), getFeet()).setModal(true);
			}
		});
		pFeet.add(btnFeet);

		JPanel pJuwelery = new JPanel();
		pJuwelery.setLayout(null);
		tpEquipment.addTab("Schmuck", null, pJuwelery, null);

		JTabbedPane tpJuwelery = new JTabbedPane(SwingConstants.TOP);
		tpJuwelery.setBounds(0, 11, 432, 415);
		pJuwelery.add(tpJuwelery);

		JPanel pBack = new JPanel();
		pBack.setLayout(null);
		tpJuwelery.addTab("R\u00FCcken", null, pBack, null);

		JPanel pNecklage = new JPanel();
		pNecklage.setLayout(null);
		tpJuwelery.addTab("Amulett", null, pNecklage, null);

		JPanel pRingR = new JPanel();
		pRingR.setLayout(null);
		tpJuwelery.addTab("Ring rechts", null, pRingR, null);

		JPanel pRingL = new JPanel();
		pRingL.setLayout(null);
		tpJuwelery.addTab("Ring links", null, pRingL, null);

		JPanel pEarringR = new JPanel();
		pEarringR.setLayout(null);
		tpJuwelery.addTab("Ohrrring rechts", null, pEarringR, null);

		JPanel pEarringL = new JPanel();
		pEarringL.setLayout(null);
		tpJuwelery.addTab("Ohrring links", null, pEarringL, null);

		JPanel pWeapons1 = new JPanel();
		pWeapons1.setLayout(null);
		tpEquipment.addTab("Waffen-Set 1", null, pWeapons1, null);

		JTabbedPane tpWeaponSet1 = new JTabbedPane(SwingConstants.TOP);
		tpWeaponSet1.setBounds(0, 11, 432, 415);
		pWeapons1.add(tpWeaponSet1);

		JPanel pMainHand = new JPanel();
		pMainHand.setLayout(null);
		tpWeaponSet1.addTab("New tab", null, pMainHand, null);

		JPanel pOffHand = new JPanel();
		pOffHand.setLayout(null);
		tpWeaponSet1.addTab("New tab", null, pOffHand, null);

		JPanel pWeapons2 = new JPanel();
		pWeapons2.setLayout(null);
		tpEquipment.addTab("Waffen-Set 2", null, pWeapons2, null);

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(0, 11, 432, 418);
		pWeapons2.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);

	}

	public org.GW2Mon.pojo.Item getShoulder() {
		return Shoulder;
	}

	public void setShoulder(org.GW2Mon.pojo.Item shoulder) {
		Shoulder = shoulder;
	}

	public org.GW2Mon.pojo.Item getLegs() {
		return Legs;
	}

	public void setLegs(org.GW2Mon.pojo.Item legs) {
		Legs = legs;
	}

	public org.GW2Mon.pojo.Item getBack() {
		return Back;
	}

	public void setBack(org.GW2Mon.pojo.Item back) {
		Back = back;
	}

	public org.GW2Mon.pojo.Item getHead() {
		return Head;
	}

	public void setHead(org.GW2Mon.pojo.Item head) {
		Head = head;
	}

	public org.GW2Mon.pojo.Item getNecklage() {
		return Necklage;
	}

	public void setNecklage(org.GW2Mon.pojo.Item necklage) {
		Necklage = necklage;
	}

	public org.GW2Mon.pojo.Item getRingL() {
		return RingL;
	}

	public void setRingL(org.GW2Mon.pojo.Item ringL) {
		RingL = ringL;
	}

	public org.GW2Mon.pojo.Item getEarringL() {
		return EarringL;
	}

	public void setEarringL(org.GW2Mon.pojo.Item earringL) {
		EarringL = earringL;
	}

	public org.GW2Mon.pojo.Item getTorso() {
		return Torso;
	}

	public void setTorso(org.GW2Mon.pojo.Item torso) {
		Torso = torso;
	}

	public org.GW2Mon.pojo.Item getFeet() {
		return Feet;
	}

	public void setFeet(org.GW2Mon.pojo.Item feet) {
		Feet = feet;
	}

	public org.GW2Mon.pojo.Item getHands() {
		return Hands;
	}

	public void setHands(org.GW2Mon.pojo.Item hands) {
		Hands = hands;
	}

	public org.GW2Mon.pojo.Item getRingR() {
		return RingR;
	}

	public void setRingR(org.GW2Mon.pojo.Item ringR) {
		RingR = ringR;
	}

	public org.GW2Mon.pojo.Item getEarringR() {
		return EarringR;
	}

	public void setEarringR(org.GW2Mon.pojo.Item earringR) {
		EarringR = earringR;
	}

	public Equipment getEquipment() {
		return this;
	}
}
