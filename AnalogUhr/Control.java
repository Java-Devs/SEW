package goebel;
/**
 * Verbindet UhrDisplay und Work
 * @author Melanie Goebel
 * @version 2014-10-06
 */
public class Control{
	private UhrDisplay dieuhr = new UhrDisplay(this);
	private Work work = new Work();


	/**
	 * Getter-Methode fuer DieUhr
	 * @return die View von Uhr
	 */
	public UhrDisplay getDieuhr() {
		return dieuhr;
	}
	/**
	 * Getter-Methode fuer das Datum exkl. Uhrzeit
	 * @return ein String-Array bestehend aus Jahr,Monat,Tag und Wochentag(Mo,Di,..) in dieser Reihenfolge
	 */
	public String[] getDatum(){
		return work.getDatum();
	}
	/**
	 * Getter-Methode fuer die Zeit exkl. Datum
	 * @return ein int-Array bestehend aus Stunde,Minute,Sekunde und Millisekunden in dieser Reihenfolge
	 */
	public int[] getZeit(){
		return work.getZeit();
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den x-Wert aus.
	 * @param grad die Gradanzahl
	 * @param radius den Radius von der Uhr
	 * @param r den Radius
	 * @return den x-Wert
	 */

	public int gradToX(double grad, int radius, int r){
		return work.gradToX(grad, radius, r);
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den y-Wert aus.
	 * @param grad die Gradanzahl
	 * @param radius den Radius von der Uhr
	 * @param r den Radius
	 * @return den y-Wert
	 */
	public int gradToY(double grad, int radius, int r){
		return work.gradToY(grad, radius, r);
	}
	/**
	 * Berechnet den Mondstatus mit 7 verschiedenen Werten.
	 * @param y das Jahr
	 * @param m das Monat
	 * @param d den Tag
	 * @return die Phase des Mondes (zwischen 0-7, von zunehmend zu abnehmend)
	 */
	public int getMondStatus(){
		return work.getMoonPhase();
	}
	/**
	 * Zeichnet alles im JPanel neu
	 */
	public void update(){
		dieuhr.repaint();
	}
}