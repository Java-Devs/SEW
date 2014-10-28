package goebel;
/**
 * Startet das CLI-Menu fuer den Weckclienten
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class CLIStart implements Observer{
	private Wecker w;
	private boolean exit;

	public CLIStart(Wecker w){
		this.w = w;
		w.anmelden(this);
		System.out.println("Wecker ist aktiviert...");
	}
	@Override
	public void synchoniziereZustand() {
		System.out.println("Alarm!");
		beende();
	}
	public void beende(){
		w.abmelden(this);
		System.exit(0);
	}

}