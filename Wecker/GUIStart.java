package goebel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
import javax.swing.JButton;
/**
 * Startet die GUI fuer den Weckclienten.
 * @author Melanie Goebel
 * @version 2014-10-27
 */
public class GUIStart implements Observer, ActionListener{
	private View panel;
	private Model frame;
	private Wecker w;
	/**
	 * Startet ein neues Control und uebergibt ihn sich selbst sowie den Wecker
	 * @param w
	 */
	public GUIStart(Wecker w){
		this.w = w;
		this.panel = new View(this);
		this.frame = new Model(panel,"Wecker");
		w.anmelden(this);
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
		clip.start();// Abspielen des Tons
		panel.setRemoveEnabled(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.equals(panel.getExit())){
			w.abmelden(this);//abmelden bevor es beendet wird
		    System.exit(0);
		}else if(b.equals(panel.getRemove()))
			w.abmelden(this);
		else if(b.equals(panel.getDeaktivieren()))
			System.out.println("Deaktivieren");
	}


}