package goebel;
/**
 * Xml-Element für user
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class XmlUser extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public XmlUser(String value){
		this.value = value;
	}

	@Override
	public String getString() {
		return "<user> "+this.value+"</user>\n";
		
	}
}
