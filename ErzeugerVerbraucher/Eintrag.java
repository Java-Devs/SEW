package goebel;
/**
 * Klasse zum Speichern von Eintraegen mit Namen und Anzahl.
 * @author Melanie Goebel
 * @version 2014-10-15
 *
 */
public class Eintrag{
	private String name;
	private int anzahl;
	
	/**
	 * Konstruktor mit Werten fuer den Eintrag
	 * @param name den Name des Eintrages
	 * @param anzahl die Anzahl die zu speichern ist vom Eintrag
	 */
	public Eintrag(String name, int anzahl){
		this.name = name;
		this.anzahl = anzahl;
	}
	/**
	 * Getter-Methode fuer den Namen
	 * @return den Namen als String
	 */
	public String getName(){
		return name;
	}
	/**
	 * Getter-Methode fuer die Anzahl
	 * @return die Anzahl in int
	 */
	public int getAnzahl(){
		return anzahl;
	}
}