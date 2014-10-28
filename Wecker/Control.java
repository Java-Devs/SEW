package goebel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


/**
 * Steuert Buttons von der View
 * @author Melanie Goebel
 * @version 2014-10-28
 */
public class Control implements ActionListener{

	private View panel;
	private Model frame;
	private Wecker w;
	private Observer o;

	/**
	 * Konstruktor fuer den Control, speichert Wecker und Observer
	 * @param w den Wecker
	 * @param o den Observer
	 */
	public Control(Wecker w, Observer o){
		this.w = w;
		this.panel = new View(this);
		this.frame = new Model(panel,"Wecker");
		this.o = o;
		w.anmelden(o);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.equals(panel.getExit())){
			w.abmelden(o);//abmelden bevor es beendet wird
		    System.exit(0);
		}else if(b.equals(panel.getRemove()))
			w.abmelden(o);
		else if(b.equals(panel.getDeaktivieren()))
			System.out.println("Deaktivieren");
	}

}