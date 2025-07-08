package String;

public class AddingTwoStr {
	public static void main(String[] args) {
		
		String str1 = "prajkta";
		String str2 = "paygide";
		
		// approch 1 
		String c = str1.concat(str2);
		System.out.println(c);
		
		// approch 2 
		String  s1 = "111";
		String s2 = "232";
		int sum = Integer.parseInt(s1) +	Integer.parseInt(s2);
		System.out.println(sum); //integer
		System.out.println(String.valueOf(sum));// valueOf methot is used to represent String 
												//represent of integer value
	}

}
