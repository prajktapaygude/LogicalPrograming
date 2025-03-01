import java.util.Scanner;

class PerfectNoUsingMethod{
 void perfect_no_finder(int val){
  int sum=0;
  for(int i=1; i<=val/2; i++){
   if(val%i==0){
    sum=sum+i;
   }
  }
  if(sum==val){
   System.out.println("Perfect number");
  }
  else{
   System.out.println("Not a Perfect number");
  }
}

public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int num=sc.nextInt();
  
  PerfectNoUsingMethod ob=new PerfectNoUsingMethod();
  ob.perfect_no_finder(num);
  

}
}