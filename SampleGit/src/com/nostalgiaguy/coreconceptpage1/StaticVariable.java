package com.nostalgiaguy.coreconceptpage1;

/*
 * static method and non static method cannot have static variable. 
 */
public class StaticVariable {

	static String outsideMethod="outside any method";

	public static void main(String[] argv) {
		//	static int inStaticMethod = 42;           //uncomment
		System.out.println(outsideMethod);
		StaticVariable t = new StaticVariable();
		t.process();
	    godProcess();
	}

	void process() {
		//	static int inNonStaticMethod = 42;        //uncomment
		// EXPECT COMPILE ERROR
		//	    System.out.println("Process: " + a);
		System.out.println(outsideMethod);
	}
	
	static void godProcess(){
		int a=10;
		System.out.println(a);
	
	}
}
