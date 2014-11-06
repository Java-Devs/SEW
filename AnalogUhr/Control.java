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
	 * @return die View von Uhr
	 */
	public UhrDisplay getDieuhr() {
		return dieuhr;
	}
	public UhrDisplay getDieUhr(){
		return dieuhr;
	}
	public String[] getDate(){
		return work.getDatum();
	}
	public int[] getZeit(){
		return work.getZeit();
	}
	public int gradToX(double grad, int radius, int r){
		return work.gradToX(grad, radius, r);
	}
	public int gradToY(double grad, int radius, int r){
		return work.gradToY(grad, radius, r);
	}
	public int getMondStatus(){
		return work.getMoonPhase();
	}
	public void update(){
	   dieuhr.repaint();
	   dieuhr.validate();
	}
}