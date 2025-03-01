import java.util.Scanner;
class FactorialNoUsingMethod{
 void factorial_finder(int val){
   int fact=1;
  
   for(int i=val; i>=1; i--){
	fact=fact*i;
   }
   System.out.print("Factorial is "+fact);
}

public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();

  FactorialNoUsingMethod obj=new FactorialNoUsingMethod();
  obj.factorial_finder(num);
}
}


/*  fectorial number 
For example:

5! = 5 × 4 × 3 × 2 × 1 = 120
7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040 




int i=val;: This statement initializes a variable i with the value of val. val is the input parameter to the method, representing the number for which we want to find the factorial.

i>=1;: This is the condition that the loop will check before each iteration. As long as i is greater than or equal to 1, the loop will continue. This ensures that the loop runs for all positive integers down to 1.

i--: This is the statement that gets executed at the end of each iteration. It decrements the value of i by 1. This is important because it moves i closer to 1, which eventually causes the loop to terminate.

fact=fact*i;: This is the statement that actually calculates the factorial. In each iteration of the loop, the value of i is multiplied by the current value of fact. The result is then stored back in fact. This is effectively multiplying fact by i, and accumulating the product in fact.*/