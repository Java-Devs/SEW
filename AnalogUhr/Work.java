package goebel;

import java.util.Calendar;

/**
 * Zum Zeit festlegen (Systemzeit)
 * @author Melanie-Goebel
 * @author Bleedinghina
 */
public class Work{
	private Calendar cal = Calendar.getInstance();

	public String getWochentag(){
		int a = cal.get(Calendar.DAY_OF_WEEK);
		String[] days = {"So","Mo","Di","Mi","Do","Fr","Sa"};
		return days[a-1];
	}
	public String[] getDatum(){
		cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH)+1;
		return new String[]{""+cal.get(Calendar.YEAR),""+month,""+cal.get(Calendar.DAY_OF_MONTH),getWochentag()};
	}
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
	public int getVollmond(){
		cal = Calendar.getInstance();
		int dayofyear =  cal.get(Calendar.DAY_OF_YEAR);
		if(cal.get(Calendar.YEAR)==2014){
			int vollmond = 8;


		}
		return 0;
	}
	/**
	 * @author http://www.voidware.com/moon_phase.htm
	 * @param y das Jahr
	 * @param m das Monat
	 * @param d den Tag
	 * @return die Phase des Mondes (zwischen 0-7, von zunehmend zu abnehmend)
	 */
	public int moonPhase(int y, int m, int d) {

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
		jd = c + e + d - 694039.09; /* jd is total days elapsed */
		jd /= 29.53; /* divide by the moon cycle (29.53 days) */
		b = (int)jd; /* int(jd) -> b, take integer part of jd */
		jd -= b; /* subtract integer part to leave fractional part of original jd */
		b = (int)(jd * 8 + 0.5); /* scale fraction from 0-8 and round by adding 0.5 */
		b = b & 7; /* 0 and 8 are the same so turn 8 into 0 */
		return b;
	}
}