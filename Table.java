package pack1;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print table : ");
		int num = sc.nextInt();
		
		System.out.println("table of "+num);
		for(int i = 1 ; i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}

}
