package com.nostalgiaguy.coreconcept;

abstract class Abs {

	public Abs(int i) {
		System.out.println("Abs constructor, i = " + i);
	}

	public abstract void f();
}
public class InnerclassConst {

	public static Abs getAbs(int i) {
		return new Abs(i) {

			{
				System.out.println("Inside instance initializer");
			}

			@Override
			public void f() {
				System.out.println("In anonymous f()");
			}

		};
	}

	public static void main(String[] args) {
		Abs a = getAbs(47);
		a.f();
	}
}