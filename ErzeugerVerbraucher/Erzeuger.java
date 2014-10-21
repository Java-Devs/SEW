package goebel;


public class Erzeuger implements Runnable{

	private Lager l;
	private int taktzeit;
	private Produkt p;

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
				if(l.gehtSichAus(anzahl)){
					l.lagern(p, anzahl);
				}
				Thread.sleep(taktzeit);
			} catch (InterruptedException e) {
				System.err.println("Fehler beim Erzeuger.");
			}
		}

	}

}