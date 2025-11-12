package String;

import java.util.Scanner;

public class CountOfWordinSentence2 {
	public static void main(String[] args) {
		
		String str = "good good wala good morning ";
		String[] arr = str.split(" ");

		System.out.println("enter word to check acc ");
		Scanner sc = new Scanner(System.in);
		String sami = sc.next();
		
		
		int count = 0;
		
		for(String s : arr)
		{
			if(s.equals(sami))
			{
				count++;
			}
		}
		System.out.println(count);
}
}
