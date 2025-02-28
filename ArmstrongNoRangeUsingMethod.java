import java.util.Scanner;
class ArmstrongNoRangeUsingMethod{
 void armstrong_no_finder(int minimum, int maximum){
   for(int k=minimum; k<=maximum; k++){
     int temp=k;                                   
     int sum=0;
     while(temp>0){
	int rem=temp%10;
	sum=sum+(rem*rem*rem);
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

  ArmstrongNoRangeUsingMethod obj=new ArmstrongNoRangeUsingMethod();
  obj.armstrong_no_finder(min, max);
}
}


For example, let's consider the number 153:

It has 3 digits.
Each digit raised to the power of 3 (the number of digits) gives:
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
The sum of these cubes equals the original number, which is 153.
Therefore, 153 is an Armstrong number.



The loop for(int k=minimum; k<=maximum; k++) starts with k being equal to minimum and iterates until k is less than or equal to maximum.

Inside the loop:

int temp=k; creates a temporary variable temp and assigns the value of k to it.
int sum=0; initializes a variable sum to 0.
The while loop while(temp>0) continues as long as temp is greater than 0.

Inside the loop:
int rem=temp%10; finds the remainder of temp when divided by 10. This gives the last digit of temp.
sum=sum+(rem*rem*rem); adds the cube of the last digit to sum.
temp=temp/10; updates temp by removing its last digit (by integer division by 10).
After the while loop, we check if(sum==k). This means, if the sum of cubes of the digits equals k, then it's an Armstrong number.

If the condition in step 4 is true, System.out.print(k+" "); prints the number k.

In simpler words, this code finds and prints all Armstrong numbers within a specified range (minimum to maximum). It does so by checking each number in the range, summing the cubes of its digits, and comparing the result with the original number. If they are equal, it means the number is an Armstrong number, and it gets printed.





