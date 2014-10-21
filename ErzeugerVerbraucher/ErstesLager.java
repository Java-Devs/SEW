package goebel;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * @author Melanie Goebel
 * @version 2014-10-18
 */
public class ErstesLager{
	private ReentrantLock lock;
	private final int groesse = 5000;

	private HashMap<Produkt, Integer> lagernd = new HashMap<Produkt, Integer>();

	public synchronized int lagern(Produkt p,int anzahl){
		if(getWievoll()+anzahl < groesse){
			int derz = 0;
			if(lagernd.get(p)!=null) 
				derz = lagernd.get(p);
			lagernd.put(p, derz+anzahl);
			return 0;
		}else{
			return -1;
		}
	}
	public synchronized int abfassen(Produkt p, int anzahl){
		int derz = lagernd.get(p);
		if(derz-anzahl > 0){
			lagernd.put(p, derz-anzahl);
			return 0;
		}else{
			return -1;
		}
	}
	public synchronized Eintrag[] getStatus(){
		Eintrag[] ein = new Eintrag[lagernd.size()];
		int i = 0;
		for(Entry<Produkt, Integer> e : lagernd.entrySet()){
			ein[i] = new Eintrag(e.getKey().getName(),e.getValue());
			i++;
		}
		return ein;
	}
	private int getWievoll(){
		int wv = 0;
		for(Entry<Produkt, Integer> e : lagernd.entrySet()){
			wv += e.getValue();
		}
		return wv;
	}
	public boolean gehtSichAus(int anzahl){
		if(anzahl+getWievoll() >= groesse)
			return false;
		return true;
	}
	public boolean gibtGenuegend(int anzahl){
		if(getWievoll()-anzahl <= 0)
			return false;
		return true;
	}
	public Produkt[] getProdukte(){
		Produkt[] produkte = new Produkt[lagernd.size()];
		int i = 0;
		for(Entry<Produkt, Integer> e : lagernd.entrySet()){
			produkte[i] = e.getKey();
			i++;
		}
		return produkte;
	}
	/**
	 * @return the groesse
	 */
	public int getGroesse() {
		return groesse;
	}
}