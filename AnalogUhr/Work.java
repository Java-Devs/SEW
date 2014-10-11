package goebel;

import java.util.Calendar;

/**
 * Zum Zeit festlegen (Systemzeit)
 * @author Melanie-Goebel
 * @author Bleedinghina
 */
public class Work{
	private Calendar cal = Calendar.getInstance();

	/**
	 * Getter-Methode fuer die Wochentage zb Mo fuer Montag
	 * @return ersten 2 Buchstaben von dem Wochentag beginnend mit So (Laenge = 7)
	 */
	public String getWochentag(){
		int a = cal.get(Calendar.DAY_OF_WEEK);
		String[] days = {"So","Mo","Di","Mi","Do","Fr","Sa"};
		return days[a-1];
	}
	/**
	 * Getter-Methode fuer das Datum exkl. Uhrzeit
	 * @return ein String-Array bestehend aus Jahr,Monat,Tag und Wochentag(Mo,Di,..) in dieser Reihenfolge
	 */
	public String[] getDatum(){
		cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH)+1;
		return new String[]{""+cal.get(Calendar.YEAR),""+month,""+cal.get(Calendar.DAY_OF_MONTH),getWochentag()};
	}
	/**
	 * Getter-Methode fuer die Zeit exkl. Datum
	 * @return ein int-Array bestehend aus Stunde,Minute,Sekunde und Millisekunden in dieser Reihenfolge
	 */
	public int[] getZeit(){
		cal = Calendar.getInstance();
		return new int[]{cal.get(Calendar.HOUR),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND),cal.get(Calendar.MILLISECOND)};
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den x-Wert aus.
	 * @param grad die Gradanzahl
	 * @param radius den Radius von der Uhr
	 * @param r den Radius
	 * @return den x-Wert
	 */
	public int gradToX(double grad, int durchmesser,int r) { 
		return (int)((durchmesser/2) + r * Math.cos(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den y-Wert aus.
	 * @param grad die Gradanzahl
	 * @param radius den Radius von der Uhr
	 * @param r den Radius
	 * @return den y-Wert
	 */
	public int gradToY(double grad,int durchmesser, int r) {
		return (int)((durchmesser/2) + r * Math.sin(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}
	/**
	 * Berechnet den Mondstatus mit 7 verschiedenen Werten.
	 * @author http://www.voidware.com/moon_phase.htm
	 * @param y das Jahr
	 * @param m das Monat
	 * @param d den Tag
	 * @return die Phase des Mondes (zwischen 0-7, von zunehmend zu abnehmend)
	 */
	public int getMoonPhase() {
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DAY_OF_MONTH);
		double c;
		double e;
		double jd;
		int b;

		if (m < 3) {
			y--;
			m += 12;
		}
		++m;
		c = 365.25 * y;
		e = 30.6 * m;
		jd = c + e + d - 694039.09;
		jd /= 29.53;
		b = (int)jd;
		jd -= b;
		b = (int)(jd * 8 + 0.5);
		b = b & 7;
		return b;
	}
}