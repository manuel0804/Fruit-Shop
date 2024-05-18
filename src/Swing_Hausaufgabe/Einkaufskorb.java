package Swing_Hausaufgabe;

import java.util.ArrayList;

public class Einkaufskorb {
	private ArrayList<Artikel> einkaufskorb;
	

	public Einkaufskorb() {
		einkaufskorb = new ArrayList<>();
	}

	public ArrayList<Artikel> getEinkaufskorb() {
		return einkaufskorb;
	}

	public void setEinkaufskorb(ArrayList<Artikel> einkaufskorb) {
		this.einkaufskorb = einkaufskorb;
	}
	
	
}
