package goebel;
/**
 * Fabrik fuer Xml Config
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class XmlConfigFactory extends ConfigFactory{

	@Override
	public Element createElement(String value, String type) {
		Element e = null;
		switch(type){
		case "adapter":
			e = new XmlAdapter(value);
		break;
		case "classname":
			e = new XmlClassname(value);
		break;
		case "dsn":
			e = new XmlDsn(value);
		break;
		case "user":
			e = new XmlUser(value);
		break;
		}
		return e;
	}
	
}
