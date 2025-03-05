import java.util.Scanner;
class AbcdPattern{
  public static void main(String args[]){
    char ch='A';
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter of rows: ");
    int num=sc.nextInt();
    for(int i=1; i<=num; i++){
	for(int j=1; j<=i; j++){
		System.out.print(ch+" ");
		ch++;	
}
	System.out.println();
	
    }
}
}