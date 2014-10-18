package goebel;
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