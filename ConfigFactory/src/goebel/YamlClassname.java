package goebel;
/**
 * Yaml-Element für classname
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class YamlClassname extends Element{
	/**
	 * Ubernahme des Wertes fuer den Eintrag
	 * @param value den Wert
	 */
	public YamlClassname(String value){
		this.value = value;
	}
	@Override
	public String getString() {
		return "classname: "+value;
	}

}
