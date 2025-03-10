package pack1;

public class sumOfDivisor {
	
	public static void main(String[] args) {
		
		int number = 10;
		System.out.println("enter a number : " +number);
		int sum = 0;
		
		System.out.println("devisors are : ");
		for(int i = 1 ; i<= number ; i++)
		{
			if(number % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("sum of divisor is : "+sum);
	}

}
