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
		UhrDisplay dieuhr = new UhrDisplay();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setBounds(350, 150, 400, 400); 
		jf.setVisible(true);
		jf.add(dieuhr,BorderLayout.CENTER);

	}
}