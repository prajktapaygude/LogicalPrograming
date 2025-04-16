package Array;

public class PrintDuplicateElementinArr {
	
public static void main(String[] args) {
		
		int[] arr = new int[] {10,20,10,50,30,50,80,40,30};
		
		System.out.print("Duplicate elements in array are : ");
		
		for(int i =0 ; i<arr.length;i++) // for taking first element form array (i =0)
		{
			for(int j = i + 1 ; j < arr.length;j++) // for taking second element from array (j = i + 1)
			{
				if(arr[i] == arr[j]) // comparing the first element with second element of array 
				{
					System.out.println(arr[i]);
				}
			}
		}
}
}
