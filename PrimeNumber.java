import java.util.Scanner;
class PrimeNumber{
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  boolean flag=true;
  
  for(int i=2; i<=num/2; i++){
    if(num%i==0){
	flag=false;
}
}
  if(flag==true){
	System.out.println("Number is prime number");	
}
else{
	System.out.println("Number is non-prime number");
}
}
}


/*A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. In other words, a prime number is a number that is only divisible by 1 and itself without leaving a remainder.

Here are some examples of prime numbers:

2 (since it's only divisible by 1 and 2)
3 (only divisible by 1 and 3)
5 (only divisible by 1 and 5)
7 (only divisible by 1 and 7)
11 (only divisible by 1 and 11)
13 (only divisible by 1 and 13)
Note that 1 is not considered a prime number because it only has one positive divisor (itself).*/