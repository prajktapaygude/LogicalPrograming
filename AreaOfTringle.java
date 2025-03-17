public Class AreaOfTringle
{
public Static void main(String args[])
{
double area,base,height;
Scanner input = new Scanner(System.in)
System.out.println("enter the base and height of the tringle :");

base=input.nextDouble();
height=input.nextDouble();

area = .5*base*height;  //1/2 * base*height;

System.out.println("Area of tringle = +area);
input.close();
}
}