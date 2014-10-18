package goebel;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * @author Melanie Goebel
 * @version 2014-10-18
 */
public class Lager{
	private ReentrantLock lock;
	private final int groesse = 500;
	private HashMap<String, Integer> lagernd;
	
	public int lagern(Produkt p,int anzahl){
		return 0;
		//TODO: Methode schreiben
	}
	public int abfassen(Produkt p, int anzahl){
		return 0;
		//TODO: Methode schreiben
	}
	public Eintrag[] getStatus(){
		return new Eintrag[1];
		//TODO: Methode schreiben
	}
}