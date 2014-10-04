package goebel;
/**
 * Zum Zeit festlegen (Systemzeit)
 * @author Melanie-Goebel
 * @author Bleedinghina
 */
public class Work extends Thread{
	private int updateZeit;

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

		}
	}
}