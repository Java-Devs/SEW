package goebel;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * @author Melanie Goebel
 * @version 2014-10-18
 */
public class ErstesLager implements Lager{
	private final int groesse = 5000; // Groesse des Lagers
	private HashMap<Produkt, Integer> lagernd = new HashMap<Produkt, Integer>();

	@Override
	public synchronized boolean lagern(Produkt p,int anzahl){
		if(getWievoll()+anzahl < groesse){
			int derz = 0;
			if(lagernd.get(p)!=null) 
				derz = lagernd.get(p);
			lagernd.put(p, derz+anzahl);
			return true;
		}else{
			return false;
		}
	}
	@Override
	public synchronized boolean abfassen(Produkt p, int anzahl){
		int derz = lagernd.get(p);
		if(derz-anzahl > 0){
			lagernd.put(p, derz-anzahl);
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Gibt alle Produkte und deren Anzahl aus.
	 * @return produkte mit deren anzahl speichert in Eintrag in einem Array
	 */
	@Override
	public synchronized Eintrag[] getStatus(){
		Eintrag[] ein = new Eintrag[lagernd.size()];
		int i = 0;
		for(Entry<Produkt, Integer> e : lagernd.entrySet()){
			ein[i] = new Eintrag(e.getKey().getName(),e.getValue());
			i++;
		}
		return ein;
	}
	/**
	 * Rechnet sich aus wievoll das Lager ist.
	 * @return wieviele Produkte gelagert sind
	 */
	private int getWievoll(){
		int wv = 0;
		for(Entry<Produkt, Integer> e : lagernd.entrySet()){
			wv += e.getValue();
		}
		return wv;
	}
	@Override
	public boolean gehtSichAus(int anzahl){
		if(anzahl+getWievoll() >= groesse)
			return false;
		return true;
	}
	@Override
	public boolean gibtGenuegend(Produkt p, int anzahl){
		int gr = lagernd.get(p);
		if(gr-anzahl <= 0)
			return false;
		return true;
	}
	@Override
	public synchronized Produkt[] getProdukte(){
		Produkt[] produkte = new Produkt[lagernd.size()];
		int i = 0;
		for(Entry<Produkt, Integer> e : lagernd.entrySet()){
			produkte[i] = e.getKey();
			i++;
		}
		return produkte;
	}
	/**
	 * Getter-Methode fuer die Grosse
	 * @return the groesse
	 */
	@Override
	public int getGroesse() {
		return groesse;
	}
}