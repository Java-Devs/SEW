package goebel;
/**
 * Startet das CLI-Menu fuer den Weckclienten
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class CLIStart implements Runnable, Observer{
	private Wecker w;

	public CLIStart(Wecker w){
		this.w = w;	
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