package ch.bbw.draheim.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author Paul Draheim
 * @version 0.0.1
 */
public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void setup() {
		testee = new Calculator();
	}
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubstractionZweiPositiveIsOk() {
		assertTrue(testee.substraktion(25, 10) == 15);
	}

}
