import java.util.Scanner;
class SpyNoRangeUsingMethod{
void spy_finder(int minimum, int maximum){
 for(int k=minimum; k<=maximum; k++){
  int temp=k;
  int sum=0;
  int prod=1;
  for(int i=1; i<=temp; i++){
   
   while(temp>0){
	int rem=temp%10;
	sum=sum+rem;
	prod=prod*rem;
	temp=temp/10;
   }
   }
   if(sum==prod){
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

  SpyNoRangeUsingMethod obj=new SpyNoRangeUsingMethod();
  obj.spy_finder(min, max);
}
}



/*A Spy number is a specific type of number in mathematics. It's a natural number where the sum of its digits is equal to the product of its digits.

In simpler terms:

Let's say we have a number like 1124.
The sum of its digits is: 1 + 1 + 2 + 4 = 8.
The product of its digits is: 1 * 1 * 2 * 4 = 8.*/