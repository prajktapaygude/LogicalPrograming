package pack1;

public class FindDivisorOfNum {
	public static void main(String[] args) {
		
		int number = 10;
		
		System.err.println("divisors of 10 is : ");
		for(int i = 1 ; i<=number ; i++)
		{
			if(number % i == 0)
			{
				System.out.println(i);
			}
		}
	}

}
