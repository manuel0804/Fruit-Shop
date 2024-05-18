package Swing_Hausaufgabe;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.*;

public class ZahlungsmethodenFenster{

	private JFrame frame;
	private JLabel paypalLogo;
	private JLabel sepaLogo;
	private JLabel kreditkarteLogo;
	private JLabel applePayLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZahlungsmethodenFenster window = new ZahlungsmethodenFenster();
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
	public ZahlungsmethodenFenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setTitle("Zahlungsmethode");
		frame.setBounds(470, 280, 540, 350);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());
		
		
		String[] zahlungsmethoden = {"PayPal","Kreditkarte", "ApplePay", "SEPA-Lastschrift"};
		JComboBox comboBox = new JComboBox(zahlungsmethoden);
		JButton weiter = new JButton("Weiter");
		weiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("PayPal") || comboBox.getSelectedItem().equals("ApplePay")) {
					frame.dispose();
					new PayPal();
				}else if(comboBox.getSelectedItem().equals("Kreditkarte")) {
					frame.dispose();
					new Kreditkarte();
				}else if(comboBox.getSelectedItem().equals("SEPA-Lastschrift")) {
					frame.dispose();
					new Sepa();
				}
			}		
		});
		
		try {
			paypalLogo = new JLabel(new ImageIcon("pp.png"));
		}catch(Exception ex){
			paypalLogo = new JLabel("");
		}
		
		try {
			sepaLogo = new JLabel(new ImageIcon("sepa.png"));
		}catch(Exception ex){
			sepaLogo = new JLabel("");
		}
		try {
			applePayLogo = new JLabel(new ImageIcon("applePay.png"));
		}catch(Exception ex){
			applePayLogo = new JLabel("");
		}
		try {
			kreditkarteLogo = new JLabel(new ImageIcon("kreditkarte.png"));
		}catch(Exception ex){
			kreditkarteLogo = new JLabel("");
		}
		
		
		
		
		
		
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(453, Short.MAX_VALUE)
					.addComponent(weiter)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(169)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(sepaLogo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(applePayLogo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(185, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(49)
					.addComponent(paypalLogo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(401, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(373, Short.MAX_VALUE)
					.addComponent(kreditkarteLogo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(77))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(kreditkarteLogo)
						.addComponent(paypalLogo)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(sepaLogo)
								.addComponent(applePayLogo))
							.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(97)
							.addComponent(weiter)))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
