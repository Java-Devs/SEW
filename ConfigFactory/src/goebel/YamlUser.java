package goebel;
/**
 * Yaml-Element f�r user
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class YamlUser extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public YamlUser(String value){
		this.value = value;
	}
	@Override
	public String getString() {
		return "user: "+this.value+"\n";
	}

}
