package week3.day2;

/**	 
 * ASSIGNMENT 5
 * 
 * Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		


	 get the length of the array		

	 sort the array			

	 Iterate it in the reverse order

	 print the array
		
	 Required Output: Wipro, HCL , CTS, Aspire Systems
	 
	 
*/

import java.util.Arrays;

public class SortingUsingCollectionAssignment5 {

	public static void main(String[] args) {
		String[] company= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		Arrays.sort(company);
		
		for (int i = company.length-1; i >=0 ; i--) {
			System.out.print(company[i]+", ");
		}
	}

	}

