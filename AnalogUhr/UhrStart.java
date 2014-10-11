package goebel;

import java.awt.*;
import javax.swing.*;

/**
 * Startklasse fuer AnalogUhr.
 * @author Melanie Goebel
 * @version 2014-10-03
 */
public class UhrStart{
	public static void main (String[] args){
		JFrame jf = new JFrame("AnalogUhr");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Update up = new Update(10);// Updater updatet alle 10 millisek das bild
		up.start();// Starten des Threads
		jf.setBounds(350, 150, 400, 500); 
		jf.setVisible(true);
		jf.add(up.getControl().getDieuhr(),BorderLayout.CENTER);
	}
}