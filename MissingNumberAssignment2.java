package week3.day2;

/*
 * Problem 
 * There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 */

/*
 * Psuedocode
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumberAssignment2 {

	public static void main(String[] args) {
		
		int[] numb= {9,10,7,6,4,3,1,5,2};
		
		Set<Integer> newset = new TreeSet<Integer>();
		
		for (int i = 0; i < numb.length; i++) 
		{
			newset.add(numb[i]);
		}
		
		System.out.println(newset);
		
		
		List<Integer> listarray = new ArrayList<Integer>();
		listarray.addAll(newset);
				
		for (int i = 1; i <= listarray.size(); i++) 
		{
			if(i == (listarray.get(i-1)))
			{
				
			}
			else
			{
				System.out.println("missing vaue is " +i);
				break;
			}
		}
			
		
	}


	}


