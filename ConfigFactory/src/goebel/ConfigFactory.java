package goebel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

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
		File file;
		FileWriter rf;
		BufferedWriter bf;
		Connection con = new Connection();
		String out = con.sendSelectCommand(hostname, user, password, database, command, delimeter);
		String[] elements = out.split("\n");// splitten nach einen Zeilenumbruch
		String[] element;
		Element e;
		try {
			file = new File(filename);
			rf = new FileWriter(file);
			bf = new BufferedWriter(rf); 
			for(int i = 0; i < elements.length; i++){
				element = elements[i].split(delimeter);
				e=createElement(element[2],element[1]);
				if( e != null){
					bf.write(e.getString());
					bf.newLine();
				}
			}
			bf.close();rf.close();

		} catch (FileNotFoundException ex) {
			System.err.println("File "+filename+" kann nicht erstellt werden");
		} catch (IOException ex) {
			System.err.println("Fehler beim eintragen der Daten in "+filename);
		}



	}
}
