package goebel;
/**
 * Fabrik fuer Yaml Config
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class YamlConfigFactory extends ConfigFactory{

	@Override
	public Element createElement(String value, String type) {
		Element e = null;
		switch(type){
		case "adapter":
			e = new YamlAdapter(value);
		break;
		case "classname":
			e = new YamlClassname(value);
		break;
		case "dsn":
			e = new YamlDsn(value);
		break;
		case "user":
			e = new YamlUser(value);
		break;
		}
		return e;
	}
	
}
