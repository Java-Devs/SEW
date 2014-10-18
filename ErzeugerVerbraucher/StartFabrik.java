package goebel;

/**
 * Start-Klasse fuer die Fabrik
 * @author Bleedinghina
 *
 */
public class StartFabrik{
	public static void main (String[] args){
		Erzeuger e1 = new Erzeuger();
		Erzeuger e2 = new Erzeuger();
		Erzeuger e3 = new Erzeuger();
		
		Verbraucher v1 = new Verbraucher();
		Verbraucher v2 = new Verbraucher();
		Verbraucher v3 = new Verbraucher();
		
		e1.run();
		e2.run();
		e3.run();
		v1.run();
		v2.run();
		v3.run();
	}
}