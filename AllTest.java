package divyaday1.pratice;

import java.util.Scanner;

public class AllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Discountproduct dp = new Discountproduct();
dp.getInput();
dp.findRate();
dp.display();
//AreaRectangle at =  new AreaRectangle();

Scanner scan = new Scanner(System.in);
//System.out.println("Enter the length value is");
//at.length=scan.nextInt();
//System.out.println("Enter the breadth value is");
//at.breadth=scan.nextInt();
//at.display();
//AreaTriangle ar = new AreaTriangle();
//ar.display();
AreaRectTri ar = new AreaRectTri();
System.out.println("Enter the length value is ");
ar.length=scan.nextInt();
System.out.println("Enter the breadth value is ");
ar.breadth=scan.nextInt();
ar.rectangle();
ar.triangle();
	}

}
