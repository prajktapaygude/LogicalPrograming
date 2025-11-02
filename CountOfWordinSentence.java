package String;

public class CountOfWordinSentence {
	public static void main(String[] args) {
		
		String str = "good good wala good morning";
		
		String[] arr = str.split(" ");
		int count = 0;
		
		for(int i = 0 ; i<=arr.length-1 ;i++)
		{
			count++;
		}
		System.out.println("Count of words : " +count);
	}
	
	//-----------------------
//	String str = "good good wala good morning ";
//	
//	String[] arr = str.split(" ");
//	
//	int count = 0;
//	
//	for(String s : arr)
//	{
//		if(s.equals("good"))
//		{
//			count++;
//		}
//	}
//	System.out.println(count);
}

