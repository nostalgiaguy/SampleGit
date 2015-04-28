//********************Final arguments to function************************

package com.nostalgiaguy.coreconceptpage3;

import java.util.Calendar;

/**
 * Experiment with "final" args to functions (new in 1.1)
 */

public class FinalArgs {

	public static void main(String argv[]) {

		new FinalArgs().run();
	}

	void run() {

		System.out.println("Hummm...");

		myFunc(Calendar.getInstance());

		System.out.println("Once upon a time...");
	}

	void myFunc(final Calendar d) {

		// d = null;  // this will not compile

		d.set(Calendar.YEAR, 2015); // this will compile, and changes the object
	}
}