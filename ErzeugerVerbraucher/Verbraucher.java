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
				Thread.sleep(taktzeit);
				
			} catch (InterruptedException e) {
				System.err.println("Fehler beim Verbraucher");
			}
		}
	}

}