package divyaday1.pratice;

import java.util.Scanner;

public class AreaTriangle {

	int length,breadth;
	void display()
	{
	Scanner scan = new Scanner(System.in);	
		
		System.out.println("Enter the length");
		length=scan.nextInt();
		System.out.println("Enter the breadth");
		breadth=scan.nextInt();
		int area=2*length*breadth;
		System.out.println("Area of a triangle "+area);
	}
}
