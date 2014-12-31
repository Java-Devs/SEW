package goebel;

public class Client {
	public static void main(String[] args) {
		Fabrik f1 = new ElektronikFabrik();
		Produkt p1= f1.erzeuge("USBStick");
		Produkt p2= f1.erzeuge("USBComputerMaus");
		f1.hinzufuegen(p1);
		f1.hinzufuegen(p2);
		f1.bezahlen();
		f1.verpacken();
		System.out.println(f1.toString());
	}
	
	
}
