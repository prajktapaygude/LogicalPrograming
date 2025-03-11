	package pack1;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayWithBuildInMethod {

	public static void main(String[] args) {

		int arr[] = new int[] {30,50,20,10,60};
//--------------------------------------------------------------------------		
		// Approch 1 
		/*
		System.out.println("Array Before sorting : "+Arrays.toString(arr));
		                                          // printing array in string format using list 
		Arrays.parallelSort(arr);
		System.out.println("Array After sorting : "+Arrays.toString(arr)); */
//------------------------------------------------------------
		//Approch 2 
		/*
		System.out.println("Array Before sorting : "+Arrays.toString(arr));
        Arrays.sort(arr);
		System.out.println("Array After sorting : "+Arrays.toString(arr));
         */
//----------------------------------------------------		
	    //Approch 3 desending order
		
		Integer arr1[] = new Integer[] {30,50,20,10,60};

		System.out.println("Array Before sorting : "+Arrays.toString(arr1));
		Arrays.sort(arr1, Collections.reverseOrder());
		// this method is not support primitive dataype 
		// only support to derived datatypes 
		System.out.println("Array After sorting : "+Arrays.toString(arr1));

	}
	

}
