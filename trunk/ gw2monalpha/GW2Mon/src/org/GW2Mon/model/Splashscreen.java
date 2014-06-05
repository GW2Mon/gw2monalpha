package org.GW2Mon.model;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JDialog;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Splashscreen extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JProgressBar progressBar;

	public void load() {
		Thread loader = new Thread(new Runnable() {
			@Override
			public void run() {
				progressBar.setValue(10);
				dispose();
			}
		});
		loader.start();
	}

	/**
	 * Create the frame.
	 */
	public Splashscreen() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setName("Splashscreen");
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 246, 422, 16);
		int rowCount=0;
		progressBar.setMaximum(rowCount + 100);
		getContentPane().add(progressBar);

		JLabel lblProgname = new JLabel("Guild Wars 2 Monitor");
		lblProgname.setForeground(new java.awt.Color(255, 0, 0));
		lblProgname.setFont(new Font("Cooper Black", Font.BOLD | Font.ITALIC,
				26));
		lblProgname.setBounds(60, 27, 309, 46);
		add(lblProgname);

		JLabel lblLoading = new JLabel("loading");
		lblLoading.setBounds(10, 138, 46, 14);
		add(lblLoading);
		setVisible(true);
		load();
	}
}
