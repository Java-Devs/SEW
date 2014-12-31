package goebel;
/**
 * Erstellt Elekronikprodukte
 * @author Melanie Goebel
 * @version 2014-12-31
 */
public class Elektronikfabrik extends Fabrik {
	@Override
	public Produkt erzeuge(String produkt) {
		Produkt p = null;
		switch(produkt){
		case "USBComputerMaus":
			p = new USBComputerMaus();
			break;
		case "USBComputerTastatur":
			p = new USBComputerTastatur();
			break;
		case "USBStick":
			p = new USBStick();
			break;
		}
		return p;
	}
}
