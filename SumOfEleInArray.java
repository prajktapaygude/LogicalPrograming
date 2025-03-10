package pack1;

public class SumOfEleInArray {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0 ; i<=arr.length-1; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
		
		for(int i = 0 ; i<=arr.length-1; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println("odd == "+arr[i]);
			}
		}
		
	}
}
