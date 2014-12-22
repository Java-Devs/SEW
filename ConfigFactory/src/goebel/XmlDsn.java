package goebel;
/**
 * Xml-Element für dsn
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class XmlDsn extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public XmlDsn(String value){
		this.value = value;
	}

	@Override
	public String getString() {
		return "<dsn> "+this.value+"</dsn>\n";
		
	}
}
