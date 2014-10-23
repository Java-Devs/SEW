package goebel;
/**
 * Gibt in zufaelligen Zeitabschnitten (max. Zeit wird ausgewaehlt) den Status eines Lagers aus.
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class Status implements Runnable{
	private Lager l;
	private int maxtaktzeit;

	/**
	 * Setzt das Lager und den. max. Zeitabschnitt
	 * @param l das Lager 
	 * @param maxtaktzeit die maximale Zeit fuer eine Ausgabe
	 */
	public Status(Lager l, int maxtaktzeit){
		this.l = l;
		this.maxtaktzeit = maxtaktzeit;
	}

	@Override
	public void run() {
		while(true){
			try {
				Eintrag[] eintr = l.getStatus();
				if(!(eintr.equals(null)||eintr.length == 0)){
					int groesse = 0;
					if(eintr.length > 0){
						for(Eintrag i: eintr){
							groesse += i.getAnzahl();
						}
						System.out.println("Insgesamt Produkte: "+groesse+" von "+l.getGroesse());
						System.out.println(eintr.length+" verschiedene Produkte verfuegbar \n");
					}
				}
				Thread.sleep((int)(Math.random()*this.maxtaktzeit)+1);
			} catch (InterruptedException e) {
				System.err.println("Fehler beim Status");
			}
		}

	}

}