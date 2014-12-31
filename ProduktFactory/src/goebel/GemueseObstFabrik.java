package goebel;
/**
 * Erstellt Gemuese/Obst produkte
 * @author Melanie Goebel
 * @version 2014-12-31
 */
public class GemueseObstFabrik extends Fabrik {
	@Override
	public Produkt erzeuge(String produkt) {
		Produkt p = null;
		switch(produkt){
		case "FrischerSalat":
			p = new FrischerSalat();
			break;
		}
		return p;
	}
}
