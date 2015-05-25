package com.nostalgiaguy.coreconceptpage2;

class one {

	one(int val) {
		System.out.println("one(" + val + ")");
	}
}


class Cr {

	one a = new one(1); // Before constructor
	
	Cr() {
		// Indicate we're in the constructor:
		System.out.println("Cr()");
		  a3 = new one(33); // Reinitialize t3
	}

	one a2 = new one(2); // After constructor

	void function() {
		System.out.println("function()");
	}

	one a3 = new one(3); // At end
}

public class InitializationOrder {

	public static void main(String[] args) {
		Cr t = new Cr();
		t.function(); // Shows that construction is done
	}
}
