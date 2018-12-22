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
    void testSummeZweiNegativeIsOk() {
        assertTrue(testee.summe(-10, -25) == -35);
    }

    @Test
    void testSummeZweiNullIsOk() {
        assertTrue(testee.summe(0, 0) == 0);
    }

    @Test
    void testSummePositivUndNegativIsOk() {
        assertTrue(testee.summe(-10, 25) == 15);
    }

    @Test
    void testSummePositivUndNullIsOk() {
        assertTrue(testee.summe(10, 0) == 10);
    }

    @Test(expected = ArithmeticException.class)
    void testSummePositivUndMaxValueReturnsException() {
        testee.summe(Integer.MAX_VALUE, 25);
    }

    @Test(expected = ArithmeticException.class)
    void testSummeNegativUndMinValueReturnsException() {
        testee.summe(Integer.MIN_VALUE, -10);
    }

    @Test
    void testSummeGrosseZahlenIsOk() {
        assertTrue(testee.summe(1948294, 929182) == 2877476);
    }
	
	

	@Test(expected =  ArithmeticException.class)
	public void testDivisionDurchNullReturnsException() {
		testee.division(10, 0);
	}
	
	@Test
	public void testDivisionDurchNullReturnsError() throws ArithmeticException {
		testee.division(10, 0);
	}
}
