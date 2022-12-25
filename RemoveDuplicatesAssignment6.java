package week3.day2;

/**
 * ASSIGNMENT 6
 * 
 * Declare a String as "PayPal India"
 * Convert it into a character array
 * Declare a Set as charSet for Character
 * Declare a Set as dupCharSet for duplicate Character
 * Iterate character array and add it into charSet
 * if the character is already in the charSet then, add it to the dupCharSet
 * Check the dupCharSet elements and remove those in the charSet
 * Iterate using charSet
 * Check the iterator variable isn't equals to an empty space
 * print it
 * 
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesAssignment6 {

	public static void main(String[] args) {

		String s="PayPal India";
		char[] charArray = s.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();

		String noDup="";
		
		for (int i = 0; i < charArray.length; i++) {
			if(charSet.contains(charArray[i])) {
				dupCharSet.add(charArray[i]);
			}
			charSet.add(charArray[i]);
		}
		
			
		if(charSet.containsAll(dupCharSet)) {
			charSet.removeAll(dupCharSet);
		}
		
		noDup=charSet.toString();
		char[] noDupChar = noDup.toCharArray();
		
		for (int i = 0; i < noDupChar.length; i++) {
			if(noDupChar[i]==' ') {
				continue;
			}
			else {
				System.out.print(noDupChar[i]);
			}
		}
		

	}

}
