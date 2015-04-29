//*******************************************Avoid side effects with object.clone************************
package com.nostalgiaguy.coreconceptpage4;
import java.util.Date;

/**
 * Simple demo of avoiding side-effects by using Object.clone() to duplicate an
 * object before passing it to your enemy's methods. Cloneable is a "marker"
 * interface: it has no methods, but is tested for by Object.clone.
 *
 * If you implement it, you tell Object.clone that your data is stable enough
 * that field-by-field copy is OK.
 */

class Enemy {
	public void mungeFunc(SideEffects sdf) {
		System.out.println("Object is " + sdf);
		sdf.year = 0;
		sdf.date.setYear(72);    // Ignore deprecation warnings
	}
}
public class SideEffects implements Cloneable {
	/**
	 * When we clone a "SideEffects", this REFERENCE gets cloned
	 */
	public Date date;
	/**
	 * When we clone a "SideEffects", this integer does NOT get cloned
	 */
	volatile int year;

	public static void main(String[] argv) throws CloneNotSupportedException {
		new SideEffects().process();
	}
	SideEffects() {
		date = new Date();  // today
		year = date.getYear();
	}

	public void process() throws CloneNotSupportedException {

		Enemy enemy = new Enemy();
		System.out.println("We have seen the enemy, and he is " + enemy);
		System.out.println("Today is " + date );
		System.out.println("And the year is " + year);
		enemy.mungeFunc((SideEffects) this.clone());
		System.out.println("Why, I believe it is now " + date);
		if (year == 0){                                                      // should not happen!!
			System.out.println("** PANIC IN YEAR ZERO **");
		}
		System.out.println("But wait, the year is still " + year);
		enemy.mungeFunc(this);
		System.out.println("Now I'm certain that it's " + date);
		System.out.println("Now the year is  " + year);
	}
}
