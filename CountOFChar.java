package String;

public class CountOFChar {
	public static void main(String[] args) {
		
		String s = "prajkta paygude";
		int count = 0;
		
		for(int i = 0 ; i<=s.length()-1; i++)
		{
			count++;
		}
		System.out.println("count of char is : " +count);
	}

}