package week3.day2;

/**
 * ASSIGNMENT 3
	 * Pseudo code 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	 *
	 *Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	 * c) Create a empty Set 
	 * d) Iterate the String array
                 d.1) add each word into Set
	 * e) Print the Set values which is having unique words
*/

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesWordsAssignment3 {

	public static void main(String[] args) {
String text = "We learn java basics as part of java sessions in java week1";
		
		String[] textArr=text.split(" ");
		
		Set<String> set=new LinkedHashSet<String>();
		
		for (int i = 0; i < textArr.length; i++) {
			set.add(textArr[i]);
		}
		
		System.out.print(set);
	}

	}

