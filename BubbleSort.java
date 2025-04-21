package pack1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = new int[] {4,2,1,5,3};
		System.out.println("array befor sorting "+Arrays.toString(arr));
		
		int n = arr.length;
		
		for(int i = 0 ; i<n-1 ; i++)// number for passes 

		{
			for(int j = 0 ; j<n-1 ; j++) // comparing and swaping
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;					
				}
			}
		}
		System.out.println("Array after sorting: "+Arrays.toString(arr));
	}
	

}
