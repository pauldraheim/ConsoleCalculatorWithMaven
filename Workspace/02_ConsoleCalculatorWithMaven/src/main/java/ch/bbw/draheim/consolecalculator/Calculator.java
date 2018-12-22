package ch.bbw.draheim.consolecalculator;

/**
 * Calculator
 *   - kann zwei Zahlen addieren
 *   
 * @author Paul Draheim
 * @version 0.0.1
 */
public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	public int substraktion(int value1, int value2) {
		return value1 - value2;
	}
	
	public int division(int value1, int value2) {
		return value1 / value2;
	}
	
	// Kann nur getestet werden, wenn Testfiles im gleichen Ordner
	// wie diese Klasse ist, was mit der Maven Projektstruktur nicht möglich ist.
	protected int summeProtected(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	// Nur mit Hilfe einer reflection injection mit Dp4j kann eine private method getestet
	// werden, was in diesem Projekt nicht angefordert ist
	private int summePrivate(int summand1, int summand2) {
		return summand1 + summand2;
	}
}
