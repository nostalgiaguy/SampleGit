//Final arguments to function 

package com.nostalgiaguy.coreconceptpage2;

class Giz {

	public void func() {
	}
}

public class FinalArguments {

	void with(final Giz g) {

		//! g = new Gizmo(); // Illegal -- g is final
	}

	void without(Giz g) {

		g = new Giz(); // OK -- g not final

		g.func();
	}

	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive:
	int g(final int i) {

		return i + 1;
	}

	public static void main(String[] args) {

		FinalArguments bf = new FinalArguments();

		bf.without(null);

		bf.with(null);
	}
} 
