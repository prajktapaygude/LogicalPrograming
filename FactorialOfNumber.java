package pack1;

// it multiplies a number by ever number below it 
// 5 = 5*4*3*2*1=120

public class FactorialOfNumber {
	public static void main(String[] args) {
		int sum = 1 ; 
		for(int i = 1 ; i<= 5 ; i++)
		{
			sum = sum * i ;
		}
		System.out.println(sum);
	}

}
