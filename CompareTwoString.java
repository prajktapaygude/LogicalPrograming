package String;

public class CompareTwoString {
	public static void main(String[] args) {
		
	// approch 1 
		String s1 = "praju";
		String s2 = "teju";
		
        boolean str = s1.equals(s2);
		
		if(str == true)
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("not equal");
		}		
		
//----------------------------------------------------------
		//approch 2 
		String str1 = "prajkta";
		String str2 = "prajkta";
		String s = "";
		for(int i = 0; i<str1.length() ; i++)
		{
			s = s + str1.charAt(i);
		}
		
		if(s.equals(str2))
		{
			System.out.println("String 1 and two are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
//==============================================
		// approch 3
		
		String st1 = "kaju";
		String st2 = "kaju";
		
		int p = st1.compareTo(st2);
		
		int result = 0;
		if(result == 0)
		{
			System.out.println("String is equal");
		}
		else
		{
			System.out.println("not eqal");
		}
	}

}
