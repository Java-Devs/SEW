package goebel;

/**
 * Startet den Weckdienst sowie die Oberflaeche zb als GUI oder in der CLI mittel Parameter.
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class Start{
	public static void main(String[] args) {
		if(args.length == 2){
			if(args[0].equals("CLI")){
				CLIStart.main(null);
			}if(args[0].equals("GUI")){
				GUIStart.main(null);
			}
		}else{
			System.err.println("Bitte Parameter angeben! Hilfe unter --help");
		}
	}
}