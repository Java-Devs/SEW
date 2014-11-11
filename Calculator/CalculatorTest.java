package goebel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Testen der Methoden von Calculator
 * @author Melanie Goebel
 * @version 2014-11-11
 */
public class CalculatorTest {
	Calculator c;

	@Before
	public void testCalculator() {
		c = new Calculator();
	}
	
	/**
	 * Testet was rauskommt, wenn in values nichts drinnen ist.
	 */
	@Test
	public void testToStringNull() {
		assertEquals("", c.toString());
	}
	@Test
	/**
	 * Testen wenn ein Element in values drinnen ist.
	 */
	public void testToString() {
		c.addValue(2.0);
		assertEquals("2.0,", c.toString());
	}
	
	@Test
	/**
	 * Testen von hinzufuegen eines Wertes ohne .
	 */
	public void testAddValue1() {
		c.addValue(2);
		assertEquals("2.0,", c.toString());
	}
	@Test
	/**
	 * Testen von 2 Werten in Values, eins mit Minus
	 */
	public void testAddValue2() {
		c.addValue(-1);
		c.addValue(3);
		assertEquals("-1.0,3.0,", c.toString());
	}
	@Test
	/**
	 * Testen von Entfernen eines vorhandenen Wertes
	 */
	public void testRemoveValue() {
		c.addValue(-1);
		c.addValue(6.2);
		c.removeValue(6.2);
		assertEquals("-1.0,",c.toString());
	}
	@Test
	/**
	 * Testen von Entfernen wenn mehrere Werte vorhanden sind
	 */
	public void testRemoveValue2() {
		c.addValue(6.2);
		c.addValue(7.2);
		c.addValue(6.2);
		c.addValue(1);
		c.removeValue(6.2);
		assertEquals("7.2,6.2,1.0,",c.toString());
	}

	@Test
	/**
	 * Testen von ProcessCalculations wenn keine Werte in values sind
	 */
	public void testProcessCalculationsNoValues() {
		c.setModifier(3);
		c.setOperator(new Addition());
		c.processCalculations();
		assertEquals("", c.toString());
	}
	@Test
	/**
	 * Testen von ProcessCalculations wenn Werte in values sind. (Addition)
	 */
	public void testProcessCalculationsA() {
		c.addValue(2.0);
		c.addValue(1.2);
		c.setModifier(3);
		c.setOperator(new Addition());
		c.processCalculations();
		assertEquals("5.0,4.2,", c.toString());
	}
	@Test
	/**
	 * Testen von ProcessCalculations wenn Werte in values sind. (Substitution)
	 */
	public void testProcessCalculationsS() {
		c.addValue(2.0);
		c.addValue(1.2);
		c.setModifier(4);
		c.setOperator(new Substraction());
		c.processCalculations();
		assertEquals("-2.0,-2.8,", c.toString());
	}
	@Test
	/**
	 * Testen von ProcessCalculations wenn Werte in values sind. (Division)
	 */
	public void testProcessCalculationsD() {
		c.addValue(2.0);
		c.addValue(1.2);
		c.setModifier(4);
		c.setOperator(new Division());
		c.processCalculations();
		assertEquals("0.5,0.3,", c.toString());
	}
	@Test
	/**
	 * Testen von ProcessCalculations wenn Werte in values sind. (Multiplikation)
	 */
	public void testProcessCalculationsM() {
		c.addValue(2.0);
		c.addValue(1.2);
		c.setModifier(4);
		c.setOperator(new Multiplication());
		c.processCalculations();
		assertEquals("8.0,4.8,", c.toString());
	}
	@Test
	/**
	 * Testen von ProcessCalculations wenn Werte in values sind und modifier 0 ist. (Division)
	 */
	public void testProcessCalculationsD0() {
		c.addValue(2.0);
		c.addValue(1.2);
		c.setModifier(0);
		c.setOperator(new Division());
		c.processCalculations();
		assertEquals("2.0,1.2,", c.toString());
	}
	@Test
	/**
	 * Testen von ProcessCalculations wenn Werte in values sind und modifier nicht geandert.
	 */
	public void testProcessCalculations1() {
		c.addValue(2.0);
		c.addValue(1.2);
		c.setOperator(new Multiplication());
		c.processCalculations();
		assertEquals("2.0,1.2,", c.toString());
	}
	



}
