package goebel;

import java.util.Calendar;

public class Update extends Thread{
	private int updateZeit;
	private Control c = new Control();

	public Update(int updateZeit){
		this.updateZeit = updateZeit;
	}

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
	public Control getConrtol(){
		return c;
	}
}
