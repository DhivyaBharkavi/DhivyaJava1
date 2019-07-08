package divyaday1.pratice;

import java.util.Scanner;

public class FindEvenOdd {
int number1, number2;
void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number1 value is ");
	number1=scan.nextInt();
}
void display()
{
	number2 =number1%2;
	if(number2 ==0)
	{
	System.out.println(+number1+ " is even ");	
	}
	else
	{
		System.out.println(+number1+ " is odd ");	
	}
}

}
