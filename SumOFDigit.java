package pack1;

public class SumOFDigit {
	public static void main(String[] args) {
		
		int num = 1256;
		int temp = num ;
		int sum = 0;
		int rev ; 
		
		while(temp != 0 )
		{
			rev = temp % 10; // taking last digit form number 
			sum = sum + rev ; // adding into sum 
			temp = temp / 10 ; // removing the last digit form number 
		}
		System.out.println(sum);
	}

}
