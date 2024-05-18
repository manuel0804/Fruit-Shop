package Swing_Hausaufgabe;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.LayoutStyle.ComponentPlacement;

//Start hier

public class STARTfenster {
	private boolean check = false;
	private JFrame frame;
	private JLabel authen1;
	private JLabel authen2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STARTfenster window = new STARTfenster();
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
	public STARTfenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setForeground(new Color(240, 240, 240));
		frame.setBounds(470, 280, 535, 350);
		frame.setTitle("Authentification");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());
		
		JLabel label1 = new JLabel();
		
	
		label1.setText(
				"<html><body>! Bitte authentifizieren Sie sich als Mensch<br>Kreuzen Sie die beste Uni der Welt an !</body></html>");
		JLabel label2 = new JLabel();
		JRadioButton radioButton1 = new JRadioButton("Uni Stuttgart");
		radioButton1.setBackground(new Color(255, 255, 128));
		radioButton1.addActionListener(e -> {
			check = false;
		});

		JRadioButton radioButton2 = new JRadioButton("Harvard Univerity");
		radioButton2.setBackground(new Color(255, 255, 128));
		radioButton2.addActionListener(e -> {
			check = false;
		});
		
		JRadioButton radioButton4 = new JRadioButton("Stanford University");
		radioButton4.setBackground(new Color(255, 255, 128));
		radioButton4.addActionListener(e -> {
			check = false;
		});

		JRadioButton radioButton3 = new JRadioButton("Hft Stuttgart");
		radioButton3.setBackground(new Color(255, 255, 128));
		radioButton3.addActionListener(e -> {
			check = true;
		});

		ButtonGroup unis = new ButtonGroup();
		unis.add(radioButton1);
		unis.add(radioButton2);
		unis.add(radioButton3);
		unis.add(radioButton4);
		

		JButton button1 = new JButton("Weiter");
		button1.setBackground(new Color(240, 240, 240));
		button1.addActionListener(e -> {
				if (check) {
					new Bestellfenster();
					frame.dispose();
				}else {
					label2.setText("Bitte richtig auswählen");
					label2.setForeground(Color.RED);
				}
		});
		
		try {
			authen1 = new JLabel(new ImageIcon("authentification.png"));	
		}catch(Exception ex){
			authen1 = new JLabel("");
		}
		
		try {
			authen2 = new JLabel(new ImageIcon("authentification.png"));	
		}catch(Exception ex){
			authen2 = new JLabel("");
		}
			
	
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(94)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton4, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
					.addGap(145))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(129)
					.addComponent(label1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(237, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addComponent(authen1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(339, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(409, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(button1)
						.addComponent(authen2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addGap(122))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(authen1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(authen2))))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioButton1)
						.addComponent(radioButton4))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioButton2)
								.addComponent(radioButton3))
							.addGap(45)
							.addComponent(label2))
						.addComponent(button1))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
