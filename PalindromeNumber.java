// Print Palindrome Number and get input from user using while loop

import java.util.Scanner;
class PalindromeNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");

    int num = sc.nextInt();
    int temp = num;
    int sum = 0;

    while(temp>0){
	int rem = temp % 10;
	sum = (sum * 10) + rem;
	temp = temp/10;
    }
    if(num==sum){
	System.out.println("Number is Palindrome");
    }
    else{
    	System.out.println("Number is not Palindrome");
    }
}
}


/*A palindrome number is a positive integer that remains the same when its digits are reversed. In other words, a palindrome number reads the same from left to right as it does from right to left.

For example, some palindrome numbers are:

121 (Reading it in reverse also gives 121)
1331 (Reading it in reverse also gives 1331)
454 (Reading it in reverse also gives 454)
1221 (Reading it in reverse also gives 1221)*/