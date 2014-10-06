package goebel;
/**
 * Verbindet UhrDisplay und Work
 * @author Melanie Goebel
 * @version 2014-10-06
 */
public class Control{
	private UhrDisplay dieuhr;
	private Work work = new Work(30);
	
	public Control(UhrDisplay dieuhr){
		this.dieuhr = dieuhr;
	}
	
	/**
	 * @return die View von Uhr
	 */
	public UhrDisplay getDieuhr() {
		return dieuhr;
	}
	/**
	 * @return das Model von Uhr
	 */
	public Work getWork() {
		return work;
	}
	public int gradToX(int grad, int radius, int r){
		return work.gradToX(grad, radius, r);
	}
	public int gradToY(int grad, int radius, int r){
		return work.gradToY(grad, radius, r);
	}
}