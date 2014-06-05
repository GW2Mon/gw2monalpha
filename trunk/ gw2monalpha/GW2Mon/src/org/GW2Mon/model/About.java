package org.GW2Mon.model;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class About extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public About() {
		setTitle("About");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnDesignBy = new JTextPane();
		txtpnDesignBy.setBackground(SystemColor.inactiveCaptionText);
		txtpnDesignBy.setText("Design by Kro'nak Ag'ur\t\tAll Graphics from the Game Guils Wars2 \r\nIcon design by Miss Navvy Quinn\tare property of ArenaNet.\r\nIdea by Kro'nak Ag'ur\r\n\t\t\tIcon and Design property of Miss \r\n\t\t\tNavvy Quinn.\r\nProgramming:\r\nKro'nak Ag'ur\r\nTeemo Ryder");
		txtpnDesignBy.setBounds(10, 106, 422, 156);
		contentPane.add(txtpnDesignBy);
	}
}
