package week3.day2;
/**
 * ASSIGNMENT 1
 *  Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		       output= 7;

		
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestAssignment1 {


		public static void main(String[] args) {
			
			int[] data={3,2,11,4,6,7,2,3,3,6,7};
			
			Set<Integer> dataSet=new TreeSet<Integer>();
			List<Integer> dataList=new ArrayList<Integer>();
			
			for (int i = 0; i < data.length; i++) {
				dataSet.add(data[i]);
			}
			System.out.println("Set:");
			System.out.println(dataSet);
			
			dataList.addAll(dataSet);
			
			System.out.println("List:");
			System.out.println(dataList);
			
			System.out.println("Second last number is: "+dataList.get((dataList.size()-1)-1));
			
			
		}
	}


