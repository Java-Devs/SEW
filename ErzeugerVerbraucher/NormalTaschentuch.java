package goebel;
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