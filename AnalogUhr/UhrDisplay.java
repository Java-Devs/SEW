package goebel;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

/**
 * Zeichnen der Analoguhr und deren Zeiger
 * @author Melanie Goebel
 * @version 2014-10-03
 */
public class UhrDisplay extends JPanel{
	private int mittelpunkt; // Den Mittelpunkt der Uhr
	private int durchmesser; // Den Durchmesser der Uhr
	private Control c; // Fuer Funktionen zum Berechnen
	private String[] date; // Datum Wochentag,Jahr,Monat,Tag wird gespeichert
	private int[] zeit; // Zeit wird gespeicher Stunden,Minuten,Sekunden,Millisekunden

	public UhrDisplay(Control c){
		this.c = c;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight()); // Hintergrund in grau
		g.setColor(new Color(152,223,243));
		if(this.getWidth()>=this.getHeight()){ // Damit sich die Uhr anpasst und zu kein Oval wird
			durchmesser = this.getHeight();
			mittelpunkt = durchmesser/2;
		}else{
			durchmesser = this.getWidth();
			mittelpunkt = durchmesser/2;
		}
		g.fillOval(0, 0, durchmesser, durchmesser); // Die Uhr
		g.setColor(Color.BLACK);
		for (int i = 0; i < 12; i++) { // Die Striche fuer die Stunden
			g.drawLine(c.gradToX(i*360/12,durchmesser,durchmesser/2),c.gradToY(i*360/12,durchmesser,durchmesser/2),c.gradToX(i*360/12,durchmesser,(int)(durchmesser/2.5)),c.gradToY(i*360/12,durchmesser,(int)(durchmesser/2.5)));
		}
		for (int i = 0; i < 60; i++) { // Die Striche fuer die Minuten
			g.drawLine(c.gradToX(i*360/60,durchmesser,durchmesser/2),c.gradToY(i*360/60,durchmesser,durchmesser/2),c.gradToX(i*360/60,durchmesser,(int)(durchmesser/2.1)),c.gradToY(i*360/60,durchmesser,(int)(durchmesser/2.1)));
		}
	    date = c.getDate();
	    
	    //Datum und die Box fuer das Datum zeichnen
	    g.drawRect(mittelpunkt+mittelpunkt/4, mittelpunkt-mittelpunkt/11, durchmesser/4, durchmesser/10);
	    g.setFont(new Font("Arial",Font.PLAIN,mittelpunkt/10));
	    g.drawString(date[3]+","+date[2]+"."+date[1], mittelpunkt+(int)(mittelpunkt/3.5), mittelpunkt+mittelpunkt/20);
	
	    zeit = c.getZeit();
	    g.setColor(Color.RED);
	    // Sekundenzeiger
	    g.drawLine(mittelpunkt, mittelpunkt, c.gradToX((zeit[2]+((double)zeit[3]/1000))*360/60,durchmesser,durchmesser/2), c.gradToY((zeit[2]+((double)zeit[3]/1000))*360/60,durchmesser,durchmesser/2));
	    g.setColor(Color.BLACK);
	    
	    //Stundenzeiger
	    g.fillPolygon(new int[]{mittelpunkt,  
	    		c.gradToX((zeit[0]+(double)zeit[1]/60)*360/12-5,durchmesser,durchmesser/4),
	    		c.gradToX((zeit[0]+(double)zeit[1]/60)*360/12,durchmesser,durchmesser/3),
	    		c.gradToX((zeit[0]+(double)zeit[1]/60)*360/12+5,durchmesser,durchmesser/4)}, 
	    new int[]{mittelpunkt, 
	    		c.gradToY((zeit[0]+(double)zeit[1]/60)*360/12-5,durchmesser,durchmesser/4),
	    		c.gradToY((zeit[0]+(double)zeit[1]/60)*360/12,durchmesser,durchmesser/3),
	    		c.gradToY((zeit[0]+(double)zeit[1]/60)*360/12+5,durchmesser,durchmesser/4)}, 4);
	    
	    g.fillPolygon(new int[]{mittelpunkt,  
	    		c.gradToX(((zeit[1]+(double)zeit[2]/60)*360/60-3),durchmesser,durchmesser/4),
	    		c.gradToX(((zeit[1]+(double)zeit[2]/60)*360/60),durchmesser,durchmesser/2),
	    		c.gradToX(((zeit[1]+(double)zeit[2]/60)*360/60+3),durchmesser,durchmesser/4)}, 
	    new int[]{mittelpunkt, 
	    		c.gradToY(((zeit[1]+(double)zeit[2]/60)*360/60-3),durchmesser,durchmesser/4),
	    		c.gradToY(((zeit[1]+(double)zeit[2]/60)*360/60),durchmesser,durchmesser/2),
	    		c.gradToY(((zeit[1]+(double)zeit[2]/60)*360/60+3),durchmesser,durchmesser/4)},4);
	    
		g.fillOval(durchmesser/2-durchmesser/80, durchmesser/2-durchmesser/80, durchmesser/40, durchmesser/40); // Den Mittelpunkt kennzeichnen
	
		Image pic= new ImageIcon("C:/Users/Bleedinghina/repository/SEW/AnalogUhr/data/"+c.getMondStatus()+".png").getImage();
		System.out.println(c.getMondStatus());
		g.drawImage(pic, mittelpunkt/2, (int)(mittelpunkt*1.2), mittelpunkt/3,mittelpunkt/3, null);
	}
	
}