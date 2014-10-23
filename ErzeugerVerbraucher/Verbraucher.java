package goebel;

/**
 * Fasst aus einem Lager in einer taktzeit ab, vorher wird ueberpruft ob es leer ist.
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class Verbraucher implements Runnable{
	private Lager l;
	private int taktzeit;

	/**
	 * Setzt das Lager und die Taktzeit
	 * @param l das Lager
	 * @param taktzeit die Taktzeit in der gearbeitet wird
	 */
	public Verbraucher(Lager l, int taktzeit){
		this.l = l;
		this.taktzeit = taktzeit;
	}
	@Override
	public void run() {
		while(true){
			try {
				int anzahl = (int)(Math.random()*10)+1;
				Produkt[] produkte = l.getProdukte();
				if(!(produkte.equals(null)||produkte.length == 0)){// Ueberprueft ob das Lager leer ist
					
					Produkt p = produkte[(int)(Math.random()*produkte.length)];//zufaellig Anzahl zum abfassen		
					if(l.gibtGenuegend(p, anzahl)){// Ueberprufen ob das Lager genugend davon hat
						l.abfassen(p, anzahl);
					}
					Thread.sleep(taktzeit);
				}
			} catch (InterruptedException e) {
				System.err.println("Fehler beim Verbraucher");
			}
		}
	}

}