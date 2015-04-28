package com.nostalgiaguy.coreconceptpage2;

class c1{
    /*
	public c1(){
		System.out.println("default constructor");
	}
	*/
	public c1(int i){		
		System.out.println("c1 constructor");
	}
}

class c2 extends c1{
	
	public c2(int i){
		super(i);
		System.out.println("c2 constructor");
	}
}
public class ConstructorClass extends c2 {

	public ConstructorClass(){
		super(1);
		System.out.println("main constructor");
	}
	
	public static void main(String[] args) {
		ConstructorClass x=new ConstructorClass();
	}
}
