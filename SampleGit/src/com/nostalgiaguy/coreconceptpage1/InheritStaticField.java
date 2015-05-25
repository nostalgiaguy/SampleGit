package com.nostalgiaguy.coreconceptpage1;

class Aclass {

	static int val = 24;

	Aclass() {
		System.out.println("In Aclass::<init>");
	}

	static int fun() {
		return 12;
	}
}

class Bclass extends Aclass{
	
	Bclass(){
		System.out.println("In Bclass::<init>");
	}
}


public class InheritStaticField extends Bclass {

	public static void main(String[] c) {
		
		InheritStaticField obj = new InheritStaticField();
		System.out.println("gap in communication.");
		new InheritStaticField().start();
	}

	public void start() {

		System.out.println("In InheritStaticFields::start");
		System.out.println("Val is " + val);
		System.out.println("fun is " + fun());
	}
}

