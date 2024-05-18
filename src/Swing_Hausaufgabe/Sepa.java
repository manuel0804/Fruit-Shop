package Swing_Hausaufgabe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Sepa {

	private JFrame frame;
	private JTextField textField;
	private boolean check;
	private JTextField bicField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sepa window = new Sepa();
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
	public Sepa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setBounds(600, 280, 370, 220);
		ImageIcon image = new ImageIcon("sepa.png");
		frame.setIconImage(image.getImage());
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setTitle("SEPA-Lastschrift");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel iban = new JLabel("IBAN:");
		
		JLabel bic = new JLabel("BIC:");
		JLabel angabenPruefen = new JLabel();
		textField = new JTextField();
		textField.setColumns(10);
		bicField = new JTextField();
		bicField.setColumns(10);
		
		JButton bestaetigen = new JButton("Bestätigen");
		bestaetigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bicField.getText().isBlank() || textField.getText().isBlank()) {
					check = false;
				}else {
					check = true;
				}
				if(check) {
					frame.dispose();
					new Unterschrift().initialize();;
				}else {
					angabenPruefen.setText("Angeben prüfen");
					angabenPruefen.setForeground(Color.RED);
				}
			}
			
		});
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(iban, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bic, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(angabenPruefen, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(bestaetigen))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(bicField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(iban)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bic)
						.addComponent(bicField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bestaetigen)
						.addComponent(angabenPruefen, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
