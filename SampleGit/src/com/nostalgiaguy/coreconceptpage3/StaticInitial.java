//************************************Static value initialization******************************
package com.nostalgiaguy.coreconceptpage3;
class A6 {
	A6(int i) {
		System.out.println("A6(" + i + ")");
	}
	void function1(int i) {
		System.out.println("function1(" + i + ")");
	}
}
class B {
	static A6 b1 = new A6(1);
	B() {
		System.out.println("B()");
		b2.function1(1);
	}
	void function2(int i) {
		System.out.println("function2(" + i + ")");
	}
	static A6 b2 = new A6(2);
}
class C {
	A6 b3 = new A6(3);
	static A6 b4 = new A6(4);
	C() {
		System.out.println("Cupboard()");
		b4.function1(2);
	}
	void function3(int i) {
		System.out.println("function3(" + i + ")");
	}
	static A6 b5 = new A6(5);
}
public class StaticInitial {
	public static void main(String[] args) {
		System.out.println("Creating new C() in main");
		new C();
		System.out.println("Creating new C() in main");
		new C();
		t2.function2(1);
		t3.function3(1);
	}
	static B t2 = new B();
	static C t3 = new C();
}
