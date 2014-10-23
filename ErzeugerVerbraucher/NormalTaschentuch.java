package goebel;
/**
 * Ein Taschentuch speziell NormalTaschentuch, dass den Namen zurueck gibt.
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class NormalTaschentuch implements Produkt{
	private String name;

	/**
	 * Konstruktor zum Festlegen des Produktnamens
	 * @param name
	 */
	public NormalTaschentuch(){
		name = "NormalTaschentuch";
	}
	
	@Override
	public String getName() {
		return name;

	}
}