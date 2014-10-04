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
	private int radius;
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight()); // Hintergrund in grau
		g.setColor(new Color(152,223,243));
		if(this.getWidth()>=this.getHeight()){ // Damit sich die Uhr anpasst und zu kein Oval wird
			radius = this.getHeight();
			mittelpunkt = radius/2;
		}else{
			radius = this.getWidth();
			mittelpunkt = radius/2;
		}
		g.fillOval(0, 0, radius, radius); // Die Uhr
		g.setColor(Color.BLACK);
		g.fillOval(radius/2-radius/80, radius/2-radius/80, radius/40, radius/40); // Den Mittelpunkt kennzeichnen
		for (int i = 0; i < 12; i++) { // Die Striche fuer die Stunden
			g.drawLine(gradToX(i*360/12,radius/2),gradToY(i*360/12,radius/2),gradToX(i*360/12,(int)(radius/2.5)),gradToY(i*360/12,(int)(radius/2.5)));
		}
		for (int i = 0; i < 60; i++) { // Die Striche fuer die Minuten
			g.drawLine(gradToX(i*360/60,radius/2),gradToY(i*360/60,radius/2),gradToX(i*360/60,(int)(radius/2.1)),gradToY(i*360/60,(int)(radius/2.1)));
		}
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den x-Wert aus.
	 * @param grad die Gradanzahl
	 * @param r den Radius
	 * @return den x-Wert
	 */
	public int gradToX(double grad, int r) { 
		return (int)((radius/2) + r * Math.cos(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}
	/**
	 * Rechnet von einer Gradanzahl und Radius eines Kreis den y-Wert aus.
	 * @param grad die Gradanzahl
	 * @param r den Radius
	 * @return den y-Wert
	 */
	public int gradToY(double grad, int r) {
		return (int)((radius/2) + r * Math.sin(Math.toRadians(grad)-Math.PI/2)+0.5); 
	}

}