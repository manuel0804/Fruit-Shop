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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class AbschlussFenster {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbschlussFenster window = new AbschlussFenster();
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
	public AbschlussFenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.setBounds(470, 150, 640, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		ImageIcon image = new ImageIcon("Apfel.jpg");
		frame.setIconImage(image.getImage());
		frame.setTitle("Bestellung abgeschlossen");

		JLabel danke = new JLabel();
		danke.setFont(new Font("Tahoma", Font.PLAIN, 17));
		danke.setHorizontalAlignment(SwingConstants.LEFT);
		danke.setText("Vielen Dank " + PersoenlicheAngabenFenster.kunde.getGeschlecht() + " "
				+ PersoenlicheAngabenFenster.kunde.getVorname() + " " + PersoenlicheAngabenFenster.kunde.getNachname()
				+ " für Ihre Bestellung bei HolmYFruitS !");

		String a;
		if (PersoenlicheAngabenFenster.kunde.isVersand()) {
			a = "Premium-Express";
		} else {
			a = "Standard-Express";
		}

		JLabel lblNewLabel = new JLabel(
				"Ihre Bestellung wir bearbeitet und per " + a + " zur " + PersoenlicheAngabenFenster.kunde.getStrasse()
						+ PersoenlicheAngabenFenster.kunde.getHausnummer() + " versand.");

		JLabel lblNewLabel_1 = new JLabel(
				"Weitere Details sowie Rechnung und Versandbestätigung folgen in Kürze per Mail an:");

		JLabel lblNewLabel_2 = new JLabel("Bestellübersicht:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnNewButton = new JButton("Beenden");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		JLabel lblNewLabel_3 = new JLabel("Preis:");
		double sum = 0;
		for (int i = 0; i < Bestellfenster.korb.getEinkaufskorb().size(); i++) {
			sum += Bestellfenster.korb.getEinkaufskorb().get(i).getPreis();
		}
		sum = Math.round(sum * 100) / 100.00;
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setText(sum + " €");

		JLabel lblNewLabel_5 = new JLabel("Gewicht:");

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setText((Bestellfenster.korb.getEinkaufskorb().size() * 250) + " g");

		JLabel lblNewLabel_7 = new JLabel("Artikel:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));

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

		JLabel grusskarte = new JLabel("Grußkarte:");
		JLabel grusskarteAnzahl = new JLabel("New label");
		grusskarteAnzahl.setText(counterKarte + "x");
		if (counterKarte != 0) {
			grusskarte.setForeground(Color.GREEN);
			grusskarteAnzahl.setForeground(Color.GREEN);
		}

		JLabel lblNewLabel_8 = new JLabel();
		if (PersoenlicheAngabenFenster.kunde.isVersand() == true) {
			lblNewLabel_8.setText("(+3€ Versand)");
		}

		JLabel lblNewLabel_9 = new JLabel("Der Betrag wird in Kürze abgebucht.");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel mail = new JLabel("New label");
		mail.setText(PersoenlicheAngabenFenster.kunde.getEmail());

		JLabel lblNewLabel_10 = new JLabel("Vielen Dank und guten Appetit!");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(danke, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 606,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 606,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE))
										.addGap(9)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 43,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 85,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 531,
														Short.MAX_VALUE)))
								.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(kirsche, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(kirscheAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(birne, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(birneAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(kiwi, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(kiwiAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(banane, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(bananeAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(pfirsich, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(pfirsichAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(weintrauben, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(traubenAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(erdbeere, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(erdbeereAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(himbeere, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(himbeereAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(orange, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(orangeAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(pflaume, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(pflaumeAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(apfel, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(apfelAnzahl,
														GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
										.addGap(47)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(granatapfel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(passionsfrucht, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(kokosnuss, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(sternfrucht, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(papaya, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(grapefruit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(mango, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(ananas, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(litschi, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(kaktusfeige, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(drachenfrucht, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(kaktusfeigeAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(grapefruitAnzahl, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(drachenfruchtAnzahl, GroupLayout.PREFERRED_SIZE,
																45, GroupLayout.PREFERRED_SIZE)
														.addComponent(granatAnzahl, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(passionsAnzahl, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(kokosAnzahl, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(sternfruchtAnzahl, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(papayaAnzahl, GroupLayout.PREFERRED_SIZE, 45,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(litschiAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(ananasAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(mangoAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(smoothieMaker, GroupLayout.DEFAULT_SIZE, 94,
														Short.MAX_VALUE)
												.addComponent(grusskarte, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(schaeler, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(obstkorb, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(entsafter, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(36)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(entsafterAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(smAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(obstkorbAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(schaelerAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(grusskarteAnzahl, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addComponent(mail, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addGap(165).addComponent(lblNewLabel_10,
								GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(danke)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(mail).addGap(18)
						.addComponent(lblNewLabel_2).addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3).addComponent(lblNewLabel_8))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_5))
						.addGap(7).addComponent(lblNewLabel_7).addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(apfel)
								.addComponent(apfelAnzahl).addComponent(mango).addComponent(mangoAnzahl)
								.addComponent(smoothieMaker).addComponent(smAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(kirsche)
								.addComponent(kirscheAnzahl).addComponent(ananas).addComponent(ananasAnzahl)
								.addComponent(entsafter).addComponent(entsafterAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(birne)
								.addComponent(birneAnzahl).addComponent(litschi).addComponent(litschiAnzahl)
								.addComponent(obstkorb).addComponent(obstkorbAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(kiwi)
								.addComponent(kiwiAnzahl).addComponent(kaktusfeige).addComponent(kaktusfeigeAnzahl)
								.addComponent(schaeler).addComponent(schaelerAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(banane)
								.addComponent(bananeAnzahl).addComponent(drachenfrucht)
								.addComponent(drachenfruchtAnzahl).addComponent(grusskarte)
								.addComponent(grusskarteAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(pfirsich)
								.addComponent(pfirsichAnzahl).addComponent(grapefruit).addComponent(grapefruitAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(weintrauben)
								.addComponent(traubenAnzahl).addComponent(papaya).addComponent(papayaAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(erdbeere)
								.addComponent(erdbeereAnzahl).addComponent(sternfrucht).addComponent(sternfruchtAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(himbeere)
								.addComponent(himbeereAnzahl).addComponent(kokosnuss).addComponent(kokosAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(orange)
								.addComponent(orangeAnzahl).addComponent(passionsfrucht).addComponent(passionsAnzahl))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(pflaume)
								.addComponent(pflaumeAnzahl).addComponent(granatapfel).addComponent(granatAnzahl))
						.addGap(38).addComponent(lblNewLabel_9).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblNewLabel_10).addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
						.addComponent(btnNewButton).addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);
	}

}
