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
	
	public Eintrag(String name, int anzahl){
		this.name = name;
		this.anzahl = anzahl;
	}
	public String getName(){
		return name;
	}
	public int getAnzahl(){
		return anzahl;
	}
}