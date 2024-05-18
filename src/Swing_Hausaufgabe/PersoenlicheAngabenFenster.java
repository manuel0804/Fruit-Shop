package Swing_Hausaufgabe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PersoenlicheAngabenFenster {
    public static Kunde kunde = new Kunde();
	private JFrame frame;
	private JTextField vorname;
	private JTextField nachname;
	private JTextField email;
	private JTextField strasse;
	private JTextField hausnummer;
	private JTextField plz;
	private JTextField ort;
	private boolean check1 = true;
	private boolean check2 = true;
	private boolean check3 = true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersoenlicheAngabenFenster window = new PersoenlicheAngabenFenster();
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
	public PersoenlicheAngabenFenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setTitle("Persönliche Angaben");
		frame.setResizable(false);
		frame.setBounds(470, 280, 540, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());
		frame.setVisible(true);

		JLabel lblNewLabel = new JLabel("Vorname:");

		JLabel lblNachname = new JLabel("Nachname:");

		JLabel lblEmail = new JLabel("E-Mail:");

		JLabel lblStrasseHausnummer = new JLabel("Strasse:");

		JLabel lblPlz = new JLabel("PLZ:");

		JLabel lblOrt = new JLabel("Ort:");

		JLabel lblHausnummer = new JLabel("Hausnummer:");

		JLabel falscheAngaben = new JLabel();
		
		vorname = new JTextField();
		vorname.setColumns(10);
		vorname.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
			
			}
			public void focusLost(FocusEvent e) {
				kunde.setVorname(vorname.getText());
			}
		});

		nachname = new JTextField();
		nachname.setColumns(10);
		nachname.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				
			}
			public void focusLost(FocusEvent e) {
				kunde.setNachname(nachname.getText());
			}
		});

		email = new JTextField();
		email.setColumns(10);
		email.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				
			}
			public void focusLost(FocusEvent e) {
				kunde.setEmail(email.getText());
			}
		});
		

		strasse = new JTextField();
		strasse.setColumns(10);
		strasse.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				
			}
			public void focusLost(FocusEvent e) {
				kunde.setStrasse(strasse.getText());
			}
		});

		hausnummer = new JTextField();
		hausnummer.setColumns(10);
		hausnummer.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				
			}
			public void focusLost(FocusEvent e) {
				try {
					int temp = Integer.parseInt(hausnummer.getText());
					kunde.setPlz(hausnummer.getText());
					check1 = true;
				}catch(Exception ex){
					check1 = false;
				}
			}
		});

		plz = new JTextField();
		plz.setColumns(10);
		plz.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				
			}
			public void focusLost(FocusEvent e) {
				try {
					int temp = Integer.parseInt(plz.getText());
					kunde.setPlz(plz.getText());
					check2=true;
				}catch(Exception ex){
					check2 = false;
				}
			}
		});

		ort = new JTextField();
		ort.setColumns(10);
		ort.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				
			}
			public void focusLost(FocusEvent e) {
				kunde.setOrt(ort.getText());
			}
		});

		JRadioButton button1 = new JRadioButton("Herr");
		button1.setBackground(new Color(255, 255, 128));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kunde.setGeschlecht("Herr");
			}

		});

		JRadioButton button2 = new JRadioButton("Frau");
		button2.setBackground(new Color(255, 255, 128));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kunde.setGeschlecht("Frau");
			}

		});

		ButtonGroup geschlecht = new ButtonGroup();
		geschlecht.add(button2);
		geschlecht.add(button1);

		JButton btnNewButton = new JButton("Löschen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vorname.setText(null);
				nachname.setText(null);
				email.setText(null);
				strasse.setText(null);
				hausnummer.setText(null);
				plz.setText(null);
				ort.setText(null);
				geschlecht.clearSelection();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Weiter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vorname.getText().isBlank() || nachname.getText().isBlank() || email.getText().isBlank() ||strasse.getText().isBlank() ||hausnummer.getText().isBlank() ||plz.getText().isBlank() ||ort.getText().isBlank()) {
					check3 = false;
				}else if(!(button1.isSelected()) & !(button2.isSelected()) ) {
					check3 = false;
				}else {
					check3 = true;
				}
				if(check1 && check2 && check3) {
					new ZahlungsmethodenFenster();
				    frame.dispose();
				}else {
					falscheAngaben.setText("Bitte überprüfen Sie ihre Angaben");
					falscheAngaben.setForeground(Color.red);
				}
				
			}
		});
		

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
							.addComponent(falscheAngaben, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1)
							.addGap(61))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblHausnummer, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
									.addComponent(lblStrasseHausnummer, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPlz, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblOrt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNachname, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(email, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addComponent(ort, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addComponent(plz, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addComponent(strasse, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addComponent(hausnummer, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addComponent(nachname, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
								.addComponent(vorname, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(149, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button1)
						.addComponent(button2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(vorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNachname, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(nachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStrasseHausnummer, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(strasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHausnummer, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(hausnummer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPlz, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(plz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrt, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(ort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(falscheAngaben))
					.addGap(34))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
