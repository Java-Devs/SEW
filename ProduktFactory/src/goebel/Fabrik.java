package goebel;

import java.util.ArrayList;
/**
 * Abstrakte Fabrik, die Stati aendert, den Einkaufswagen verwaltet und 
 * eine toString Methode beinhaltet
 * @author Melanie Goebel
 * @version 2014-12-31
 */
public abstract class Fabrik {
	private boolean bezahlt;
	private boolean verschickt;
	private boolean verpackt;
	private ArrayList<Produkt> einkaufsWagen;
	
	/**
	 * Erstellt einen Einkaufswagen und setzt alle Stati auf false
	 */
	public Fabrik(){
		bezahlt = false;
		verschickt = false;
		verpackt = false;
		einkaufsWagen = new ArrayList<Produkt>();
	}
	/**
	 * Hinzufuegen eines Produktes in den Einkaufswagen
	 * @param p das Produkt das hinzugefuegt werden soll
	 */
	public void hinzufuegen(Produkt p){
		einkaufsWagen.add(p);
	}
	/**
	 * Aendern des Status bezahlt in true
	 */
	public void bezahlen(){
		bezahlt = true;
	}
	/**
	 * Aendern des Status verschickt in true
	 */
	public void verschicken(){
		verschickt = true;
	}
	/**
	 * Aendern des Status verpackt in true
	 */
	public void verpacken(){
		verpackt = true;
	}
	public String toString(){
		//TODO: Implementieren
		return null;
	}
}
