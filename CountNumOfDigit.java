package pack1;

public class CountNumOfDigit {
	public static void main(String[] args) {
		
		int num = 123564;
		int count = 0 ;
		
		while(num > 0)
		{
			num = num / 10;
			count++ ;
			/*
			 * num = num / 10; performs an integer division of num by 10. 
			 * This operation effectively removes the last digit of num.
			 *  For example, 123564 / 10 results in 12356.count++;
			 *   increments the count variable by 1 each time the loop iterates.
			 */
		}
		System.out.println(count);
	}

}
