package goebel;
/**
 * Ein Taschentuch speziell SensitiveTaschentuch, dass den Namen zurueck gibt.
 * @author Melanie Goebel
 * @version 2014-10-23
 */
public class SensitiveTaschentuch implements Produkt{
	private String name;

	/**
	 * Konstruktor zum Festlegen des Produktnamens
	 * @param name
	 */
	public SensitiveTaschentuch(){
		name = "SensitiveTaschentuch";
	}

	@Override
	public String getName() {
		return name;

	}
}