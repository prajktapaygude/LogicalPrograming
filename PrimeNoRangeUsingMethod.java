import java.util.Scanner;
class PrimeNoRangeUsingMethod{
 void prime_finder(int start, int end){
   for(int k=start; k<=end; k++){
	boolean flag=true;
	 for(int i=2; i<=k/2; i++){
   	   if(k%i==0){
		flag=false;
	   }
	}
   
   if(flag==true){
	System.out.print(k+" ");	
}}
}
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter starting number");
  int start=sc.nextInt();
  System.out.println("Enter ending number");
  int end=sc.nextInt();
 
  PrimeNoRangeUsingMethod ob=new PrimeNoRangeUsingMethod();
  ob.prime_finder(start, end);
  
}
}