package goebel;

import java.util.ArrayList;
import java.util.List;
/**
 * Rechnet einen modifier mit jeden Wert der Liste values. In die Liste koennen Werte hinzugefuegt und
 * entfernt werde sowie den modifier geaendert.
 * @author Melanie Goebel
 * @version 2014-11-10
 */
public class Calculator {

	private List<Double> values;

	private double modifier;

	private Calcuable operator;

	public Calculator() {
		values = new ArrayList<Double>();
	}
	/**
	 * Fuegt einen Wert zur Liste hinzu.
	 * @param den Wert in double
	 */
	public void addValue(double value) {
		values.add(value);
	}
    /**
     * Setzt den modifier auf einen Wert
     * @param den Wert in double
     */
	public void setModifier(double modifier) {
		this.modifier = modifier;
	}
	/**
	 * Setzt den Operator fuer die Rechnung
	 * @param operator als Calcuable
	 */
	public void setOperator(Calcuable operator){
	   this.operator = operator;	
	}
	/**
	 * Loescht einen bestimmten Wert aus der Liste 
	 * (den ersten mit diesem Wert in der Liste, darauffolgende werden ignoriert).
	 * @param den Wert in double
	 */
	public void removeValue(double value) {
		values.remove(value);
	}
	/**
	 * Rechnet alle Werte aus der Liste mit den modifier.
	 * @return die Ergebnisse in einer Liste
	 */
	public List<Double> processCalculations() {
		
		return operator.processCalculations(values, modifier);
	}
    /**
     * Gibt die Liste als Text zurueck.
     * @return der Text
     */
	public String toString() {
		String v = "";
		for(double value: values){
			v += value + ","; 
		}
		return v;
	}

}
