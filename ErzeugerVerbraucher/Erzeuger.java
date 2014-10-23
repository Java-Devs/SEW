package goebel;

/**
 * Lagert Produkte die erzeugt werden in einem Lager, ueberprueft vorher ob noch genuegend Platz ist
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class Erzeuger implements Runnable{

	private Lager l;
	private int taktzeit;
	private Produkt p;

	/**
	 * Setzt Lager, die Taktzeit sowie das Produkt dass erstellt werden soll
	 * @param l das Lager
	 * @param taktzeit die Taktzeit in der gearbeitet wird
	 * @param p das zu erzeugende Produkt
	 */
	public Erzeuger(Lager l, int taktzeit, Produkt p){
		this.l = l;
		this.taktzeit = taktzeit;
		this.p = p;
	}
	@Override
	public void run() {
		while(true){
			try {
				int anzahl = 1;
				if(l.gehtSichAus(anzahl)){// Ueberpruefen ob noch Platz ist.
					l.lagern(p, anzahl);
				}
				Thread.sleep(taktzeit);
			} catch (InterruptedException e) {
				System.err.println("Fehler beim Erzeuger.");
			}
		}

	}

}