package pack1;

public class DuplicateElementsInArr {

	public static void main(String[] args) {
		
		String arr[] = new String[] {"java","c","c++","java"};
		
// approch : 1
		
		for(int i = 0 ; i<=arr.length-1; i++) //  // for taking first element form array (i =0)
		{
			for(int j = i+1 ; j<=arr.length-1; j++)// // for taking second element from array (j = i + 1)
			{
				if(arr[i]==arr[j]) //// comparing the first element with second element of array 
				{
					System.out.println("found the duplicate element : "+arr[i]);
				}
			}
		}	
	}
}
