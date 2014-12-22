package goebel;
/**
 * Xml-Element für classname
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class XmlClassname extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public XmlClassname(String value){
		this.value = value;
	}

	@Override
	public String getString() {
		return "<classname> "+this.value+"</classname>\n";
		
	}
}
