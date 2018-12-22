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
	public void testSummeZweiNegativeIsOk() {
        assertTrue(testee.summe(-10, -25) == -35);
    }

    @Test
    public void testSummeZweiNullIsOk() {
        assertTrue(testee.summe(0, 0) == 0);
    }

    @Test
    public void testSummePositivUndNegativIsOk() {
        assertTrue(testee.summe(-10, 25) == 15);
    }

    @Test
    public void testSummePositivUndNullIsOk() {
        assertTrue(testee.summe(10, 0) == 10);
    }

    @Test
    public void testSummePositivUndMaxValueReturnsNegative() {
        assertTrue(testee.summe(Integer.MAX_VALUE, 10) < 0);
    }

    @Test
    public void testSummeNegativUndMinValueReturnsPositive() {
        assertTrue(testee.summe(Integer.MIN_VALUE, -10) > 0);
    }

    @Test
    public void testSummeGrosseZahlenIsOk() {
        assertTrue(testee.summe(1948294, 929182) == 2877476);
    }
    
	
    
	@Test
	public void testSubstractionZweiPositiveIsOk() {
		assertTrue(testee.substraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubstractionZweiNegativeIsOk() {
		assertTrue(testee.substraktion(-25, -10) == -15);
    }

    @Test
    public void testSubstractionZweiMalNullIsOk() {
		assertTrue(testee.substraktion(0, 0) == 0);
    }

    @Test
    public void testSubstractionPositiveUndNegativeIsOk() {
		assertTrue(testee.substraktion(25, -10) == 35);
    }

    @Test
    public void testSubstractionPositiveUndNullIsOk() {
		assertTrue(testee.substraktion(25, 0) == 25);
    }

    @Test
    public void testSubstractionMaxValueUndNegativeReturnsException() {
		assertTrue(testee.substraktion(Integer.MAX_VALUE, -10) < 0);
    }

    @Test
    public void testSubstractionMinValueUndPositiveReturnsException() {
		assertTrue(testee.substraktion(Integer.MIN_VALUE, 10) > 0);
    }

    @Test
    public void testSubstractionNullUndPositiveWenigerAlsNull() {
		assertTrue(testee.substraktion(0, 2) < 0);
    }
	
	

	@Test(expected =  ArithmeticException.class)
	public void testDivisionDurchNullReturnsException() {
		testee.division(10, 0);
	}
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(10, 2) == 5);
    }

    @Test
    public void testDivisionZweiNegativeIsOk() {
		assertTrue(testee.division(-10, -2) == 5);
    }

    @Test
    public void testDivisionPositiveUndNegativeIsOk() {
		assertTrue(testee.division(-10, 2) == -5);
    }

    @Test
    public void testDivisionNullDurchPositiveIsOk() {
		assertTrue(testee.division(0, 2) == 0);
    }

    @Test
    public void testDivisionNullDurchNegativeIsOk() {
		assertTrue(testee.division(0, -2) == 0);
    }

    @Test
    public void testDivisionZahlMitKommaWirdGerundet() {
		assertTrue(testee.division(7, 6) == 1);
    }
    
    @Test
    public void testDivisionZweiteZahlGrösserAlsErsteReturnsZero() {
		assertTrue(testee.division(2, 5) == 0);
    }
	
	@Test
	public void testDivisionDurchNullReturnsError() throws ArithmeticException {
		testee.division(10, 0);
	}
	
}
