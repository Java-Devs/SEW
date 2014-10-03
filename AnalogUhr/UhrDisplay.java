package goebel;

import java.awt.*;

import javax.swing.*;

/**
 * Zeichnen der Analoguhr
 * @author Melanie Goebel
 * @version 2014-10-03
 */
public class UhrDisplay extends JPanel{
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.getSize().width, this.getSize().height);
		g.setColor(Color.PINK);
		if(this.getWidth()>=this.getHeight()){
			g.fillOval(0, 0, this.getHeight(), this.getHeight());
		}else{
			g.fillOval(0, 0, this.getWidth(), this.getWidth());
		}
	}
}