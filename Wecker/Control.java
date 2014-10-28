package goebel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Steuert Buttons von der View
 * @author Melanie Goebel
 * @version 2014-10-28
 */
public class Control implements ActionListener{

	private View panel;
	private Model frame;

	public Control(){
		panel = new View(this);
		frame = new Model(panel,"Wecker");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}

}