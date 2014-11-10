package goebel;

import java.util.List;
/**
 * 
 * @author Melanie Goebel
 * @version 2014-11-10
 */
public interface Calcuable {

	/**
	 * Aendert die Werte in der Liste values um modifier und gibt die Aenderungen zurueck
	 * @param values die Liste mit den Werten
	 * @param modifier den zu aenderten Wert
	 * @return die aenderungen der Liste um modifier, in einer Liste
	 */
	public List<Double> processCalculations(List<Double> values, double modifier);

}
