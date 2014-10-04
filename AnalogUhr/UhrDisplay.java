package goebel;

import java.awt.*;

import javax.swing.*;

/**
 * Zeichnen der Analoguhr
 * @author Melanie Goebel
 * @version 2014-10-03
 */
public class UhrDisplay extends JPanel{
	private int mittelpunkt;
	
	@Override
	public void paint(Graphics g) {
		int radius = 0;
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(new Color(152,223,243));
		if(this.getWidth()>=this.getHeight()){
			radius = this.getHeight();
		}else{
			radius = this.getWidth();
		}
		mittelpunkt = radius/2;
		g.fillOval(0, 0, radius, radius);
		g.setColor(Color.BLACK);
		g.fillOval(radius/2-radius/80, radius/2-radius/80, radius/40, radius/40);
	}
	public int gradToX(double grad, int r) { 
		return (int)(mittelpunkt + r * Math.cos(Math.toRadians(grad)-Math.PI/2)+0.5); 
	} 
	public int gradToY(double grad, int r) {
		return (int)(mittelpunkt + r * Math.sin(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}

}