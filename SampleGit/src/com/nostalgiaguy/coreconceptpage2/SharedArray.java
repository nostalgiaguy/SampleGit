package com.nostalgiaguy.coreconceptpage2;

public class SharedArray {

	static int[] array = new int[10];
	{
		System.out.println();
		
		System.out.println("Running initialization block.");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100.0 * Math.random());
		}
	}

	void printArray() {

		for (int i = 0; i < array.length; i++) {
	    	System.out.print(" " + array[i]);
		}

	}

	public static void main(String[] args) {


		SharedArray a1 = new SharedArray();

		a1.printArray();


		SharedArray a2 = new SharedArray();

		a2.printArray();

		System.out.println();


		a1.printArray();

		System.out.println();

	}
}