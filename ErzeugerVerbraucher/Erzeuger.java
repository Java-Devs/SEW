package goebel;
public class Erzeuger implements Runnable{
	
	private Lager l;
	private int taktzeit;
	private Produkt p;

	public Erzeuger(Lager l, int taktzeit, Produkt p){
		this.l = l;
		this.taktzeit = taktzeit;
	}
	@Override
	public void run() {
		try {
			l.lagern(p, 100);
			Thread.sleep(taktzeit);
		} catch (InterruptedException e) {
			System.err.println("Fehler beim Erzeuger.");
		}
		
	}

}