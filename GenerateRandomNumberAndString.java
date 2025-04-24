package pack1;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		
		// Approch : 1 - random class
		
		Random rd = new Random();
//--------------------------------------------------------------		
		// generating integer
		int a = rd.nextInt(100); // 100 is a range from which 
		                         // it generating a number 
		System.out.println(a);

//---------------------------------------------------------
		// generating double
		double b = rd.nextDouble(); // no need to specify range 
		                            // it take range automatic 0.0 and less then 1.0
		System.out.println(b);
//----------------------------------------------------------
		// Approch : 2 Math class
		
		System.out.println(Math.random());
		// it gives by default decimal number 
//-----------------------------------------------------
		
		
	}
}
