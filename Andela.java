package com;
// Fibonacci series - A series in which the next number is found by adding up the two numbers before it.

import java.util.ArrayList;

// Write a function such that given an integer N , it will generate and print the Fibonacci sequence up to Nth item.

// Conditions: N > 0, Use recursion to obtain the results

// e.g. Given N = 7, print out  1 1 2 3 5 8 13 ... 

// Write a test to ensure that given N = 7, the sequence equals {1,1,2,3,5,8,13}

public class Andela {

	public static void main(String[] args) {
		String output = fibbanacci(7,1,1);
		System.out.println(output);
		//System.out.print(fibbanacci(7,1,1));
	}

	
	public static String fibbanacci(int n, int t1, int t2) {
		int i = 1;
		String output = "";
		output += "{";
		while (i <= n) {
			output += t1 + " , ";

			int sum = t1 + t2;
			
			t1 = t2;
			t2 = sum;

			i++;
		}
		output += "}";
		return output;
	}
	
	public static String emailCreator(String S, String C) {
		String finlString = "", lastValue = "",newString = "";
		String[] newArrayOfNames2 = null;
		String[] staffNames = null;
		ArrayList<String> list1 = new ArrayList<String>();
		String strCount = "1";
		int intCount = 0;
		// split string s to get emails
		C = C.toLowerCase();

		S = S.toLowerCase();
		S = S.replace("-", "");
		S = S.replace("; ", "<seperator>");

		staffNames = S.split("<seperator>");
		for (int i = 0; i < staffNames.length; i++) {
			newString = staffNames[i];
			
			newArrayOfNames2 = newString.split(" ");
			// split each name to f mf l


			if (newArrayOfNames2.length > 2) {
		
				

				lastValue = newArrayOfNames2[2] + "_" + newArrayOfNames2[0];
				//--------------------


				if (list1.contains(lastValue)) {				
					
					intCount = Integer.parseInt(strCount);
					intCount++;
					strCount = String.valueOf(intCount);
					lastValue = lastValue + strCount;

				}
				
				list1.add(lastValue);


				//------------------
				lastValue = lastValue + "@" + C + ".com; ";
				
				strCount = "1";
				intCount = 1;
				finlString += lastValue;
			} else {
				lastValue = newArrayOfNames2[1] + "_" + newArrayOfNames2[0] ;
				//--------------------


				if (list1.contains(lastValue)) {				
					
					intCount = Integer.parseInt(strCount);
					intCount++;
					strCount = String.valueOf(intCount);
					lastValue = lastValue + strCount;

				}
				
				list1.add(lastValue);


				//------------------
				lastValue = lastValue + "@" + C + ".com; ";
				strCount = "1";
				intCount = 1;
				
				finlString += lastValue;
			}

		}

		return finlString;

	}
}