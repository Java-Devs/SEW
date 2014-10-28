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

	public Control(Wecker w){
		this.w = w;
		panel = new View(this);
		frame = new Model(panel,"Wecker");
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.equals(panel.getExit()))
			System.out.println("exit");
		else if(b.equals(panel.getRemove()))
			System.out.println("Remove");
		else if(b.equals(panel.getDeaktivieren()))
			System.out.println("Deaktivieren");
	}

}