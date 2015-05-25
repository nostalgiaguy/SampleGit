package com.nostalgiaguy.coreconceptpage3;

import java.util.Random;

class A {

	int i; // Package access

	public A(int i) {
		this.i = i;
	}
}

public class FinalFields {

	private static Random rand = new Random();
	private String str;

	public FinalFields(String str) {
		this.str = str;
	}
	// Can be compile-time constants:
	private final int ONE = 9;
	private static final int TWO = 99;
	// Typical public constant:
	public static final int THREE = 39;
	// Cannot be compile-time constants:
	private final int X = rand.nextInt(20);
	static final int Y = rand.nextInt(20);
	private A a1 = new A(11);
	private final A a2 = new A(22);
	private static final A a3 = new A(33);
	// Arrays:
	private final int[] array = {1, 2, 3, 4, 5, 6};

	@Override
	public String toString() {

		return str + ": " + "i4 = " + X + ", i5 = " + Y;
	}

	public static void main(String[] args) {

		FinalFields fd1 = new FinalFields("fd1");
		//! fd1.ONE++; // Error: can't change value
		fd1.a2.i++; // Object isn't constant!
		fd1.a1 = new A(9); // OK -- not final

		for (int i = 0; i < fd1.array.length; i++) {
			fd1.array[i]++; // Object isn't constant!
		}    //! fd1.v2 = new Value(0); // Error: Can't

		//! fd1.v3 = new Value(1); // change reference

		//! fd1.a = new int[3];

		System.out.println(fd1);
		System.out.println("Creating new FinalFields");
		FinalFields fd2 = new FinalFields("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}
}