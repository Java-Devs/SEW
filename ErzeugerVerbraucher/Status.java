package goebel;
public class Status implements Runnable{
	private Lager l;
	private int maxtaktzeit;
	
	public Status(Lager l, int maxtaktzeit){
		this.l = l;
		this.maxtaktzeit = maxtaktzeit;
	}

	@Override
	public void run() {
		try {
			Eintrag[] eintr = l.getStatus();
			int groesse = 0;
			for(Eintrag i: eintr){
				System.out.println(i.getName()+" : "+i.getAnzahl());
				groesse += i.getAnzahl();
			}
			System.out.println("Insgesamt Produkte: "+groesse);
			Thread.sleep((int)(Math.random()*this.maxtaktzeit)+1);
		} catch (InterruptedException e) {
			System.err.println("Fehler beim Status");
		}
		
	}

}