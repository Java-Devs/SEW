package goebel;

public interface Lager{
	/**
	 * Entfernt Produkte (gewissen Anzahl) aus dem Lager. 
	 * @param p die Produkte
	 * @param anzahl wieviele Produkte
	 * @return ob es funktioniert hat 0 steht für ja.
	 */
	public boolean abfassen(Produkt p, int anzahl);
	/**
	 * Lagert Produkte (gewisse Anzahl) in dem Lager.
	 * @param p die Produkte
	 * @param anzahl wieviele Produkte
	 * @return ob es funktioniert hat 0 steht für ja.
	 */
	public boolean lagern(Produkt p, int anzahl);
	/**
	 * Ueberpruft ob genuegend Platz ist im Lager
	 * @param anzahl die Anzahl der Produkte die zu lagern sind
	 * @return ob es lagerbar ist
	 */
	public boolean gehtSichAus(int anzahl);
	/**
	 * Ueberpruft ob es genuegend Produkte lagern gibt.
	 * @param p die Produkte die gesucht sind
	 * @param anzahl die gewuenschte anzahl
	 * @return ob genuegend auf lager ist
	 */
	public boolean gibtGenuegend(Produkt p, int anzahl);
	/**
	 * Gibt alle Produkte aus die gelagert werden (sowas wie einen Katalog)
	 * @return die Produkte die lagernd sind.
	 */
	public Produkt[] getProdukte();
}