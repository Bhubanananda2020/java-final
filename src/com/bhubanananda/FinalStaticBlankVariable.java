package com.bhubanananda;

/**
 * The Class FinalStaticBlankVariable.
 *
 * @author Bhubanananda
 */
public class FinalStaticBlankVariable {

	/** The Constant data. */
	static final int data;// static blank final variable

	/* Compile Time Error */
//	static void FinalStaticBlankVariable() {
//		data = 50;
//	}

	/* Compile Time Error */
//	FinalStaticBlankVariable() {
//		data = 50;
//	}

	static {
		data = 50;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		System.out.println(FinalStaticBlankVariable.data);
	}
}
