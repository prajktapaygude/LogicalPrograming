
package NumberSeries;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int reminder ;
		int result =0;
		int temp = num;
		
		while(temp != 0)
		{
			reminder = temp % 10; // shevat cha number find karnaya sathi
			result = result +(reminder * reminder * reminder); //cube calculate karnaya sathi
		
			temp = temp / 10; 		//shevat cha number udavnaya sathi 	
		}
		if(result == num )
		{
			System.out.println("Number is Armstrong ");
		}
		else
		{
			System.out.println("number is not Armstrong");
		}
	}

}
