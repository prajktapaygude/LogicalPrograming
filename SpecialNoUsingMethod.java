import java.util.Scanner;
class SpecialNoUsingMethod{
 void special_no_finder(int temp){
  int val=temp;
  int sum=0;
  for(int i=1; i<=val; i++){
   while(val>0){
    int rem=val%10;
    int fact=1;
    for(int j=rem; j>=1; j--){
	fact=fact*j;
    }
   sum=sum+fact;
   val=val/10;
  }
 }
  if(sum==temp){
	System.out.println("Number is special number");
  }
  else{
	System.out.println("Number is not special number");
  }
}
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  
 SpecialNoUsingMethod obj=new SpecialNoUsingMethod();
 obj.special_no_finder(num);

}
}