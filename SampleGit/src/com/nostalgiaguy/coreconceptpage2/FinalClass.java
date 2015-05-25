package com.nostalgiaguy.coreconceptpage2;

//remove the comment and see what happens

class A4 { //extends B{
	public A4(){
		System.out.println("I M HERE");
	}
}

//! class Further extends B {}
//error: Cannot extend final class 'B'

final class B{

	int i = 7;
	int j = 1;
	A4 x = new A4();

	void f() {

		System.out.println("B.f() function....");
	}
}

public class FinalClass {

	public static void main(String[] args) {

		B n = new B();

		n.f();

		n.i = 40;

		n.j++;



		System.out.println("n.i = "+n.i+", n.j = "+n.j);
	}
}
