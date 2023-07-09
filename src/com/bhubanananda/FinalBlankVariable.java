package com.bhubanananda;

/**
 * The Class FinalBlankVariable.
 *
 * @author Bhubanananda
 */
public class FinalBlankVariable {

	/** The speedlimit. */
	final int speedlimit;// blank final variable

	/**
	 * Instantiates a new final blank variable.
	 */
	/* Compile Time Error */
//	void FinalBlankVariable() {
//		speedlimit = 70;
//		System.out.println(speedlimit);
//	}

	/**
	 * Instantiates a new final blank variable.
	 */
	FinalBlankVariable() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new FinalBlankVariable();
	}
}
