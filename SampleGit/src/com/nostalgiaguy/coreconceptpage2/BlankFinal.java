//Initializing final fields

package com.nostalgiaguy.coreconceptpage2;

class P {

	private int i;

	P(int i) {

		this.i = i;
	}

	@Override
	public String toString() {

		return "[" + new Integer(this.i).toString() + "]";
	}
}

public class BlankFinal {

	private final int x = 0; // Initialized final
	private final int y; // Blank final
	private final P z; // Blank final reference

	// Blank finals MUST be initialized in the constructor:
	public BlankFinal() {

		y = 1; // Initialize blank final

		z = new P(1); // Initialize blank final reference

		System.out.println("Initializing BlankFinal : y = " + this.y + ", z = " + this.z);
	}

	public BlankFinal(int x) {

		y = x; // Initialize blank final

		z = new P(x); // Initialize blank final reference

		System.out.println("Initializing BlankFinal : y = " + this.y + ", z = " + this.z);

	}

	public static void main(String[] args) {

		new BlankFinal();

		new BlankFinal(47);
	
	}
}
