package com.bhubanananda;

/**
 * The Class FinalMethod.
 *
 * @author Bhubanananda
 */
public class FinalMethod {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Honda().run();
		new Bike().run();
	}
}

class Bike {
	final void run() {
		System.out.println("running");
	}
}

class Honda extends Bike {
	/* Compile Time Error */
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}
}