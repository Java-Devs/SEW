package goebel;
/**
 * Ein Config Element soll die Methode getString() haben und ein Atribut value von Typ String.
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public abstract class Element {
	protected String value;
	/**
	 * Gibt den Eintrag in Dialekt zurueck
	 * @return den Eintrag
	 */
	public abstract String getString();
}
