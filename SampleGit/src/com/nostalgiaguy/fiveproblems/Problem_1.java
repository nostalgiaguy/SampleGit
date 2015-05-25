/*
 * Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.
 */

package com.nostalgiaguy.fiveproblems;

class Sum{
	static int[] VALUES = { 1, 2, 3, 4, 5, 6 };
	int sum=0;

	public void sumUsingForLoop(){
		for(int i=0;i<VALUES.length;i++){
			sum=sum+VALUES[i];
		}
		System.out.println("SumUsingForLoop=" + sum);
	}

	public void sumUsingWhileLoop(){
		int i=0;
		while(i<VALUES.length){
			sum=sum+VALUES[i];
			i++;
		}
		System.out.println("SumUsingWhileLoop=" + sum);
	}

	public int sumUsingRecurssion(int[] array, int index) {
		if (index == 0) {
			return array[0];
		} else {
			return array[index] + sumUsingRecurssion(array, index - 1);
		}
	}

	public int[] getValues(){
		return VALUES;
	}


}
public class Problem_1 {

	public static void main(String[] args) {
		new Sum().sumUsingForLoop();
		new Sum().sumUsingWhileLoop();
		System.out.println("sumUsingRecurssion=" + new Sum().sumUsingRecurssion(Sum.VALUES , Sum.VALUES.length-1));
	}
}
