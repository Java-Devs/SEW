package goebel;
/**
 * Erstellt Tiefkuehlprodukte
 * @author Melanie Goebel
 * @version 2014-12-31
 */
public class TiefkuehlFabrik extends Fabrik{

	@Override
	public Produkt erzeuge(String produkt) {
		Produkt p = null;
		switch(produkt){
		case "TKMaronireis":
			p = new TKMaronireis();
			break;
		case "TKSpinat":
			p = new TKSpinat();
			break;
		}
		return p;
	}

}
