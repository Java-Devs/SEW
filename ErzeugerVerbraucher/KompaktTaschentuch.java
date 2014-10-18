package goebel;
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