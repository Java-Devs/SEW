package goebel;
/**
 * Fabrik zum Erstellen einer Config
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public abstract class ConfigFactory {
	
	/**
	 * Erstellen eines Eintrages fuer die Config
	 * @param value Wert fuer den Eintrag
	 * @param type Art des Eintrages
	 * @return Eintrag im bestimmten Dialekt
	 */
	public abstract Element createElement(String value, String type);
	/**
	 * Schreiben des Config in einem file
	 * @param filename das File in dem geschrieben werden soll
	 */
	public void writeConfig(String filename){
		
	}
}
