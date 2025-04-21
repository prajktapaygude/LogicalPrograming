package pack1;

public class AvgOfPositiveNum {
	public static void main(String[] args) {
		
		int arr[] = {-10,14,-47,0,58,-55};
		int sum = 0;
		int count = 0;
		
		for(int i = 0 ; i<=arr.length-1; i++)
		{
			if(arr[i]>0)
			{
				sum = sum +arr[i];
				count++;
			}
		}
		if(count >0)
		{
			double average = sum/count;
			System.out.println(average);
		}
		else
		{
			System.out.println("there is no positive numbers into array");
		}
	}

}
