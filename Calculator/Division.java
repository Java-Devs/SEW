package goebel;

import java.util.List;
/**
 * Dividiert alle Werte der Liste um modifier (ausser modifier ist 0)
 * @author Melanie Goebel
 * @version 2014-11-10
 */
public class Division implements Calcuable {


	/**
	 * @see Calcuable#processCalculations()
	 */
	public List<Double> processCalculations(List<Double> values, double modifier) {
		if(modifier != 0.0){
		List<Double> temp = values;
		for(int i = 0; i < temp.size(); i++){
			temp.set(i, temp.get(i)/modifier);
		}
		return temp;
		}else{
			System.err.println("Division durch 0 nicht moeglich!!");
			return null;
		}
	}

}
