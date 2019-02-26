package com;

// if (A.length <= 100000){

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {

	public int solution(int[] A) {
		// write your code in Java SE 8
		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();
		if (A.length <= 100000) {

			

			for (int i = 0; i < A.length; i++) {
				hset.add(A[i]);
			}

			while (hset.contains(num)) {
				num++;
			}

		}
		return num;

	}

}
