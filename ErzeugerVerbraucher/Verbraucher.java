package goebel;
public class Verbraucher implements Runnable{
	private Lager l;
	private int taktzeit;

	public Verbraucher(Lager l, int taktzeit){
		this.l = l;
		this.taktzeit = taktzeit;
	}
	@Override
	public void run() {
		while(true){
			try {
				int anzahl = (int)(Math.random()*100)+10;
				if(l.gibtGenuegend(anzahl)){
					Produkt[] produkte = l.getProdukte();
					Produkt p = produkte[(int)(Math.random()*produkte.length)];			
					l.abfassen(p, anzahl);
				}
				Thread.sleep(taktzeit);

			} catch (InterruptedException e) {
				System.err.println("Fehler beim Verbraucher");
			}
		}
	}

}