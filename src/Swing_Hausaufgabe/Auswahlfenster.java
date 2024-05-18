package Swing_Hausaufgabe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class Auswahlfenster {

	private JFrame frame;
	private JTextField grusKarte;
	private Bestellfenster bestellfenster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auswahlfenster window = new Auswahlfenster();
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
	public Auswahlfenster(Bestellfenster bestellfenster) {
		this.bestellfenster = bestellfenster;
		initialize();
	}
	
	public Auswahlfenster() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setBounds(470, 10, 640, 750);
		frame.setResizable(false);
		frame.setTitle("Ihre Auswahl");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());
		frame.setVisible(true);
		

		JButton btnNewButton = new JButton("Bestellung ändern");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				bestellfenster.getFrame().setVisible(true);
			}

		});

		JButton btnNewButton_1 = new JButton("Weiter zum Bezahlen");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new PersoenlicheAngabenFenster();
			}
		});

		JLabel lblNewLabel = new JLabel("Versand:");

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard (3-5 Werktage)");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 128));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersoenlicheAngabenFenster.kunde.setVersand(false);
			}

		});

		JRadioButton rdbtnPremiuminDen = new JRadioButton("Premium (in den nächsten 24h) + 3€");
		rdbtnPremiuminDen.setBackground(new Color(255, 255, 128));
		rdbtnPremiuminDen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersoenlicheAngabenFenster.kunde.setVersand(true);
			}

		});
		ButtonGroup versand = new ButtonGroup();
		versand.add(rdbtnPremiuminDen);
		versand.add(rdbtnNewRadioButton);

		JLabel lblNewLabel_1 = new JLabel("Auswahl:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		JLabel inhaltKorb = new JLabel("New label");

		inhaltKorb.setText(null);
		double sum = 0;
		for (int i = 0; i < Bestellfenster.korb.getEinkaufskorb().size(); i++) {
			sum += Bestellfenster.korb.getEinkaufskorb().get(i).getPreis();
		}
		sum = Math.round(sum * 100) / 100.00;
		

		JLabel gesamtsumme = new JLabel("Gesamtsumme: " + sum + "€");

		JLabel gesamtGewicht = new JLabel(
				"Gesamtewicht: " + (Bestellfenster.korb.getEinkaufskorb().size() * 250) + "g");

		int counterApfel = 0;
		int counterKirsche = 0;
		int counterBirne = 0;
		int counterKiwi = 0;
		int counterBanane = 0;
		int counterPfirsich = 0;
		int counterTrauben = 0;
		int counterErdbeere = 0;
		int counterHimbeere = 0;
		int counterOrange = 0;
		int counterPflaume = 0;

		int counterMango = 0;
		int counterAnanas = 0;
		int counterLitschi = 0;
		int counterKaktusfeige = 0;
		int counterDrachenfrucht = 0;
		int counterGrapefruit = 0;
		int counterPapaya = 0;
		int counterSternfrucht = 0;
		int counterKokosnuss = 0;
		int counterPassionsfrucht = 0;
		int counterGranatapfel = 0;

		int counterSmoothieMaker = 0;
		int counterEntsafter = 0;
		int counterObstkorb = 0;
		int counterSchaeler = 0;
		int counterKarte = 0;
		for (int i = 0; i < Bestellfenster.korb.getEinkaufskorb().size(); i++) {
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Apfel")) {
				counterApfel++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Kirsche")) {
				counterKirsche++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Birne")) {
				counterBirne++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Kiwi")) {
				counterKiwi++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Banane")) {
				counterBanane++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Pfirsich")) {
				counterPfirsich++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Traube")) {
				counterTrauben++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Erdbeere")) {
				counterErdbeere++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Himbeere")) {
				counterHimbeere++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Orange")) {
				counterOrange++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Pflaume")) {
				counterPflaume++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Mango")) {
				counterMango++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Ananas")) {
				counterAnanas++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Litschi")) {
				counterLitschi++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Kaktusfeige")) {
				counterKaktusfeige++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Drachenfrucht")) {
				counterDrachenfrucht++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Grapefruit")) {
				counterGrapefruit++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Papaya")) {
				counterPapaya++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Sternfrucht")) {
				counterSternfrucht++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Kokosnuss")) {
				counterKokosnuss++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Passionsfrucht")) {
				counterPassionsfrucht++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Granatapfel")) {
				counterGranatapfel++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Smoothie-Maker")) {
				counterSmoothieMaker++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Entsafter")) {
				counterEntsafter++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Obstkorb")) {
				counterObstkorb++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Obstschäler")) {
				counterSchaeler++;
			}
			if (Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Grußkarte")) {
				counterKarte++;
			}
		}

		JLabel apfel = new JLabel("Apfel:");
		JLabel apfelAnzahl = new JLabel("New label");
		apfelAnzahl.setText(counterApfel + "x");
		if (counterApfel != 0) {
			apfel.setForeground(Color.GREEN);
			apfelAnzahl.setForeground(Color.GREEN);
		}
		
		JLabel birne = new JLabel("Birne:");
		JLabel birneAnzahl = new JLabel("New label");
		birneAnzahl.setText(counterBirne + "x");
		if (counterBirne != 0) {
			birne.setForeground(Color.GREEN);
			birneAnzahl.setForeground(Color.GREEN);
		}

		JLabel kirsche = new JLabel("Kirsche:");
		JLabel kirscheAnzahl = new JLabel("New label");
		kirscheAnzahl.setText(counterKirsche + "x");
		if (counterKirsche != 0) {
			kirsche.setForeground(Color.GREEN);
			kirscheAnzahl.setForeground(Color.GREEN);
		}

		JLabel kiwi = new JLabel("Kiwi:");
		JLabel kiwiAnzahl = new JLabel("New label");
		kiwiAnzahl.setText(counterKiwi + "x");
		if (counterKiwi != 0) {
			kiwi.setForeground(Color.GREEN);
			kiwiAnzahl.setForeground(Color.GREEN);
		}

		JLabel banane = new JLabel("Banane:");
		JLabel bananeAnzahl = new JLabel("New label");
		bananeAnzahl.setText(counterBanane + "x");
		if (counterBanane != 0) {
			banane.setForeground(Color.GREEN);
			bananeAnzahl.setForeground(Color.GREEN);
		}

		JLabel pfirsich = new JLabel("Pfirsich:");
		JLabel pfirsichAnzahl = new JLabel("New label");
		pfirsichAnzahl.setText(counterPfirsich + "x");
		if (counterPfirsich != 0) {
			pfirsich.setForeground(Color.GREEN);
			pfirsichAnzahl.setForeground(Color.GREEN);
		}

		JLabel weintrauben = new JLabel("Trauben:");
		JLabel traubenAnzahl = new JLabel("New label");
		traubenAnzahl.setText(counterTrauben + "x");
		if (counterTrauben != 0) {
			weintrauben.setForeground(Color.GREEN);
			traubenAnzahl.setForeground(Color.GREEN);
		}

		JLabel erdbeere = new JLabel("Erdbeere:");
		JLabel erdbeereAnzahl = new JLabel("New label");
		erdbeereAnzahl.setText(counterErdbeere + "x");
		if (counterErdbeere != 0) {
			erdbeere.setForeground(Color.GREEN);
			erdbeereAnzahl.setForeground(Color.GREEN);
		}

		JLabel himbeere = new JLabel("Himbeere:");
		JLabel himbeereAnzahl = new JLabel("h");
		himbeereAnzahl.setText(counterHimbeere + "x");
		if (counterHimbeere != 0) {
			himbeere.setForeground(Color.GREEN);
			himbeereAnzahl.setForeground(Color.GREEN);
		}

		JLabel orange = new JLabel("Orange:");
		JLabel orangeAnzahl = new JLabel("New label");
		orangeAnzahl.setText(counterOrange + "x");
		if (counterOrange != 0) {
			orange.setForeground(Color.GREEN);
			orangeAnzahl.setForeground(Color.GREEN);
		}

		JLabel pflaume = new JLabel("Pflaume:");
		JLabel pflaumeAnzahl = new JLabel("New label");
		pflaumeAnzahl.setText(counterPflaume + "x");
		if (counterPflaume != 0) {
			pflaume.setForeground(Color.GREEN);
			pflaumeAnzahl.setForeground(Color.GREEN);
		}

		JLabel mango = new JLabel("Mango:");
		JLabel mangoAnzahl = new JLabel("New label");
		mangoAnzahl.setText(counterMango + "x");
		if (counterMango != 0) {
			mango.setForeground(Color.GREEN);
			mangoAnzahl.setForeground(Color.GREEN);
		}

		JLabel ananas = new JLabel("Ananas:");
		JLabel ananasAnzahl = new JLabel("New label");
		ananasAnzahl.setText(counterAnanas + "x");
		if (counterAnanas != 0) {
			ananas.setForeground(Color.GREEN);
			ananasAnzahl.setForeground(Color.GREEN);
		}

		JLabel litschi = new JLabel("Litschi:");
		JLabel litschiAnzahl = new JLabel("New label");
		litschiAnzahl.setText(counterLitschi + "x");
		if (counterLitschi != 0) {
			litschi.setForeground(Color.GREEN);
			litschiAnzahl.setForeground(Color.GREEN);
		}

		JLabel kaktusfeige = new JLabel("Kaktusfeige:");
		JLabel kaktusfeigeAnzahl = new JLabel("New label");
		kaktusfeigeAnzahl.setText(counterKaktusfeige + "x");
		if (counterKaktusfeige != 0) {
			kaktusfeige.setForeground(Color.GREEN);
			kaktusfeigeAnzahl.setForeground(Color.GREEN);
		}

		JLabel drachenfrucht = new JLabel("Drachenfrucht:");
		JLabel drachenfruchtAnzahl = new JLabel("New label");
		drachenfruchtAnzahl.setText(counterDrachenfrucht + "x");
		if (counterDrachenfrucht != 0) {
			drachenfrucht.setForeground(Color.GREEN);
			drachenfruchtAnzahl.setForeground(Color.GREEN);
		}

		JLabel grapefruit = new JLabel("Grapefruit:");
		JLabel grapefruitAnzahl = new JLabel("New label");
		grapefruitAnzahl.setText(counterGrapefruit + "x");
		if (counterGrapefruit != 0) {
			grapefruit.setForeground(Color.GREEN);
			grapefruitAnzahl.setForeground(Color.GREEN);
		}

		JLabel papaya = new JLabel("Papaya:");
		JLabel papayaAnzahl = new JLabel("New label");
		papayaAnzahl.setText(counterPapaya + "x");
		if (counterPapaya != 0) {
			papaya.setForeground(Color.GREEN);
			papayaAnzahl.setForeground(Color.GREEN);
		}

		JLabel sternfrucht = new JLabel("Sternfrucht:");
		JLabel sternfruchtAnzahl = new JLabel("New label");
		sternfruchtAnzahl.setText(counterSternfrucht + "x");
		if (counterSternfrucht != 0) {
			sternfrucht.setForeground(Color.GREEN);
			sternfruchtAnzahl.setForeground(Color.GREEN);
		}

		JLabel kokosnuss = new JLabel("Kokosnuss:");
		JLabel kokosAnzahl = new JLabel("New label");
		kokosAnzahl.setText(counterKokosnuss + "x");
		if (counterKokosnuss != 0) {
			kokosnuss.setForeground(Color.GREEN);
			kokosAnzahl.setForeground(Color.GREEN);
		}

		JLabel passionsfrucht = new JLabel("Passionsfrucht:");
		JLabel passionsAnzahl = new JLabel("New label");
		passionsAnzahl.setText(counterPassionsfrucht + "x");
		if (counterPassionsfrucht != 0) {
			passionsfrucht.setForeground(Color.GREEN);
			passionsAnzahl.setForeground(Color.GREEN);
		}

		JLabel granatapfel = new JLabel("Granatapfel:");
		JLabel granatAnzahl = new JLabel("New label");
		granatAnzahl.setText(counterGranatapfel + "x");
		if (counterGranatapfel != 0) {
			granatapfel.setForeground(Color.GREEN);
			granatAnzahl.setForeground(Color.GREEN);
		}

		JLabel smoothieMaker = new JLabel("Smoothie-Maker:");
		JLabel smAnzahl = new JLabel("New label");
		smAnzahl.setText(counterSmoothieMaker + "x");
		if (counterSmoothieMaker != 0) {
			smoothieMaker.setForeground(Color.GREEN);
			smAnzahl.setForeground(Color.GREEN);
		}

		JLabel entsafter = new JLabel("Entsafter:");
		JLabel entsafterAnzahl = new JLabel("New label");
		entsafterAnzahl.setText(counterEntsafter + "x");
		if (counterEntsafter != 0) {
			entsafter.setForeground(Color.GREEN);
			entsafterAnzahl.setForeground(Color.GREEN);
		}
		
		JLabel obstkorb = new JLabel("Obstkorb:");
		JLabel obstkorbAnzahl = new JLabel("New label");
		obstkorbAnzahl.setText(counterObstkorb + "x");
		if (counterObstkorb != 0) {
			obstkorb.setForeground(Color.GREEN);
			obstkorbAnzahl.setForeground(Color.GREEN);
		}
		
		JLabel schaeler = new JLabel("Obstschäler:");
		JLabel schaelerAnzahl = new JLabel("New label");
		schaelerAnzahl.setText(counterSchaeler + "x");
		if (counterSchaeler != 0) {
			schaeler.setForeground(Color.GREEN);
			schaelerAnzahl.setForeground(Color.GREEN);
		}
		
		JLabel grusskarte = new JLabel("Grußkarte");
		JLabel grusskarteAnzahl = new JLabel("New label");
		grusskarteAnzahl.setText(counterKarte + "x");
		if (counterKarte != 0) {
			grusskarte.setForeground(Color.GREEN);
			grusskarteAnzahl.setForeground(Color.GREEN);
		}
		
		JLabel lblNewLabel_2 = new JLabel("_______________________________________________________________________________________");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		grusKarte = new JTextField();
		grusKarte.setColumns(10);
		
		JLabel gruss = new JLabel("Platz für einen kurzen Persönlichen Gruß für ihre Karte:");
		gruss.setHorizontalAlignment(SwingConstants.LEFT);
		for(int i = 0; i< Bestellfenster.korb.getEinkaufskorb().size(); i++) {
			if(Bestellfenster.korb.getEinkaufskorb().get(i).getName().equals("Grußkarte")) {
				grusKarte.setVisible(true);
				gruss.setVisible(true);
			}else if(Bestellfenster.korb.getEinkaufskorb().isEmpty()) {
				grusKarte.setVisible(false);
				gruss.setVisible(false);
			}else {
				grusKarte.setVisible(false);
				gruss.setVisible(false);
			}
		}
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(inhaltKorb, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(571, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(apfel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(apfelAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(pflaume, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pflaumeAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(orange, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(orangeAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(himbeere, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(erdbeere, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(birne, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(kirsche, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(kirscheAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(birneAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(himbeereAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(erdbeereAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(weintrauben, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pfirsich, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(banane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addComponent(traubenAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addComponent(pfirsichAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(bananeAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(kiwi, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(kiwiAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(mango, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ananas, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(litschi, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(granatapfel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(papaya, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sternfrucht, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(kokosnuss, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(passionsfrucht, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(grapefruit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(drachenfrucht, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(kaktusfeige, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(20)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(drachenfruchtAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(passionsAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(kokosAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(papayaAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(sternfruchtAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(granatAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(grapefruitAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(litschiAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(kaktusfeigeAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(ananasAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(mangoAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(smoothieMaker, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(entsafter, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(obstkorb, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(schaeler, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(grusskarte, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(entsafterAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(smAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(obstkorbAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(schaelerAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(grusskarteAnzahl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(184))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
									.addComponent(btnNewButton_1)))
							.addGap(22))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(grusKarte, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(gesamtsumme, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnPremiuminDen, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
								.addComponent(gesamtGewicht, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
							.addGap(215))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(149)
					.addComponent(gruss, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(156, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inhaltKorb)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(apfel)
						.addComponent(apfelAnzahl, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addComponent(mango)
						.addComponent(mangoAnzahl)
						.addComponent(smoothieMaker)
						.addComponent(smAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(birne)
						.addComponent(birneAnzahl)
						.addComponent(ananas)
						.addComponent(ananasAnzahl)
						.addComponent(entsafter)
						.addComponent(entsafterAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(kirsche)
						.addComponent(kirscheAnzahl)
						.addComponent(litschi)
						.addComponent(litschiAnzahl)
						.addComponent(obstkorb)
						.addComponent(obstkorbAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(kiwi)
						.addComponent(kiwiAnzahl)
						.addComponent(kaktusfeige)
						.addComponent(kaktusfeigeAnzahl)
						.addComponent(schaeler)
						.addComponent(schaelerAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(banane)
						.addComponent(bananeAnzahl)
						.addComponent(drachenfrucht)
						.addComponent(drachenfruchtAnzahl)
						.addComponent(grusskarte)
						.addComponent(grusskarteAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(pfirsich)
						.addComponent(pfirsichAnzahl)
						.addComponent(grapefruit)
						.addComponent(grapefruitAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(weintrauben)
						.addComponent(traubenAnzahl)
						.addComponent(papaya)
						.addComponent(papayaAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(erdbeere)
						.addComponent(erdbeereAnzahl)
						.addComponent(sternfrucht)
						.addComponent(sternfruchtAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(himbeere)
						.addComponent(himbeereAnzahl)
						.addComponent(kokosnuss)
						.addComponent(kokosAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(orange)
						.addComponent(orangeAnzahl)
						.addComponent(passionsfrucht)
						.addComponent(passionsAnzahl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(pflaume)
						.addComponent(pflaumeAnzahl)
						.addComponent(granatapfel)
						.addComponent(granatAnzahl))
					.addGap(44)
					.addComponent(lblNewLabel_2)
					.addGap(53)
					.addComponent(gruss)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(grusKarte, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(gesamtGewicht)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(gesamtsumme)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(rdbtnNewRadioButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnPremiuminDen)
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
