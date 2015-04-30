package com.nostalgiaguy.coreconceptpage4;

class A1{
	private String s;
	
	public A1(){
		System.out.println("A1()");
		s="constructed";
	}
	
	public String toString(){
		return s;
	}
}
public class Composition {
	private String s1="happi";
	private String s2="birthday";
	private String s3, s4;
	private int i;
	private float toy;
	private A1 obj;

	public Composition(){
		s3="to";
		i=50;
		toy=3.14F;
		obj=new A1();
	}
	
	public String toString(){
		if(s4==null){
			s4="you";
		}
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n"					 					 
			 + "s4 = " + s4 + "\n" + "i = " + i + "\n" + "toy = " + toy + "\n" 
		     + "castille = " + obj;					    
	}
	public static void main(String[] args) {
		Composition b=new Composition();
		System.out.println(b);
	}
}
