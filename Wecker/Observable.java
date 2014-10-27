package goebel;
/**
 * Der Beobachteter bei dem man sich anmelden und abmelden kann und benachrichtigt wird 
 * wenn der Zustand sich aendert
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public interface Observable{
	/**
	 * Anmelden fuer die Benachrichtigungen von einen Observer
	 * @param o den Observer
	 */
	public void anmelden(Observer o);
	/**
	 * Abmelden fuer die Benachrichtigungen von einen Observer
	 * @param o den Observer
	 */
	public void abmelden(Observer o);
	/**
	 * Benachrichtigt alle angemeldete Observer
	 */
	public void benachrichtige();
}