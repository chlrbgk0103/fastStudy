package fc.java.course2.part1;

import fc.java.course2.part1.model2.MinMaxFinder;

public class MinMaxFinderTest {

	public static void main(String[] args) {
		
		int arr[] = {12,3,9,2,7};
		
		int min = MinMaxFinder.findMin(arr);
		int max = MinMaxFinder.findMax(arr);
	
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
	}
	
}
