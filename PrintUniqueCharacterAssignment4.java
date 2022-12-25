package week3.day2;

/**
 * ASSIGNMENT 4
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
*/

import java.util.HashSet;
import java.util.Set;


public class PrintUniqueCharacterAssignment4 {

	public static void main(String[] args) {
		String name="Sankar";
		char[] charArray = name.toCharArray();
		
		Set<Character> nameSet=new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(nameSet.contains(charArray[i])) {
				nameSet.remove(charArray[i]);
				continue;
			}	
			nameSet.add(charArray[i]);
		}
		
		System.out.println(nameSet);
		
	}
	}

