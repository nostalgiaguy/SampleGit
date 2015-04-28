//**************************************************Conflicting Constructors******************************

package com.nostalgiaguy.coreconceptpage3;

public class ConflictingConstructors {

	/**
	 * Constructor
	 */
	public ConflictingConstructors() {
		System.out.println("In the constructor");
	}

	/**
	 * Constructor that throws
	 */
	public ConflictingConstructors(int value) {

		if (value < 0) {
			throw new IllegalArgumentException("Constructors: value < 0");
		}
	}

	/**
	 * Not a Constructor, because of void
	 */
	public void Constructors() {  // EXPECT COMPILE ERROR some compilers
		System.out.println("In void Constructor()");
	}

	void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);

		}
	}

	public static void main(String[] a) {
		ConflictingConstructors l = new ConflictingConstructors();
		l.method1();
		l.Constructors();
		new ConflictingConstructors(-1);    // expect Exception
	}
}