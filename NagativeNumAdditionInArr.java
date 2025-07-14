package Array;

public class NagativeNumAdditionInArr {
	
	public static void main(String[] args) {
		
		int a[] = {12, -10,58,-68,-8,45,62};
		int sum = 0;
		
		for( int i = 0 ; i<= a.length-1 ; i++)
		{
			if(a[i] < 0)
			{
				sum = sum + a[i];
			}
		}
		System.out.println("addition of nagative number is : "+sum);
	}

}
