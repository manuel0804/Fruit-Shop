package Swing_Hausaufgabe;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class PayPal {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JButton bestaetigen;
	private boolean check;
	private JLabel angaben;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayPal window = new PayPal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PayPal() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setBounds(600, 280, 370, 220);
		ImageIcon image = new ImageIcon("pp.png");
		frame.setIconImage(image.getImage());
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setTitle("PayPal/ApplePay");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel nutzername = new JLabel("Nutzername:");
		
		passwordField = new JPasswordField();
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel passwort = new JLabel("Passwort:");
		
		angaben = new JLabel("");
		
		bestaetigen = new JButton("Bestätigen");
		bestaetigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().isBlank() || textField.getText().isBlank()) {
					check = false;
				}else {
					check = true;
				}
				if(check) {
					frame.dispose();
					new Unterschrift().initialize();;
				}else {
					angaben.setText("Angaben prüfen");
					angaben.setForeground(Color.RED);
					
				}
			}
			
		});
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(passwort, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(275, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(nutzername, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(23)
									.addComponent(angaben, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bestaetigen))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordField, 219, 219, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))))
							.addGap(180))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(54, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nutzername, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwort, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(angaben, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
						.addComponent(bestaetigen))
					.addGap(19))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
