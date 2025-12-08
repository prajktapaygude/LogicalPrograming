package String;

// Approch 1

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "welcome to java";
		 String[] word = str.split(" "); // splict string into words and store it into array
		 String reverseString = "";
		 for(String w :word)
		 {
			 String reverseword ="";
			 for(int i = w.length()-1 ; i>=0 ; i--)
			 {
				 reverseword = reverseword +w.charAt(i);
			 }
			 reverseString =  reverseString + reverseword + " ";
		 }
		 System.out.println(reverseString);
	}
}



//public class ReverseEachWord
//{
//	public static void main(String[] args) {
//		
//		String str = "welcome to java";
//		String[]  words = str.split("\\s");
//		
//		String reverseword= "";
//		
//		for(String w : words)
//		{
//			StringBuilder sb = new StringBuilder(w);
//			sb.reverse();
//			
//			reverseword = reverseword+sb.toString()+" ";
//		}
//		System.out.println(reverseword);
//	}
//}