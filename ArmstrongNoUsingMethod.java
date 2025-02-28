import java.util.Scanner;

class ArmstrongNoUsingMethod{
 void armstrong_no_finder(int val){
  int temp=val;
     int sum=0;
   
     while(temp>0){
	int rem=temp%10;
	sum=sum+(rem*rem*rem);
	temp=temp/10;
    }
  if(sum==val){
	System.out.println("Number is armstrong number");
  }
  else{
	System.out.println("Number is not armstrong number");
  }
}
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();

  ArmstrongNoUsingMethod obj=new ArmstrongNoUsingMethod();
  obj.armstrong_no_finder(num);
}
}



/*In the armstrong_no_finder method:

int temp = val;: A temporary variable temp is initialized with the input val.
int sum = 0;: sum is used to store the sum of cubes of individual digits.
The while loop iterates until temp becomes zero.
int rem = temp % 10;: The remainder of temp divided by 10 is stored in rem.
sum = sum + (rem * rem * rem);: The cube of rem is added to sum.
temp = temp / 10;: temp is updated by removing the last digit.
Finally, it checks if sum is equal to the input val. If true, it prints that the number is an Armstrong number; otherwise, it prints that it is not.*/