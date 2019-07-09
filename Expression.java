package exerciseSecond;

import java.util.Scanner;

public class Expression {
	int x,y,z; 
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value ");
		x=scan.nextInt();
		System.out.println("Enter y value ");
		y=scan.nextInt();
		System.out.println("Enter z value ");
		z=scan.nextInt();
	}
	void calculate()
	{
		if(x==2)
		{
			System.out.println("X is "+x);
		}
		if(x!=5)
		{
			System.out.println("X is "+x);
		}
		if(x!=5 && y>=5)
		{
			System.out.println("X is "+x+ "Y is "+y);
		}
		if(z!=0 || x==2)
		{
			System.out.println("Z is "+z+ "\nX is "+x);
		}
		if(!(y>10))
		{
			System.out.println("Y is "+y);
		}
	}
}
