package goebel;

import java.util.Calendar;

/**
 * Zum Zeit festlegen (Systemzeit)
 * @author Melanie-Goebel
 * @author Bleedinghina
 */
public class Work extends Thread{
	private int updateZeit;
	private Calendar cal = Calendar.getInstance();

	public Work(int updateZeit){
		this.updateZeit = updateZeit;
	}
	@Override
	public void run () {
		while (true) {
			try {
				Thread.sleep(updateZeit);
			} 
			catch (InterruptedException e) {
			}
			cal = Calendar.getInstance();

		}
	}
	public String getWochentag(){
		int a = cal.get(Calendar.DAY_OF_WEEK);
		switch(a){
		case 1:
			return "So";
		case 2:
			return "Mo";
		case 3:
			return "Di";
		case 4:
			return "Mi";
		case 5:
			return "Do";
		case 6:
			return "Fr";
		case 7:
			return "Sa";
		}
		return "Error";
	}
	public String[] getDatum(){
		return new String[]{""+cal.get(Calendar.YEAR),""+cal.get(Calendar.MONTH),""+cal.get(Calendar.DAY_OF_MONTH),getWochentag()};
	}
	public int[] getZeit(){
		return new int[]{cal.get(Calendar.HOUR),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND),cal.get(Calendar.MILLISECOND)};
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den x-Wert aus.
	 * @param grad die Gradanzahl
	 * @param radius den Radius von der Uhr
	 * @param r den Radius
	 * @return den x-Wert
	 */
	public int gradToX(double grad, int radius,int r) { 
		return (int)((radius/2) + r * Math.cos(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den y-Wert aus.
	 * @param grad die Gradanzahl
	 * @param radius den Radius von der Uhr
	 * @param r den Radius
	 * @return den y-Wert
	 */
	public int gradToY(double grad,int radius, int r) {
		return (int)((radius/2) + r * Math.sin(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}
}