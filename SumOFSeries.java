package NumberSeries;

public class SumOFSeries {

	public static void main(String[] args) {
		int num = 10;
		int sum = 0;
		
	    System.out.println("series is : ");
		for(int i = 1 ; i<= num ;i++)
		{
			System.out.print(+i+" ");
			sum = sum + i;
		}
		System.out.println();
		System.out.println("sum is : "+sum);
	}
}
