package pack1;

public class CountWords {

	public static void main(String[] args) {
		
		String s = "prajkta is good girl";
    	int count=0;
    	 String[] a = s.split(" ");
    	
    	for(int i = 0 ; i<a.length;i++)
    	{
    		count++;
    	}
    	System.out.println(count);
		//==================================================
		
//		String s = "prajkta is a good girl";
//		int count = 1;
//		
//		for(int i = 0; i <s.length()-1 ; i++)
//		{
//			if( (s.charAt(i)==' ') && (s.charAt(i+1) != ' '))
//			{
//				count++;
//			}
//		}
//		System.out.println("number of words in a String is "+count);
	}
}
