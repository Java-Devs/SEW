package goebel;
/**
 * 
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class Start {
	public static void main(String[] args) {
		YamlConfigFactory y = new YamlConfigFactory();
		y.writeConfig("localhost", "root", "", "testinsy", "select * from element;", ";", "output.txt");
	}
}
