package goebel;
/**
 * Startet das CLI-Menu fuer den Weckclienten, beendet sich nach dem ersten Alarm.
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class CLIStart implements Observer{
	private Observable w;
	private boolean exit;

	/**
	 * Konstruktor. Meldet sich an den Wecker an und gibt aus dass er angemeldet ist.
	 * @param w
	 */
	public CLIStart(Observable w){
		this.w = w;
		w.anmelden(this);
		System.out.println("Wecker ist aktiviert...");
	}
	@Override
	public void synchoniziereZustand() {
		System.out.println("Alarm!");
		beende();
	}
	/**
	 * Meldet vom Wecker ab und beendet das Programm
	 */
	public void beende(){
		w.abmelden(this);
		System.exit(0);
	}

}