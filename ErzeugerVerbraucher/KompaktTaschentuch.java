package goebel;
/**
 * Ein Taschentuch speziell KompaktTaschentuch, dass den Namen zurueck gibt.
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class KompaktTaschentuch implements Produkt{
	private String name;

	/**
	 * Konstruktor zum Festlegen des Produktnamens
	 * @param name
	 */
	public KompaktTaschentuch(){
		name = "KompaktTaschentuch";
	}
	
	@Override
	public String getName() {
		return name;

	}
}