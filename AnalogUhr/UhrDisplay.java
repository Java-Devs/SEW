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
		int laenge = this.getHeight();
		int breite = this.getWidth();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, breite, laenge);
		g.setColor(new Color(152,223,243));
		if(breite>=laenge){
			mittelpunkt = laenge/2;
			g.fillOval(0, 0, laenge, laenge);
			g.setColor(Color.BLACK);
			g.fillOval(laenge/2-laenge/80, laenge/2-laenge/80, laenge/40, laenge/40);

		}else{
			mittelpunkt = breite/2;
			g.fillOval(0, 0, breite, breite);
			g.setColor(Color.BLACK);
			g.fillOval(breite/2-breite/80, breite/2-breite/80, breite/40, breite/40);

		}
	}
	public int gradToX(double grad, int r) { 
		return (int)(mittelpunkt + r * Math.cos(Math.toRadians(grad)-Math.PI/2)+0.5); 
	} 
	public int gradToY(double grad, int r) {
		return (int)(mittelpunkt + r * Math.sin(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}

}