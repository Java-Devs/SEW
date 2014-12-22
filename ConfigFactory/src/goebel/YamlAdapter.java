package goebel;
/**
 * Yaml-Element für adapter
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class YamlAdapter extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public YamlAdapter(String value){
		this.value = value;
	}

	@Override
	public String getString() {
		return "adapter: "+this.value+"\n";
		
	}
}
