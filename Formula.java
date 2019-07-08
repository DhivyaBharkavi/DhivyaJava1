package divyaday1.pratice;
import java.lang.Math;
import java.util.Scanner;
public class Formula {
int distance1, x,x1,x2,y,y1,y2;
double distance,slope,a,b,c;
void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter x1 value ");
	x1=scan.nextInt();
	System.out.println("Enter y1 value ");
	y1=scan.nextInt();
	System.out.println("Enter x2 value ");
	x2=scan.nextInt();
	System.out.println("Enter y2 value ");
	y2=scan.nextInt();
}
void display()
{
	a = (x2- x1);
	b = (y2-y2);
	c=Math.pow(a,b);
	distance = Math.sqrt(c);
	System.out.println("Distance between two points is "+distance);
}
void display1()
{
	long a = 943435435;
	long b = 454545455;
	a=a*b;
	b=a/b;
	a=a/b;
}



void display2()
{
	slope = (y2 - y1) / (x2 - x1);
	System.out.println("Slope of a line is "+slope);
}
}
 