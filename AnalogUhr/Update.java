package goebel;

/**
 * Ruft update() nach einer gewissen Zeit auf (updateZeit)
 * @author Melanie Goebel
 * @version 2014-10-11
 */
public class Update extends Thread{
	private int updateZeit;
	private Control c = new Control();

	/**
	 * Konstruktor, setzt updateZeit
	 * @param updateZeit
	 */
	public Update(int updateZeit){
		this.updateZeit = updateZeit;
	}

	/**
	 * Ruft nach einer gewissen Zeit update() auf.
	 */
	@Override
	public void run () {
		while (true) {
			try {
				Thread.sleep(updateZeit);
				c.update();
			} 
			catch (InterruptedException e) {
			}
			

		}
	}
	/**
	 * Getter Methode fuer Control
	 * @return das Control
	 */
	public Control getControl(){
		return c;
	}
}
