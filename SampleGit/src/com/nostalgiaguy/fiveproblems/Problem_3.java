/*
 * Write a function that computes the list of the first 100 Fibonacci numbers. 
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 *  As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 */

package com.nostalgiaguy.fiveproblems;

public class Problem_3 {
	
	public static long fibonacci(int n){
		long n1=1;
		long n2=1;
		long current=2;
		
		for(int i=3;i<=n;i++){
			current=n1 + n2;
			System.out.println(current);
			n2=n1;
			n1=current;
		}
		return current;
	}
	
public static void main(String[] args) {
	System.out.println("fibonacci(100)=" + fibonacci(100));
}
}
