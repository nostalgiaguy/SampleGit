package com.nostalgiaguy.coreconceptpage1;

class A1 {

	char func(char c) {

		System.out.println("doh(char)");

		return 'd';
	}

	float func(float f) {

		System.out.println("doh(float)");

		return 1.0f;
	}
}


class Bart extends A1 {

	//notice tha this function is not overriden
	void func(int m) {

		System.out.println("doh(int)");
	}
	/*
	char func(char e){
		System.out.println("overriddden");
		return 'e';
		
	}
	*/
}

public class Name {

	public static void main(String[] args) {

		Bart b = new Bart();

		b.func(1);

		b.func('x');

		b.func(1.0f);

		b.func(10);
	}
} 
