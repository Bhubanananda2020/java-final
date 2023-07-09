package com.bhubanananda;

/**
 * The Class FinalVariabl.
 *
 * @author Bhubanananda
 */
public class FinalVariabl {

	/** The data. */
	final int data = 20;

	/**
	 * Run.
	 */
	void run() {
		System.out.println(data);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

//		data =40;   Compile Time Error
		new FinalVariabl().run();
	}
}
