package pack1;


public class SwapTwoNum {
	
	public static void main(String[] args) {
		
// using third vairable 
		/*int a = 20;
		int b = 30;
		int c = 0 ;
		
		c= a;
		a = b ;
		b=c; */
//----------------------------------------------
		
// without using third variable 
		/*
		int a = 30;
		int b = 20;
		
		a = a+ b ; // 30 + 020 = 50
		b = a- b; // 50-20 = 30
		a = a-b; // 50- 30 = 20
		
		
         
         */

// logic 3 without third variable 
		
		// here a & b value should not be 0 
		
		/*
		int a = 6 , b= 3;
		
		a = a* b; // 6 * 3 = 18
		b = a/b;  // 18 / 3 = 6
		a = a /b ; // 18 / 6 = 3
		*/
		
// using XOR OPerator
		/*
		int a = 20 , b= 10 ;
		System.out.println("befor Swapping " +a);
		System.out.println("befor Swapping "  +b);
		
		a = a^b;
		b = a^b;
		a = a^b ; 
		*/
		
// logic 5 
		
		int a = 20 , b = 10 ;
		
		b = a+b - (a=b);
		// execution start form the right side
        // a = b means b vlaue assign to a means  a =10
		// a + b manje 20 + 20 = 40 
		// 40 - 20 = 20
		
		System.out.println("after swapping "+ a);
		System.out.println("after swapping" +b);
		
	}

}
