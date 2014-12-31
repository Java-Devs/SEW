package goebel;
/**
 * Produkt mit Kategorie, einer Bezeichnung, Preis und Gewicht mit Einheit
 * @author Melanie Goebel
 * @version 2014-12-31
 */
public class Produkt {
	protected String kategorie;
	private String bezeichnung;
	private double preis;
	private double gewicht;
	private String mengenEinheit;
	private int stueckanz;
	
	/**
	 * Setzen aller Werten
	 * @param kategorie die Kategorie
	 * @param bezeichnung die Bezeichnung
	 * @param preis der Preis
	 * @param gewicht das Gewicht
	 * @param mengenEinheit die Einheit fuer das Gewicht
	 */
	public Produkt(String kategorie, String bezeichnung, double preis, double gewicht, String mengenEinheit){
		this.kategorie = kategorie;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.gewicht = gewicht;
		this.mengenEinheit = mengenEinheit;
	}
	public Produkt(String kategorie, String bezeichnung, double preis, int stueckanz){
		this.kategorie = kategorie;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.setStueckanz(stueckanz);
	}
	/**
	 * @return die kategorie
	 */
	public String getKategorie() {
		return kategorie;
	}
	/**
	 * @return die bezeichnung
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}
	/**
	 * @return die preis
	 */
	public double getPreis() {
		return preis;
	}
	/**
	 * @return die gewicht
	 */
	public double getGewicht() {
		return gewicht;
	}
	/**
	 * @return die mengenEinheit
	 */
	public String getMengenEinheit() {
		return mengenEinheit;
	}
	/**
	 * @param kategorie die kategorie auf die geaendert werden soll
	 */
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	/**
	 * @param bezeichnung die bezeichnung auf die geaendert werden soll
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	/**
	 * @param preis die preis auf die geaendert werden soll
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}
	/**
	 * @param gewicht die gewicht auf die geaendert werden soll
	 */
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	/**
	 * @param mengenEinheit die mengenEinheit auf die geaendert werden soll
	 */
	public void setMengenEinheit(String mengenEinheit) {
		this.mengenEinheit = mengenEinheit;
	}
	/**
	 * @return die stueckanzahl
	 */
	public int getStueckanz() {
		return stueckanz;
	}
	/**
	 * @param stueckanz die stueckanzahl auf die geandert werden soll
	 */
	public void setStueckanz(int stueckanz) {
		this.stueckanz = stueckanz;
	}
}
