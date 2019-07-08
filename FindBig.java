package divyaday1.pratice;

import java.util.Scanner;

public class FindBig {
int number1,number2;
void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number1 value is ");
	number1=scan.nextInt();
	System.out.println("Enter a number2 value is ");
	number2=scan.nextInt();

}
void display()
{
	if (number1 > number2)
	{
		System.out.println(+number1+ "is big ");
	}
	else
	{
		System.out.println(+number2+ "is big ");

	}
}
}
