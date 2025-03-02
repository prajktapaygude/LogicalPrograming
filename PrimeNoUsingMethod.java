import java.util.Scanner;
class PrimeNoUsingMethod{
 void prime_finder(int val){
   boolean flag=true;
   for(int i=2; i<=val/2; i++){
   	 if(val%i==0){
		flag=false;
	 }
   }
   if(flag==true){
	System.out.print("Number is prime ");
   }
   else{
	System.out.print("Number is not a prime ");	
   }
}
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  
  PrimeNoUsingMethod ob=new PrimeNoUsingMethod();
  ob.prime_finder(num);
  
}
}


/*boolean flag = true;: This initializes a boolean variable flag to true. This flag will be used to keep track of whether the number is prime or not.

for(int i = 2; i <= num/2; i++) { ... }: This is a loop that iterates from 2 to half of the input number (num). It checks for factors of num.

if(num % i == 0) { flag = false; }: If num is divisible by i, it means num is not a prime number. In this case, flag is set to false.

After the loop, flag is checked to determine if the number is prime or not.

System.out.println("Number is prime number");: If flag is still true after the loop, it means that the number is a prime number and this message is printed.

System.out.println("Number is non-prime number");: If flag is false, it means the number is not a prime number and this message is printed.*/

Overall, this program takes an i