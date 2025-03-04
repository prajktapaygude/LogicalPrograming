import java.util.Scanner;
class SpyNumber{
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  int sum=0;
  int prod=1;
   
  while(num>0){
	int rem=num%10;
	sum=sum+rem;
	prod=prod*rem;
	num=num/10;
  }
  if(sum==prod){
	System.out.println("Number is spy number");
  }
  else{
	System.out.println("Number is not spy number");
  }
}
}