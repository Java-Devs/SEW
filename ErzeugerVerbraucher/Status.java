package goebel;
public class Status implements Runnable{
	private ErstesLager l;
	private int maxtaktzeit;
	
	public Status(ErstesLager l, int maxtaktzeit){
		this.l = l;
		this.maxtaktzeit = maxtaktzeit;
	}

	@Override
	public void run() {
		while(true){
		try {
			Eintrag[] eintr = l.getStatus();
			int groesse = 0;
			if(eintr.length > 0){
			for(Eintrag i: eintr){
				groesse += i.getAnzahl();
			}
			System.out.println("Insgesamt Produkte: "+groesse+" von "+l.getGroesse()+"\n");
			}
			Thread.sleep((int)(Math.random()*this.maxtaktzeit)+1);
		} catch (InterruptedException e) {
			System.err.println("Fehler beim Status");
		}
		}
		
	}

}