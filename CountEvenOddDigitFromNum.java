package pack1;

public class CountEvenOddDigitFromNum {
	
	public static void main(String[] args) {
		
		int num = 123456789;
		int count1 = 0;
		int count2 = 0;
		
		while(num>0)
	    {
	    int rem  = num % 10; // giving last digit form number
	    	
	    if(rem  % 2 == 0 ) 
		{
			count1++;
		}
		else
		{
			count2++ ; 
		}
	    
	    num = num / 10; // removing last digit form number 
		}
		System.out.println("count of even"+count1);
		System.out.println("count of odd num "+count2);
	}

}
