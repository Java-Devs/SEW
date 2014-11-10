package goebel;

import java.util.List;
/**
 * Addiert alle Werte der Liste um modifier
 * @author Melanie Goebel
 * @version 2014-11-10
 */
public class Addition implements Calcuable {


	/**
	 * @see Calcuable#processCalculations()
	 */
	public List<Double> processCalculations(List<Double> values, double modifier) {
		List<Double> temp = values;
		for(int i = 0; i < temp.size(); i++){
			temp.set(i, temp.get(i)+modifier);
		}
		return temp;
	}

}
