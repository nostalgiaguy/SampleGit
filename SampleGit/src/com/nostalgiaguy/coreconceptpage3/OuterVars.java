//***********************************************Access outer variables example****************************************
package com.nostalgiaguy.coreconceptpage3;

public class OuterVars {

	int cnt = 0;

	public static void main(String args[]) {

		OuterVars otv = new OuterVars();
		otv.go();
	}


	public class Cnt {

		int cnt = 10;
		public void increment() {
			cnt++;
			OuterVars.this.cnt++;
		}

		public void dispValues() {
			System.out.println("Inner: " + cnt);
			System.out.println("Outer: " + OuterVars.this.cnt);

		}
	}

	public void go() {

		Cnt counter = new Cnt();

		counter.increment();

		counter.increment();

		counter.increment();

		counter.dispValues();
	}
}
