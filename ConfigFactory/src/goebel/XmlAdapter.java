package goebel;
/**
 * Xml-Element für adapter
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class XmlAdapter extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public XmlAdapter(String value){
		this.value = value;
	}

	@Override
	public String getString() {
		return "<adapter> "+this.value+"</adapter>\n";
		
	}
}
