//****************************Full Initialization process*********************************

package com.nostalgiaguy.coreconceptpage3;

class A5 {

	private int x = 9;
	protected int y;

	A5() {

		System.out.println("x = " + x + ", y = " + y);

		y = 39;
	}
	private static int i = print("static A5.i initialized");

	static int print(String str) {

		System.out.println(str);

		return 47;
	}
}

public class FullInitial extends A5 {

	private int var = print("FullInitial.k initialized");

	public FullInitial() {



		System.out.println("var = " + var);

		System.out.println("y = " + y);

	}

	private static int j = print("static FullInitial.j initialized");

	public static void main(String[] args) {



		System.out.println("FullInitial constructor***********************");



		FullInitial b = new FullInitial();

	}
}
