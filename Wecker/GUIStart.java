package goebel;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
/**
 * Startet die GUI fuer den Weckclienten.
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class GUIStart implements Observer{


	public GUIStart(Wecker w){
		new Control(w);
	}


	@Override
	public void synchoniziereZustand() {
		AudioInputStream ais;
		Clip clip = null;
		try {
			ais = AudioSystem.getAudioInputStream(new File("C:/Users/Bleedinghina/wecker.wav"));
			clip = AudioSystem.getClip();
			clip.open(ais);
		} catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clip.start();

	}

}