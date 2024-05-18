package Swing_Hausaufgabe;



public class Kunde {
	private String geschlecht;
	private String vorname;
	private String nachname;
	private String email;
	private String strasse;
	private Integer hausnummer;
	private String plz;
	private String ort;
	private boolean versand;
	
	public Kunde() {
	}

	public boolean isVersand() {
		return versand;
	}

	public void setVersand(boolean versand) {
		this.versand = versand;
	}

	
	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public Integer getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(Integer hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	

}
