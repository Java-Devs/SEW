package goebel;

/**
 * Startet den Weckdienst sowie die Oberflaeche zb als GUI oder in der CLI mittel Parameter.
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class Start{
	public static void main(String[] args) {
		if(args.length == 1){
			Wecker w = new Wecker();
			if(args[0].equals("CLI")){
				Thread cl = new Thread(new CLIStart(w));
				cl.start();
			}if(args[0].equals("GUI")){
				GUIStart gui = new GUIStart(w);
			}
		}else{
			System.err.println("Bitte Parameter angeben! Hilfe unter --help");
		}
	}
}