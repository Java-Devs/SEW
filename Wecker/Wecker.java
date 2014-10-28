package goebel;

import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * Benachrichtigungssystem fuer Observers
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class Wecker implements Observable{
	ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	public void anmelden(Observer o) {
		observers.add(o);
	}

	@Override
	public void abmelden(Observer o) {
		observers.remove(o);
	}

	@Override
	public void benachrichtige() {
		for(Observer o: observers){
			o.synchoniziereZustand();
		}
		
	}
	
}