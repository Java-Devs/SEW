package goebel;

import javax.swing.JFrame;
/**
 * Stellt das Fenster zur Verfuegung
 * @author Melanie Goebel
 * @version 2014-10-28
 */
public class Model extends JFrame{
	/**
	 * Erstellt ein Fenster und fuegt das uebergebene Panel hinzu
	 * @param layoutPanel das Panel zum anzeigen
	 * @param titel den anzeigenden Titel als Text
	 */
	public Model(View layoutPanel, String titel){
		super(titel);
		this.add(layoutPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // Groesse nicht veraenderbar
		this.setBounds(0, 0, 600, 600);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}