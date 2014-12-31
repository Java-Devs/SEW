package goebel;

import java.util.ArrayList;
import java.util.Iterator;
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
	 * Erzeugen eines Produktes in der jeweiligen Fabrik
	 * @param produkt das Produkt das erzeugt werden soll
	 * @return das erzeugte Produkt
	 */
	public abstract  Produkt erzeuge(String produkt);
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
		String ausg = "Der Einkaufswagen beinhaltet "+einkaufsWagen.size()+" Produkte \n";
		Iterator<Produkt> it = einkaufsWagen.iterator();
		Produkt p;
		double gesPreis = 0;
		while(it.hasNext()){
			p = it.next();
			ausg += it.next().kategorie+": ";
			if(p.getStueckanz() != 0){
				ausg += p.getStueckanz()+"Stk ";
			}
			ausg += p.getBezeichnung()+" ";
			if(p.getGewicht() != 0.0 && p.getMengenEinheit() != null){
				ausg += p.getGewicht()+p.getMengenEinheit()+" ";
			}
			gesPreis += p.getPreis();
			ausg += p.getPreis()+"\n";
		}
		ausg += "Gesamtpreis: "+gesPreis+"\n";
		ausg += "Bezahlt: ";
		if(bezahlt)
			ausg += "Ja";
		else
			ausg += "Nein";
		ausg += "\nVerschickt: ";
		if(verschickt)
			ausg += "Ja";
		else
			ausg += "Nein";
		ausg += "\nVerpackt: ";
		if(verpackt)
			ausg += "Ja";
		else
			ausg += "Nein";
		return ausg;
	}
}
