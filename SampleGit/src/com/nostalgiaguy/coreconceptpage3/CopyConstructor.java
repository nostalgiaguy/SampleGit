//**************************************************Copy Constructor example******************
package com.nostalgiaguy.coreconceptpage3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class FruitQualities {

	private int w;
	private int c;
	private int firmval;
	private int ripen;
	private int sml;

	// etc.
	public FruitQualities() { // Default constructor

		// Do something meaningful...
	}

	// Other constructors:
	// ...
	// Copy constructor:
	public FruitQualities(FruitQualities frq) {

		w = frq.w;

		c = frq.c;

		firmval = frq.firmval;

		ripen = frq.ripen;

		sml = frq.sml;

		// etc.
	}
}

class Seed {
	// Members...

	public Seed() { /*

	 * Default constructor

	 */

	}

	public Seed(Seed s) { /*

	 * Copy constructor

	 */

	}
}

class Fruit {

	private FruitQualities fq;
	private int seedamnt;
	private Seed[] s;

	public Fruit(FruitQualities q, int seedCount) {

		fq = q;

		seedamnt = seedCount;

		s = new Seed[seedamnt];

		for (int i = 0; i < seedamnt; i++) {


			s[i] = new Seed();

		}
	}

	// Other constructors:
	// ...
	// Copy constructor:
	public Fruit(Fruit f) {

		fq = new FruitQualities(f.fq);

		seedamnt = f.seedamnt;

		s = new Seed[seedamnt];

		// Call all Seed copy-constructors:

		for (int i = 0; i < seedamnt; i++) {


			s[i] = new Seed(f.s[i]);

		}

		// Other copy-construction activities...
	}

	// To allow derived constructors (or other
	// methods) to put in different qualities:
	protected void addQualities(FruitQualities q) {

		fq = q;
	}

	protected FruitQualities getQualities() {

		return fq;
	}
}

class Tomato extends Fruit {

	public Tomato() {

		super(new FruitQualities(), 100);
	}

	public Tomato(Tomato t) { // Copy-constructor

		super(t); // Upcast for base copy-constructor

		// Other copy-construction activities...
	}
}

class ZebraQualities extends FruitQualities {

	private int stripedness;

	public ZebraQualities() { // Default constructor

		super();

		// do something meaningful...
	}

	public ZebraQualities(ZebraQualities z) {

		super(z);

		stripedness = z.stripedness;
	}
}

class GreenZebra extends Tomato {

	public GreenZebra() {

		addQualities(new ZebraQualities());
	}

	public GreenZebra(GreenZebra g) {

		super(g); // Calls Tomato(Tomato)

		// Restore the right qualities:

		addQualities(new ZebraQualities());
	}

	public void evaluate() {

		ZebraQualities zq = (ZebraQualities) getQualities();

		// Do something with the qualities

		// ...
	}
}

public class CopyConstructor {

	public static void main(String[] args) {

		Tomato tomato = new Tomato();

		ripenFunc(tomato); // OK

		sliceFunc(tomato); // OOPS!

		ripenFunc2(tomato); // OK

		sliceFunc2(tomato); // OK

		GreenZebra g = new GreenZebra();

		ripenFunc(g); // OOPS!

		sliceFunc(g); // OOPS!

		ripenFunc2(g); // OK

		sliceFunc2(g); // OK

		g.evaluate();

	}

	public static void ripenFunc(Tomato t) {

		// Use the "copy constructor":

		t = new Tomato(t);

		System.out.println("In ripen, t is a " + t.getClass().getName());
	}

	public static void sliceFunc(Fruit f) {

		f = new Fruit(f); // Hmmm... will this work?

		System.out.println("In slice, f is a " + f.getClass().getName());
	}

	public static void ripenFunc2(Tomato t) {

		try {


			Class c = t.getClass();


			// Use the "copy constructor":


			Constructor ct = c.getConstructor(new Class[]{c});


			Object obj = ct.newInstance(new Object[]{t});


			System.out.println("In ripen2, t is a " + obj.getClass().getName());

		} catch (Exception e) {


			System.out.println(e);

		}
	}

	public static void sliceFunc2(Fruit f) {

		try {


			Class c = f.getClass();


			Constructor ct = c.getConstructor(new Class[]{c});


			Object obj = ct.newInstance(new Object[]{f});


			System.out.println("In slice2, f is a " + obj.getClass().getName());

		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {


			System.out.println(e);

		}
	}
}
