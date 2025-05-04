package pack1;

import java.util.Arrays;

public class TwoArrEqualOrNot {
public static void main(String[] args) {
	
// Approch1 : using equals method of Array Class
	int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
	int arr2[] = new int[] {1,2,3,4,5,6,7,8,9};
	boolean status = Arrays.equals(arr, arr2);
	
	if(status == true)
	{
		System.out.println("array is equal");
	}
	else
	{
		System.out.println("array is not equal");
	}
}
}
