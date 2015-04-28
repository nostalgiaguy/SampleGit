package com.nostalgiaguy.coreconceptpage2;

class A {

	protected class Inner {

		public Inner() {
			System.out.println("A.Inner()");
		}

		public void f() {
			System.out.println("A.Inner.f()");
		}
	}
	private Inner y = new Inner();

	public A() {
		System.out.println("New A()");
	}

	public void insertInner(Inner yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}
}

public class Main extends A {

	public class B extends A.Inner {

		public B() {
			System.out.println("Main.B()");
		}

		@Override

		public void f() {
			System.out.println("Main.B.f()");
		}
	}

	public Main() {
		insertInner(new B());
	}

	public static void main(String[] args) {

		A e2 = new Main();
        System.out.println("****************************************************");
		e2.g();
	}
}
