package pack1;

public class BinarySearch {
	public static void main(String[] args) {
		
		// elements should be in sorted order 
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int key = 1 ;
		int l = 0 ; //(lowervalue)
		int h = arr.length-1; //(higher value)
		boolean flag = false; // element found nahi manun false
//		
		while(l<=h)// lower value should low then higher value 
		{
			int m = ( l + h) /2 ; // finding mid value 
			if(arr[m]==key)
			{
				System.out.println("element is found ");
				flag = true; // element found zalayaver flag value true honar
				break; // element found so break 
			}
			if(arr[m]<key)
			{
				l = m + 1;
			}
			
			if(arr[m]>key)
			{
				h= m-1;		
			}
		}
		if(flag==false)
		{
			System.out.println("element is not found ");
		}
	}

}
