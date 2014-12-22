package goebel;

import java.util.Map;

import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.internal.ArgumentParserImpl;

/**
 * Arguemtenverarbeitung zum Erstellen des Config-Files mit Datan aus einer DB.
 * @author Melanie Goebel
 * @version 2014-12-22
 */
public class Start {
	public static void main(String[] args) {
		
		ArgumentParser parser = new ArgumentParserImpl("Connect to RDBMS:",false)
		.defaultHelp(true)    
		.description("Checks arguments for connecting to a RDBMS");

		parser.addArgument("-h")//hostname
		.setDefault("localhost")
		.help("hostname");
		parser.addArgument("-u")//user
		.setDefault("root")
		.help("username");
		parser.addArgument("-p")//password
		.setDefault("")
		.help("password");
		parser.addArgument("-d").required(true)//datenbank (Pflicht)
		.help("datenbank");
		parser.addArgument("-t").required(true)//type (Pflicht)
		.choices("yaml","xml")
		.help("type");
		parser.addArgument("-o").required(true)//outputfile (Pflicht)
		.help("Outputfile");
		parser.addArgument("--help")//Hilfe
		.action(Arguments.help())
		.setDefault(Arguments.SUPPRESS);
		
		Map<String,Object> arguments = null;
		try {
			Namespace res = parser.parseArgs(args); // Argumente pruefen
			arguments =  res.getAttrs();
		} catch (ArgumentParserException e) {
			parser.handleError(e); // Fehlermeldung
			System.exit(1);
		}
		ConfigFactory factory = null;
		switch(arguments.get("t").toString()){
		case "yaml":
			factory = new YamlConfigFactory();
			break;
		case "xml":
			System.err.println("Not implemented");
			break;
		}
		factory.writeConfig(arguments.get("h").toString(), arguments.get("u").toString(), 
				arguments.get("p").toString(), arguments.get("d").toString(), 
				"select * from element;", ";", arguments.get("o").toString());
	}
}
