package com.nostalgiaguy.coreconceptpage1;


public class InnerClassRef {

	public static void main(String[] args) {

		InnerClassRef inner1 = new InnerClassRef();
		inner1.boat("Athens");
		InnerClassRef inner2 = new InnerClassRef();
		// Defining references to inner classes:
		InnerClassRef.C c = inner2.cont();
		InnerClassRef.D d = inner2.to("Thessaloniki");
	}
	class C {

		private int i = 11;
		public int value() {
			return i;
		}
	}
	class D {

		private String str;
		D(String whereTo) {
			str = whereTo;
		}

		String readLabel() {
			return str;
		}
	}
	public D to(String s) {
		return new D(s);
	}

	public C cont() {
		return new C();
	}

	public void boat(String dest) {
		C c = cont();
		D d = to(dest);
		System.out.println(d.readLabel());
	}
}