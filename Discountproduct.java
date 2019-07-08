package divyaday1.pratice;

import java.util.Scanner;

public class Discountproduct {
int productPrice, discountRate,discountAmount,salePrice;
String productName;
char choice;
boolean flag;
/*void display()
{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Product Price ");
	productPrice=scan.nextInt();
	System.out.println("Enter Discount Rate ");
	discountRate=scan.nextInt();	
	discountAmount=productPrice * discountRate;
	salePrice=productPrice+discountAmount;
	System.out.println("Discount Amount is "+discountAmount);
	System.out.println("Sale Price is "+salePrice);

}*/
void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Product Name ");
	productName=scan.next();
	productName=scan.nextLine();
	System.out.println("Would you like to go ");
	choice=scan.next().charAt(0);
	System.out.println("Are you preparing veg or non-veg ");
	flag=scan.nextBoolean();
	System.out.println("Enter the Product Price ");
	productPrice=scan.nextInt();
	  System.out.println("Enter Discount Rate ");
	discountRate=scan.nextInt();	
		
}
void findRate()
{
	discountAmount=productPrice * discountRate/100;
	salePrice=productPrice+discountAmount;
	
}
void display()
{
	System.out.println("Discount Amount is "+discountAmount);
	System.out.println("Sale Price is "+salePrice);
	
}
}
