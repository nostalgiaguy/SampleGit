/*
 * Write a function that combines two lists by alternatingly taking elements.
 *  For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
 */
package com.nostalgiaguy.fiveproblems;

import java.util.*;

public class Problem_2 {
	
	static List<String> l1=Arrays.asList("A","B","C");
	static List<String> l2=Arrays.asList("1","2","3");
	
	public static ArrayList<String> merge(List<String> l1, List<String> l2) {
	    Iterator<String> il1 = l1.iterator();
	    Iterator<String> il2 = l2.iterator();
	    ArrayList<String> result = new ArrayList<String>();

	    while (il1.hasNext() || il2.hasNext()) {
	        if (il1.hasNext()) result.add( il1.next());
	        if (il2.hasNext()) result.add(il2.next());
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(merge(l1,l2));
	}

}
