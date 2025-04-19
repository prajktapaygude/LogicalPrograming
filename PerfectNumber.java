package NumberSeries;

// perfect Numbers ; 60,496,8128,33550336
public class PerfectNumber {
	public static void main(String[] args) {
		
		int number = 496 ;
		int sum = 0;
		
		// Perfect numbers are positive integers that are equal to the sum of their proper divisors, excluding themselves
		for(int i = 1 ; i<= number/2 ; i++)  // It should iterate up to num / 2 instead of num in order to exclude the number itself from the sum of divisors
		{
			if(number % i == 0)
			{
				System.out.print(i+" ");
				sum = sum + i ;
			}
		}
		System.out.println();
		if(number == sum)
		{
			System.out.println(number+" is perfect Number");
		}
		else
		{
			System.out.println(number+" is not perfect Number ");
		}
	}

}
