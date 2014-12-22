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
	public void writeConfig(String hostname, String user, String password,String database, String command, String delimeter,String filename){
		Connection con = new Connection();
		String out = con.sendSelectCommand(hostname, user, password, database, command, delimeter);
		String[] elements = out.split("\n");// splitten nach einen Zeilenumbruch
		String[] element;
		Element e;
		String config="";
		for(int i = 0; i < elements.length; i++){
			element = elements[i].split(delimeter);
			e=createElement(element[2],element[1]);
			if( e != null)
			config += e.getString();
		}
		System.out.println(config);

	}
}
