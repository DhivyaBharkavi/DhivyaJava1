package exerciseSecond;

import java.util.Scanner;

public class RectFindSquareOrNot {
	int length,breadth;
	double area;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter length value ");
		length=scan.nextInt();
		System.out.println("Enter breadth value ");
		breadth=scan.nextInt();
	}
	void area()
	{
		area=2*length*breadth;
	}
	void display()
	{
		System.out.println("Rectangle is "+area);
	}
}
