package com.bhubanananda;

/**
 * The Class FinalParameter.
 *
 * @author Bhubanananda
 */
public class FinalParameter {

	/**
	 * Cube.
	 *
	 * @param n the n
	 */
	void cube(final int n) {
//		n = n + 2;// can't be changed as n is final
		System.out.println(n);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		FinalParameter b = new FinalParameter();
		b.cube(5);
	}
}
