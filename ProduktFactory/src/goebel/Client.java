package goebel;
/**
 * Client verwendet alle Fabriken und gibt den Warenkorb aus
 * @author Melanie Goebel
 * @version 2014-12-31
 */
public class Client {
	public static void main(String[] args) {
		Fabrik f1 = new ElektronikFabrik();
		Produkt p1= f1.erzeuge("USBStick");
		Produkt p2= f1.erzeuge("USBComputerMaus");
		Produkt p3 = f1.erzeuge("USBComputerTastatur");
		f1.hinzufuegen(p1);
		f1.hinzufuegen(p2);
		f1.hinzufuegen(p3);
		f1.bezahlen();
		f1.verpacken();
		System.out.println(f1.toString()+"\n");
		
		Fabrik f2 = new GemueseObstFabrik();
		Produkt p4 = f2.erzeuge("FrischerSalat");
		f2.hinzufuegen(p4);
		System.out.println(f2.toString()+"\n");
		
		Fabrik f3 = new TiefkuehlFabrik();
		Produkt p5  = f3.erzeuge("TKMaronireis");
		Produkt p6 = f3.erzeuge("TKSpinat");
		f3.hinzufuegen(p5);
		f3.hinzufuegen(p6);
		f3.bezahlen();
		f3.verpacken();
		f3.verschicken();
		System.out.println(f3.toString()+"\n");
	}
	
	
}
