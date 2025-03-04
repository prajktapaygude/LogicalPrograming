import java.util.Scanner;

class SpecialNoRangeUsingMethod{
 void special_no_finder(int minimum, int maximum){
   for(int k=minimum; k<=maximum; k++){
	int temp=k;
  	int sum=0;
 	
  	 while(temp>0){
   	  int rem=temp%10;
    	  int fact=1;
    	    for(int i=rem; i>=1; i--){
	     fact=fact*i;
    	    }
        sum=sum+fact;
        temp=temp/10;
  }
  if(sum==k){
    System.out.print(k+" ");
  }
}
}
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter minimum number");
  int min=sc.nextInt();
  System.out.println("Enter maximum number");
  int max=sc.nextInt();
 
  SpecialNoRangeUsingMethod ob=new SpecialNoRangeUsingMethod();
  ob.special_no_finder(min, max);
 } 
}


/* A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, the sum of all positive divisors of a perfect number (excluding itself) equals the number itself.

For example, the first perfect number is 6. The divisors of 6 are 1, 2, and 3. The sum of these divisors is 1 + 2 + 3 = 6, which is equal to the original number.

Here's a breakdown of the divisors for some perfect numbers:

6: Divisors (excluding 6) are 1, 2, 3. Sum of divisors = 1 + 2 + 3 = 6.
28: Divisors (excluding 28) are 1, 2, 4, 7, 14. Sum of divisors = 1 + 2 + 4 + 7 + 14 = 28.
496: Divisors (excluding 496) are 1, 2, 4, 8, 16, 31, 62, 124, 248. Sum of divisors = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496.*/