package Swing_Hausaufgabe;



public class Artikel {
	@Override
	public String toString() {
		return  name+ " ";
	}

	private String name;
	private double preis;

	public Artikel(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
