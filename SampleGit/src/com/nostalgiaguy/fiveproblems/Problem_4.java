/*
 * Write a function that given a list of non negative integers, arranges them such that they form the largest possible number. 
 * For example, given [50, 2, 1, 9], the largest formed number is 95021
 * This solution is from Santiago L. Valdarrama .
 */

package com.nostalgiaguy.fiveproblems;

import java.util.Arrays;
import java.util.Comparator;

public class Problem_4 {
	
    private static Integer[] VALUES = {420, 42, 423 };

    public static void main(String[] args) {
        Arrays.sort(VALUES, new Comparator<Integer>() {

            public int compare(Integer lhs, Integer rhs) {
                String v1 = lhs.toString();
                String v2 = rhs.toString();
                return (v1 + v2).compareTo(v2 + v1) * -1;
            }
        });

        String result = "";
        for (Integer integer : VALUES) {
            result += integer.toString();
        }

        System.out.println(result);
    }  

}
