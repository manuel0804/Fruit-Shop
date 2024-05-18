package Swing_Hausaufgabe;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Bestellfenster {
	public static Einkaufskorb korb = new Einkaufskorb();
	private int counter1 = 0;
	private int counter2 = 0;
	private int counter3 = 0;
	private int counter4 = 0;
	private int counter5 = 0;
	private int counter6 = 0;
	private int counter7 = 0;
	private int counter8 = 0;
	private int counter9 = 0;
	private int counter10 = 0;
	private int counter11 = 0;

	private int counter12 = 0;
	private int counter13 = 0;
	private int counter14 = 0;
	private int counter15 = 0;
	private int counter16 = 0;
	private int counter17 = 0;
	private int counter18 = 0;
	private int counter19 = 0;
	private int counter20 = 0;
	private int counter21 = 0;
	private int counter22 = 0;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bestellfenster window = new Bestellfenster();
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
	public Bestellfenster() {
		initialize();
	}
	
	public static String price(ArrayList<Artikel> e) {
		Double summe = 0.0;
		for (int i = 0; i < e.size(); i++) {
			summe += e.get(i).getPreis();
		}
		summe = Math.round(summe*100)/100.00;
		return summe.toString() + " €";
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setResizable(false);
		frame.setBounds(300, 50, 900, 590);
		frame.setTitle("Willkommen bei HolmYFruitS - Ihr Online Obstwarenhandel des Vertrauens");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 128));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 857, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(19, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE).addContainerGap()));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		tabbedPane.addTab("regional", null, panel, null);
		
		
		
		
		JLabel summeGeld = new JLabel();
		JLabel summeAnzahl = new JLabel();

		JButton apfelPlus = new JButton("+");
		JLabel counter1ausgabe = new JLabel();
		apfelPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel apfel = new Artikel("Apfel", 1.3);
				korb.getEinkaufskorb().add(apfel);
				counter1++;
				counter1ausgabe.setText(Integer.toString(counter1));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton apfelMinus = new JButton("-");
		apfelMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Apfel")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter1--;
				if (counter1 < 0) {
					counter1 = 0;
				}
				counter1ausgabe.setText(Integer.toString(counter1));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kirschePlus = new JButton("+");
		JLabel counter2ausgabe = new JLabel();
		kirschePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel kirsche = new Artikel("Kirsche", 2);
				korb.getEinkaufskorb().add(kirsche);
				counter2++;
				counter2ausgabe.setText(Integer.toString(counter2));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kirscheMinus = new JButton("-");
		kirscheMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Kirsche")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter2--;
				if (counter2 < 0) {
					counter2 = 0;
				}
				counter2ausgabe.setText(Integer.toString(counter2));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton birnePlus = new JButton("+");
		JLabel counter3ausgabe = new JLabel();
		birnePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel birne = new Artikel("Birne", 1.7);
				korb.getEinkaufskorb().add(birne);
				counter3++;
				counter3ausgabe.setText(Integer.toString(counter3));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton birneMinus = new JButton("-");
		birneMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Birne")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter3--;
				if (counter3 < 0) {
					counter3 = 0;
				}
				counter3ausgabe.setText(Integer.toString(counter3));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kiwiPlus = new JButton("+");
		JLabel counter4ausgabe = new JLabel();
		kiwiPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel kiwi = new Artikel("Kiwi", 1.7);
				korb.getEinkaufskorb().add(kiwi);
				counter4++;
				counter4ausgabe.setText(Integer.toString(counter4));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kiwiMinus = new JButton("-");
		kiwiMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Kiwi")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter4--;
				if (counter4 < 0) {
					counter4 = 0;
				}
				counter4ausgabe.setText(Integer.toString(counter4));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton bananePlus = new JButton("+");
		JLabel counter5ausgabe = new JLabel();
		bananePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel banane = new Artikel("Banane", 1.5);
				korb.getEinkaufskorb().add(banane);
				counter5++;
				counter5ausgabe.setText(Integer.toString(counter5));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton bananeMinus = new JButton("-");
		bananeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Banane")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter5--;
				if (counter5 < 0) {
					counter5 = 0;
				}
				counter5ausgabe.setText(Integer.toString(counter5));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton pfirsichPlus = new JButton("+");
		JLabel counter6ausgabe = new JLabel();
		pfirsichPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel pfirsich = new Artikel("Pfirsich", 1.6);
				korb.getEinkaufskorb().add(pfirsich);
				counter6++;
				counter6ausgabe.setText(Integer.toString(counter6));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton pfirsichMinus = new JButton("-");
		pfirsichMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Pfirsich")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter6--;
				if (counter6 < 0) {
					counter6 = 0;
				}
				counter6ausgabe.setText(Integer.toString(counter6));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton erdbeerePlus = new JButton("+");
		JLabel counter8ausgabe = new JLabel();
		erdbeerePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel erdbeere = new Artikel("Erdbeere", 1.7);
				korb.getEinkaufskorb().add(erdbeere);
				counter8++;
				counter8ausgabe.setText(Integer.toString(counter8));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton erdbeereMinus = new JButton("-");
		erdbeereMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Erdbeere")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter8--;
				if (counter8 < 0) {
					counter8 = 0;
				}
				counter8ausgabe.setText(Integer.toString(counter8));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton himbeerePlus = new JButton("+");
		JLabel counter9ausgabe = new JLabel();
		himbeerePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel himbeere = new Artikel("Himbeere", 2);
				korb.getEinkaufskorb().add(himbeere);
				counter9++;
				counter9ausgabe.setText(Integer.toString(counter9));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton himbeereMinus = new JButton("-");
		himbeereMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Himbeere")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter9--;
				if (counter9 < 0) {
					counter9 = 0;
				}
				counter9ausgabe.setText(Integer.toString(counter9));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton orangePlus = new JButton("+");
		JLabel counter10ausgabe = new JLabel();
		orangePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel orange = new Artikel("Orange", 1.7);
				korb.getEinkaufskorb().add(orange);
				counter10++;
				counter10ausgabe.setText(Integer.toString(counter10));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));

			}
		});

		JButton orangeMinus = new JButton("-");
		orangeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Orange")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter10--;
				if (counter10 < 0) {
					counter10 = 0;
				}
				counter10ausgabe.setText(Integer.toString(counter10));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton traubePlus = new JButton("+");
		JLabel counter7ausgabe = new JLabel();
		traubePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel traube = new Artikel("Traube", 1.5);
				korb.getEinkaufskorb().add(traube);
				counter7++;
				counter7ausgabe.setText(Integer.toString(counter7));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton traubeMinus = new JButton("-");
		traubeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Traube")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter7--;
				if (counter7 < 0) {
					counter7 = 0;
				}
				counter7ausgabe.setText(Integer.toString(counter7));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton pflaumePlus = new JButton("+");
		JLabel counter11ausgabe = new JLabel();
		pflaumePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel pflaume = new Artikel("Pflaume", 1.6);
				korb.getEinkaufskorb().add(pflaume);
				counter11++;
				counter11ausgabe.setText(Integer.toString(counter11));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton pflaumeMinus = new JButton("-");
		pflaumeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Pflaume")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter11--;
				if (counter11 < 0) {
					counter11 = 0;
				}
				counter11ausgabe.setText(Integer.toString(counter11));
				summeGeld.setText(price(korb.getEinkaufskorb()));
				summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Apfel");

		JLabel lblNewLabel_2 = new JLabel("_______________________________________________________");

		JLabel lblNewLabel_3 = new JLabel("Summe (Preis in €/250g):");

		JLabel lblNewLabel_1_1 = new JLabel("Kirsche");

		JLabel lblNewLabel_1_2 = new JLabel("Birne");

		JLabel lblNewLabel_1_3 = new JLabel("Kiwi");

		JLabel lblNewLabel_1_4 = new JLabel("Banane");

		JLabel lblNewLabel_1_5 = new JLabel("Pfirsich");

		JLabel lblNewLabel_1_7 = new JLabel("Erdbeere");

		JLabel lblNewLabel_1_8 = new JLabel("Himbeere");

		JLabel lblNewLabel_1_9 = new JLabel("Orange");

		JLabel lblNewLabel_1_10 = new JLabel("Pflaume");

		JLabel lblNewLabel_1_11 = new JLabel("Weintraube");

		JLabel lblNewLabel_4_1 = new JLabel("2.00");

		JLabel lblNewLabel_4_2 = new JLabel("1.70");

		JLabel lblNewLabel_4_3 = new JLabel("1.70");

		JLabel lblNewLabel_4_4 = new JLabel("1.50");

		JLabel lblNewLabel_4_5 = new JLabel("1.60");

		JLabel lblNewLabel_4_6 = new JLabel("1.50");

		JLabel lblNewLabel_4_7 = new JLabel("1.70");

		JLabel lblNewLabel_4_8 = new JLabel("2.00");

		JLabel lblNewLabel_4_9 = new JLabel("1.70");

		JLabel lblNewLabel_4_10 = new JLabel("1.60");

		JLabel lblNewLabel_4_1_1 = new JLabel("1.30");
	
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(apfelPlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(kirschePlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(birnePlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(kiwiPlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(bananePlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(pfirsichPlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(erdbeerePlus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(himbeerePlus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(orangePlus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
										.addComponent(traubePlus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(orangeMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_9, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(himbeereMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_8, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(erdbeereMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_7, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(bananeMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(kiwiMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(birneMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(kirscheMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(apfelMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(traubeMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
												.addComponent(pfirsichMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1_11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(pflaumePlus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pflaumeMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_1_10, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
							.addGap(464)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter2ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter1ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter3ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter4ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter5ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter6ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter7ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter8ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter9ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter10ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_4_10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(counter11ausgabe, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
							.addGap(180))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(summeGeld, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(255))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE))
							.addGap(41))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(summeAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(206))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(apfelPlus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(apfelMinus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_4_1_1)
						.addComponent(counter1ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(kirschePlus)
						.addComponent(kirscheMinus)
						.addComponent(lblNewLabel_1_1)
						.addComponent(lblNewLabel_4_1)
						.addComponent(counter2ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(birnePlus)
						.addComponent(birneMinus)
						.addComponent(lblNewLabel_1_2)
						.addComponent(lblNewLabel_4_2)
						.addComponent(counter3ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(kiwiPlus)
						.addComponent(kiwiMinus)
						.addComponent(lblNewLabel_1_3)
						.addComponent(lblNewLabel_4_3)
						.addComponent(counter4ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(bananePlus)
						.addComponent(bananeMinus)
						.addComponent(lblNewLabel_1_4)
						.addComponent(lblNewLabel_4_4)
						.addComponent(counter5ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(pfirsichPlus)
						.addComponent(pfirsichMinus)
						.addComponent(lblNewLabel_1_5)
						.addComponent(lblNewLabel_4_5)
						.addComponent(counter6ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_11)
						.addComponent(traubeMinus)
						.addComponent(traubePlus)
						.addComponent(lblNewLabel_4_6)
						.addComponent(counter7ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(erdbeerePlus)
						.addComponent(erdbeereMinus)
						.addComponent(lblNewLabel_1_7)
						.addComponent(lblNewLabel_4_7)
						.addComponent(counter8ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(himbeerePlus)
						.addComponent(himbeereMinus)
						.addComponent(lblNewLabel_1_8)
						.addComponent(lblNewLabel_4_8)
						.addComponent(counter9ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(orangePlus)
						.addComponent(orangeMinus)
						.addComponent(lblNewLabel_1_9)
						.addComponent(lblNewLabel_4_9)
						.addComponent(counter10ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(pflaumePlus)
						.addComponent(pflaumeMinus)
						.addComponent(lblNewLabel_1_10)
						.addComponent(lblNewLabel_4_10)
						.addComponent(counter11ausgabe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(summeGeld)
						.addComponent(lblNewLabel_3)
						.addComponent(summeAnzahl))
					.addGap(164))
		);
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		tabbedPane.addTab("exotisch", null, panel_1, null);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 128));
		JLabel summeGeld2 = new JLabel();
		JLabel summeAnzahl2 = new JLabel();

		JButton mangoPlus = new JButton("+");
		JLabel counter12ausgabe = new JLabel();
		mangoPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel mango = new Artikel("Mango", 2.1);
				korb.getEinkaufskorb().add(mango);
				counter12++;
				counter12ausgabe.setText(Integer.toString(counter12));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton mangoMinus = new JButton("-");
		mangoMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Mango")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter12--;
				if (counter12 < 0) {
					counter12 = 0;
				}
				counter12ausgabe.setText(Integer.toString(counter12));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton ananasPlus = new JButton("+");
		JLabel counter13ausgabe = new JLabel();
		ananasPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel ananas = new Artikel("Ananas", 2.5);
				korb.getEinkaufskorb().add(ananas);
				counter13++;
				counter13ausgabe.setText(Integer.toString(counter13));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton ananasMinus = new JButton("-");
		ananasMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Ananas")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter13--;
				if (counter13 < 0) {
					counter13 = 0;
				}
				counter13ausgabe.setText(Integer.toString(counter13));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton litschiPlus = new JButton("+");
		JLabel counter14ausgabe = new JLabel();
		litschiPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel litschi = new Artikel("Litschi", 2.7);
				korb.getEinkaufskorb().add(litschi);
				counter14++;
				counter14ausgabe.setText(Integer.toString(counter14));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton litschiMinus = new JButton("-");
		litschiMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Litschi")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter14--;
				if (counter14 < 0) {
					counter14 = 0;
				}
				counter14ausgabe.setText(Integer.toString(counter14));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kaktusfeigePlus = new JButton("+");
		JLabel counter15ausgabe = new JLabel();
		kaktusfeigePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel kaktusfeige = new Artikel("Kaktusfeige", 2.8);
				korb.getEinkaufskorb().add(kaktusfeige);
				counter15++;
				counter15ausgabe.setText(Integer.toString(counter15));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kaktusfeigeMinus = new JButton("-");
		kaktusfeigeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Kaktusfeige")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter15--;
				if (counter15 < 0) {
					counter15 = 0;
				}
				counter15ausgabe.setText(Integer.toString(counter15));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton drachenfruchtPlus = new JButton("+");
		JLabel counter16ausgabe = new JLabel();
		drachenfruchtPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel drachenfrucht = new Artikel("Drachenfrucht", 3);
				korb.getEinkaufskorb().add(drachenfrucht);
				counter16++;
				counter16ausgabe.setText(Integer.toString(counter16));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton drachenfruchtMinus = new JButton("-");
		drachenfruchtMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Drachenfrucht")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter16--;
				if (counter16 < 0) {
					counter16 = 0;
				}
				counter16ausgabe.setText(Integer.toString(counter16));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton grapefruitPlus = new JButton("+");
		JLabel counter17ausgabe = new JLabel();
		grapefruitPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel grapefruit = new Artikel("Grapefruit", 2.6);
				korb.getEinkaufskorb().add(grapefruit);
				counter17++;
				counter17ausgabe.setText(Integer.toString(counter17));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton grapefruitMinus = new JButton("-");
		grapefruitMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Grapefruit")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter17--;
				if (counter17 < 0) {
					counter17 = 0;
				}
				counter17ausgabe.setText(Integer.toString(counter17));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton papayaPlus = new JButton("+");
		JLabel counter18ausgabe = new JLabel();
		papayaPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel papaya = new Artikel("Papaya", 2.9);
				korb.getEinkaufskorb().add(papaya);
				counter18++;
				counter18ausgabe.setText(Integer.toString(counter18));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton papayaMinus = new JButton("-");
		papayaMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Papaya")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter18--;
				if (counter18 < 0) {
					counter18 = 0;
				}
				counter18ausgabe.setText(Integer.toString(counter18));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton sternfruchtPlus = new JButton("+");
		JLabel counter19ausgabe = new JLabel();
		sternfruchtPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel sternfrucht = new Artikel("Sternfrucht", 3.1);
				korb.getEinkaufskorb().add(sternfrucht);
				counter19++;
				counter19ausgabe.setText(Integer.toString(counter19));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton sternfruchtMinus = new JButton("-");
		sternfruchtMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Sternfrucht")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter19--;
				if (counter19 < 0) {
					counter19 = 0;
				}
				counter19ausgabe.setText(Integer.toString(counter19));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kokosnussPlus = new JButton("+");
		JLabel counter20ausgabe = new JLabel();
		kokosnussPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel kokosnuss = new Artikel("Kokosnuss", 2.9);
				korb.getEinkaufskorb().add(kokosnuss);
				counter20++;
				counter20ausgabe.setText(Integer.toString(counter20));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton kokosnussMinus = new JButton("-");
		kokosnussMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Kokosnuss")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter20--;
				if (counter20 < 0) {
					counter20 = 0;
				}
				counter20ausgabe.setText(Integer.toString(counter20));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton passionsfruchtPlus = new JButton("+");
		JLabel counter21ausgabe = new JLabel();
		passionsfruchtPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel passionsfrucht = new Artikel("Passionsfrucht", 2.5);
				korb.getEinkaufskorb().add(passionsfrucht);
				counter21++;
				counter21ausgabe.setText(Integer.toString(counter21));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton passionsfruchtMinus = new JButton("-");
		passionsfruchtMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Passionsfrucht")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter21--;
				if (counter21 < 0) {
					counter21 = 0;
				}
				counter21ausgabe.setText(Integer.toString(counter21));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton granatapfelPlus = new JButton("+");
		JLabel counter22ausgabe = new JLabel();
		granatapfelPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Artikel granatapfel = new Artikel("Granatapfel", 2.);
				korb.getEinkaufskorb().add(granatapfel);
				counter22++;
				counter22ausgabe.setText(Integer.toString(counter22));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JButton granatapfelMinus = new JButton("-");
		granatapfelMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
					if (korb.getEinkaufskorb().get(i).getName().equals("Granatapfel")) {
						korb.getEinkaufskorb().remove(i);
						break;
					}
				}
				counter22--;
				if (counter22 < 0) {
					counter22 = 0;
				}
				counter22ausgabe.setText(Integer.toString(counter22));
				summeGeld2.setText(price(korb.getEinkaufskorb()));
				summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			}
		});

		JLabel lblNewLabel_1_10_1 = new JLabel("Granatapfel");

		JLabel lblNewLabel_1_9_1 = new JLabel("Passionsfrucht");

		JLabel lblNewLabel_1_8_1 = new JLabel("Kokosnuss");

		JLabel lblNewLabel_1_7_1 = new JLabel("Sternfrucht");

		JLabel lblNewLabel_1_4_1 = new JLabel("Drachenfrucht");

		JLabel lblNewLabel_1_3_1 = new JLabel("Kaktusfeige");

		JLabel lblNewLabel_1_2_1 = new JLabel("Litschi");

		JLabel lblNewLabel_1_1_1 = new JLabel("Ananas");

		JLabel lblNewLabel_1_6 = new JLabel("Mango");

		JLabel lblNewLabel_1_11_1 = new JLabel("Papaya");

		JLabel lblNewLabel_1_5_1 = new JLabel("Grapefruit");

		JLabel lblNewLabel_4_10_1 = new JLabel("2.60");

		JLabel lblNewLabel_4_9_1 = new JLabel("2.50");

		JLabel lblNewLabel_4_8_1 = new JLabel("2.90");

		JLabel lblNewLabel_4_7_1 = new JLabel("3.10");

		JLabel lblNewLabel_4_6_1 = new JLabel("2.90");

		JLabel lblNewLabel_4_5_1 = new JLabel("2.60");

		JLabel lblNewLabel_4_4_1 = new JLabel("3.00");

		JLabel lblNewLabel_4_3_1 = new JLabel("2.80");

		JLabel lblNewLabel_4_2_1 = new JLabel("2.70");

		JLabel lblNewLabel_4_1_2 = new JLabel("2.50");

		JLabel lblNewLabel_4_1_1_1 = new JLabel("2.10");

		JLabel lblNewLabel_2_1 = new JLabel("_______________________________________________________");

		JLabel lblNewLabel_3_1 = new JLabel("Summe (Preis in €/250g):");

		JLabel summeGeld_1 = new JLabel();

		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3
				.setHorizontalGroup(gl_panel_3
						.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3.createSequentialGroup()
								.addContainerGap().addGroup(gl_panel_3
										.createParallelGroup(Alignment.LEADING).addGroup(
												gl_panel_3.createSequentialGroup()
														.addComponent(granatapfelPlus, GroupLayout.PREFERRED_SIZE, 50,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED).addComponent(
																granatapfelMinus, GroupLayout.PREFERRED_SIZE, 39,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																ComponentPlacement.UNRELATED)
														.addComponent(lblNewLabel_1_10_1, GroupLayout.PREFERRED_SIZE,
																83, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_3.createSequentialGroup().addGroup(gl_panel_3
												.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(mangoPlus, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(ananasPlus, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(litschiPlus, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(kaktusfeigePlus, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(drachenfruchtPlus, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(grapefruitPlus, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(sternfruchtPlus, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(kokosnussPlus, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(passionsfruchtPlus, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
												.addComponent(
														papayaPlus, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel_3.createSequentialGroup()
																.addComponent(passionsfruchtMinus,
																		GroupLayout.PREFERRED_SIZE, 39,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNewLabel_1_9_1,
																		GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
														.addGroup(gl_panel_3.createSequentialGroup()
																.addComponent(kokosnussMinus,
																		GroupLayout.PREFERRED_SIZE, 39,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNewLabel_1_8_1,
																		GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
														.addGroup(
																gl_panel_3.createSequentialGroup()
																		.addComponent(sternfruchtMinus,
																				GroupLayout.PREFERRED_SIZE, 39,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.UNRELATED)
																		.addComponent(lblNewLabel_1_7_1,
																				GroupLayout.DEFAULT_SIZE, 100,
																				Short.MAX_VALUE))
														.addGroup(gl_panel_3.createSequentialGroup()
																.addComponent(litschiMinus, GroupLayout.PREFERRED_SIZE,
																		39, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNewLabel_1_2_1,
																		GroupLayout.PREFERRED_SIZE, 45,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel_3.createSequentialGroup()
																.addComponent(ananasMinus, GroupLayout.PREFERRED_SIZE,
																		39, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(lblNewLabel_1_1_1,
																		GroupLayout.PREFERRED_SIZE, 45,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel_3.createSequentialGroup().addComponent(
																mangoMinus, GroupLayout.PREFERRED_SIZE, 39,
																GroupLayout.PREFERRED_SIZE).addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		lblNewLabel_1_6, GroupLayout.PREFERRED_SIZE, 45,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel_3
																.createSequentialGroup().addGroup(gl_panel_3
																		.createParallelGroup(Alignment.TRAILING)
																		.addComponent(papayaMinus,
																				GroupLayout.PREFERRED_SIZE, 39,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				grapefruitMinus,
																				GroupLayout.PREFERRED_SIZE, 39,
																				GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addGroup(gl_panel_3.createParallelGroup(
																		Alignment.LEADING)
																		.addComponent(lblNewLabel_1_5_1,
																				GroupLayout.DEFAULT_SIZE, 100,
																				Short.MAX_VALUE)
																		.addComponent(
																				lblNewLabel_1_11_1,
																				GroupLayout.PREFERRED_SIZE, 100,
																				GroupLayout.PREFERRED_SIZE)))
														.addGroup(gl_panel_3.createSequentialGroup()
																.addGroup(gl_panel_3
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(kaktusfeigeMinus,
																				GroupLayout.PREFERRED_SIZE, 39,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(drachenfruchtMinus,
																				GroupLayout.PREFERRED_SIZE, 39,
																				GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addGroup(gl_panel_3
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblNewLabel_1_3_1,
																				GroupLayout.PREFERRED_SIZE, 71,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblNewLabel_1_4_1,
																				GroupLayout.DEFAULT_SIZE, 100,
																				Short.MAX_VALUE))))))
								.addGap(465)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_10_1, GroupLayout.PREFERRED_SIZE,
																45, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter22ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_9_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter21ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_8_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter20ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_7_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter19ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_6_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter18ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_5_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter17ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_4_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter16ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_3_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter15ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_2_1, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter14ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel_3.createSequentialGroup()
														.addComponent(lblNewLabel_4_1_2, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(counter13ausgabe, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addGap(129)))
										.addGroup(gl_panel_3.createSequentialGroup()
												.addComponent(lblNewLabel_4_1_1_1, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(counter12ausgabe, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)))
								.addGap(360))
						.addGroup(
								gl_panel_3.createSequentialGroup().addGap(306)
										.addComponent(summeGeld_1, GroupLayout.PREFERRED_SIZE, 45,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(914, Short.MAX_VALUE))
						.addGroup(gl_panel_3.createSequentialGroup().addGap(499)
								.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 427,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING,
								gl_panel_3.createSequentialGroup().addContainerGap(670, Short.MAX_VALUE)
										.addComponent(summeGeld2, GroupLayout.PREFERRED_SIZE, 45,
												GroupLayout.PREFERRED_SIZE)
										.addGap(550))
						.addGroup(
								Alignment.TRAILING, gl_panel_3.createSequentialGroup()
										.addContainerGap(720, Short.MAX_VALUE).addComponent(summeAnzahl2,
												GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addGap(500)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(29)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(mangoPlus)
								.addComponent(lblNewLabel_4_1_1_1).addComponent(mangoMinus)
								.addComponent(lblNewLabel_1_6).addComponent(counter12ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(ananasPlus)
								.addComponent(lblNewLabel_4_1_2).addComponent(ananasMinus)
								.addComponent(lblNewLabel_1_1_1).addComponent(counter13ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(litschiPlus)
								.addComponent(lblNewLabel_4_2_1).addComponent(litschiMinus)
								.addComponent(lblNewLabel_1_2_1).addComponent(counter14ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(kaktusfeigePlus)
								.addComponent(lblNewLabel_4_3_1).addComponent(kaktusfeigeMinus)
								.addComponent(lblNewLabel_1_3_1).addComponent(counter15ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(drachenfruchtPlus)
								.addComponent(lblNewLabel_4_4_1).addComponent(drachenfruchtMinus)
								.addComponent(lblNewLabel_1_4_1).addComponent(counter16ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(grapefruitPlus)
								.addComponent(lblNewLabel_4_5_1).addComponent(grapefruitMinus)
								.addComponent(lblNewLabel_1_5_1).addComponent(counter17ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4_6_1)
								.addComponent(lblNewLabel_1_11_1).addComponent(papayaMinus).addComponent(papayaPlus)
								.addComponent(counter18ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(sternfruchtPlus)
								.addComponent(sternfruchtMinus).addComponent(lblNewLabel_1_7_1)
								.addComponent(lblNewLabel_4_7_1).addComponent(counter19ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(kokosnussPlus)
								.addComponent(kokosnussMinus).addComponent(lblNewLabel_1_8_1)
								.addComponent(lblNewLabel_4_8_1).addComponent(counter20ausgabe))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(summeGeld_1, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_3.createSequentialGroup()
										.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
												.addComponent(passionsfruchtPlus).addComponent(passionsfruchtMinus)
												.addComponent(lblNewLabel_1_9_1).addComponent(lblNewLabel_4_9_1)
												.addComponent(counter21ausgabe))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_4_10_1).addComponent(granatapfelPlus)
												.addComponent(granatapfelMinus).addComponent(lblNewLabel_1_10_1)
												.addComponent(counter22ausgabe))
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel_2_1)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
												.addComponent(summeAnzahl2).addComponent(summeGeld2)
												.addComponent(lblNewLabel_3_1))))
						.addContainerGap(84, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 912, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 128));
		tabbedPane.addTab("Sonstiges", null, panel_2, null);

		JLabel summePreis3 = new JLabel();
		JCheckBox grusskarteBox = new JCheckBox("Grußkarte");
		grusskarteBox.setBackground(new Color(255, 255, 128));
		JCheckBox obstschaelerBox = new JCheckBox("Obstschäler");
		obstschaelerBox.setBackground(new Color(255, 255, 128));
		JCheckBox obstkorbBox = new JCheckBox("Obstkorb");
		obstkorbBox.setBackground(new Color(255, 255, 128));
		JCheckBox entsafterBox = new JCheckBox("Entsafter");
		entsafterBox.setBackground(new Color(255, 255, 128));
		JCheckBox smoothieMakerBox = new JCheckBox("Smoothie-Maker");
		smoothieMakerBox.setBackground(new Color(255, 255, 128));
		ButtonGroup sonstiges = new ButtonGroup();
		sonstiges.add(smoothieMakerBox);
		sonstiges.add(entsafterBox);
		sonstiges.add(obstkorbBox);
		sonstiges.add(obstschaelerBox);
		sonstiges.add(grusskarteBox);
		JButton sonstigesHinzufuegen = new JButton("Auswahl dem Warenkorb hinzufügen");
		sonstigesHinzufuegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (smoothieMakerBox.isSelected()) {
					Artikel smoothieMaker = new Artikel("Smoothie-Maker", 25);
					korb.getEinkaufskorb().add(smoothieMaker);
				} else if (entsafterBox.isSelected()) {
					Artikel entsafter = new Artikel("Entsafter", 30);
					korb.getEinkaufskorb().add(entsafter);
				} else if (obstkorbBox.isSelected()) {
					Artikel obstkorb = new Artikel("Obstkorb", 7);
					korb.getEinkaufskorb().add(obstkorb);
				} else if (obstschaelerBox.isSelected()) {
					Artikel obstschaeler = new Artikel("Obstschäler", 3);
					korb.getEinkaufskorb().add(obstschaeler);
				} else if (grusskarteBox.isSelected()) {
					Artikel grusskarte = new Artikel("Grußkarte", 1);
					korb.getEinkaufskorb().add(grusskarte);
				}
				summePreis3.setText(price(korb.getEinkaufskorb()));
			}

		});
		JButton auswahlEntfernen = new JButton("Auswahl vom Warenkorb entfernen");
		auswahlEntfernen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (smoothieMakerBox.isSelected()) {
					for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
						if (korb.getEinkaufskorb().get(i).getName().equals("Smoothie-Maker")) {
							korb.getEinkaufskorb().remove(i);
							break;
						}
					}
				} else if (entsafterBox.isSelected()) {
					for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
						if (korb.getEinkaufskorb().get(i).getName().equals("Entsafter")) {
							korb.getEinkaufskorb().remove(i);
							break;
						}
					}
				} else if (obstkorbBox.isSelected()) {
					for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
						if (korb.getEinkaufskorb().get(i).getName().equals("Obstkorb")) {
							korb.getEinkaufskorb().remove(i);
							break;
						}
					}
				} else if (obstschaelerBox.isSelected()) {
					for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
						if (korb.getEinkaufskorb().get(i).getName().equals("Obstschäler")) {
							korb.getEinkaufskorb().remove(i);
							break;
						}
					}
				} else if (grusskarteBox.isSelected()) {
					for (int i = 0; i < korb.getEinkaufskorb().size(); i++) {
						if (korb.getEinkaufskorb().get(i).getName().equals("Grußkarte")) {
							korb.getEinkaufskorb().remove(i);
							break;
						}
					}
				}
				summePreis3.setText(price(korb.getEinkaufskorb()));
			}

		});

		JLabel lblNewLabel_5 = new JLabel("Preis in €");

		JLabel lblNewLabel_6 = new JLabel("25.00");

		JLabel lblNewLabel_6_1 = new JLabel("30.00");

		JLabel lblNewLabel_6_2 = new JLabel("7.00");

		JLabel lblNewLabel_6_3 = new JLabel("3.00");

		JLabel lblNewLabel_6_4 = new JLabel("1.00");

		JLabel lblNewLabel_2_1_1 = new JLabel("______________________________________________");

		JLabel lblNewLabel_3_1_1 = new JLabel("Summe:");

		JButton btnNewButton_10 = new JButton("Weiter");
		btnNewButton_10.addActionListener(a -> {
												this.frame.setVisible(false);
												new Auswahlfenster(this);
		});
		
		JButton loeschen_1 = new JButton("Einkaufskorb leeren");
		loeschen_1.addActionListener(a -> {
			korb.getEinkaufskorb().clear();
			summeAnzahl.setText(Integer.toString(korb.getEinkaufskorb().size()));
			summeAnzahl2.setText(Integer.toString(korb.getEinkaufskorb().size()));
			counter1 = 0;
			counter1ausgabe.setText("");
			counter2 = 0;
			counter2ausgabe.setText("");
			counter3 = 0;
			counter3ausgabe.setText("");
			counter4 = 0;
			counter4ausgabe.setText("");
			counter5 = 0;
			counter5ausgabe.setText("");
			counter6 = 0;
			counter6ausgabe.setText("");
			counter7 = 0;
			counter7ausgabe.setText("");
			counter8 = 0;
			counter8ausgabe.setText("");
			counter9 = 0;
			counter9ausgabe.setText("");
			counter10 = 0;
			counter10ausgabe.setText("");
			counter11 = 0;
			counter11ausgabe.setText("");
			counter12 = 0;
			counter12ausgabe.setText("");
			counter13 = 0;
			counter13ausgabe.setText("");
			counter14 = 0;
			counter14ausgabe.setText("");
			counter15 = 0;
			counter15ausgabe.setText("");
			counter16 = 0;
			counter16ausgabe.setText("");
			counter17 = 0;
			counter17ausgabe.setText("");
			counter18 = 0;
			counter18ausgabe.setText("");
			counter19 = 0;
			counter19ausgabe.setText("");
			counter20 = 0;
			counter20ausgabe.setText("");
			counter21 = 0;
			counter21ausgabe.setText("");
			counter22 = 0;
			counter22ausgabe.setText("");
			summeGeld.setText(price(korb.getEinkaufskorb()));
			summeGeld2.setText(price(korb.getEinkaufskorb()));
			summePreis3.setText(price(korb.getEinkaufskorb()));
		
		});

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(703, Short.MAX_VALUE)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(82))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(637, Short.MAX_VALUE)
					.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addGap(52))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(loeschen_1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
									.addComponent(grusskarteBox, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(obstkorbBox, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(entsafterBox, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addComponent(smoothieMakerBox, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
									.addComponent(obstschaelerBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 559, Short.MAX_VALUE)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_6_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_6_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_6_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGap(93))
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
									.addComponent(auswahlEntfernen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
									.addComponent(sonstigesHinzufuegen, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
								.addGap(314)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_2.createSequentialGroup()
										.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addGap(86)
										.addComponent(summePreis3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addComponent(lblNewLabel_2_1_1))
								.addContainerGap()))))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5)
					.addGap(1)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(smoothieMakerBox))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6_1)
						.addComponent(entsafterBox))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6_2)
						.addComponent(obstkorbBox))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6_3)
						.addComponent(obstschaelerBox))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6_4)
						.addComponent(grusskarteBox))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1_1)
						.addComponent(summePreis3)
						.addComponent(sonstigesHinzufuegen))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(auswahlEntfernen)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(loeschen_1)
					.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
					.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(71))
		);
		panel_2.setLayout(gl_panel_2);
		frame.getContentPane().setLayout(groupLayout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
