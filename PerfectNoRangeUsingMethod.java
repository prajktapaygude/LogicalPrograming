import java.util.Scanner;

class PerfectNoRangeUsingMethod{
 void perfect_no_finder(int minimum, int maximum){
  for(int i=minimum; i<=maximum; i++){
  int sum=0;
  for(int j=1; j<=i/2; j++){
   if(i%j==0){
    sum=sum+j;
   }
  }
  if(sum==i){
   System.out.print(i+" ");
  }
  }
}

public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter minimum limit");
  int min=sc.nextInt();
  System.out.println("Enter maximum limit");
  int max=sc.nextInt();
  
  PerfectNoRangeUsingMethod ob=new PerfectNoRangeUsingMethod();
  ob.perfect_no_finder(min,max);
}
}


/*A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).

In other words, a perfect number is a number that, when all of its positive divisors (except itself) are added together, equals the number itself.

For example:

The first perfect number is 6, because the divisors of 6 are 1, 2, and 3. And 1 + 2 + 3 = 6.
The next perfect number is 28, because the divisors of 28 are 1, 2, 4, 7, and 14. And 1 + 2 + 4 + 7 + 14 = 28.*/