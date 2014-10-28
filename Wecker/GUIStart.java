package goebel;


/**
 * Startet die GUI fuer den Weckclienten.
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class GUIStart implements Observer, Runnable{
	private Wecker w;

	public GUIStart(Wecker w){
		this.w = w;
		new Control();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void synchoniziereZustand() {
		// TODO Auto-generated method stub

	}

}