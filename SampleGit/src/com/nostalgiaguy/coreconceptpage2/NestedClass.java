package com.nostalgiaguy.coreconceptpage2;

//Nested classes can access all members of all levels of the 
//classes they are nested within.

public class NestedClass {

	public static void main(String[] args) {

		System.out.println("approach 1:");
		MN mna = new MN();
		MN.A mnaa = mna.new A();
		MN.A.B mnaab = mnaa.new B();
		mnaab.h();
		
		System.out.println("approach 2:");
		MN.A.B c=new MN().new A().new B();
		c.h();
		
		System.out.println("approach 3:");
		new MN().new A().new B().h();
	}
}

class MN {

	private void f() {
		System.out.println("Function MN.f()");
	}

	class A {

		private void g() {
			System.out.println("Function A.f()");
		}

		public class B {

			void h() {
				g();
				f();
			}

		}
	}
}