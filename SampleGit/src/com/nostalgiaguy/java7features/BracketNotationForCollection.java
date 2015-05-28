package com.nostalgiaguy.java7features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BracketNotationForCollection {
	
	public static void main(String[] args) {
		
		Collection<String> s=new ArrayList<String>();
		s.add("one");
		s.add("two");
		s.add("three");
		
		System.out.println(s);
		
		//Collection<String> s2=new ArrayList{"four" , "five" , "six" };
		Collection<String> s2=new ArrayList(Arrays.asList("four" , "five" , "six" ));
		System.out.println(s2);
		
	}

}
