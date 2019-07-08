package divyaday1.pratice;

import java.util.Scanner;

public class Odd {
	int num,result,i;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scan.nextInt();
	}
	void display()
	{
		System.out.println("The odd numbers are ");
		for (i=1;i<=num;i++)
		{
			System.out.println(2 * i -1);
		}
		
	}
	void display1()
	{
		System.out.println("The odd numbers are ");
		for (i=1;i<=num;i=i+2)
		{
			System.out.println(i);
		}
		
	}
	void display2()
	{
		System.out.println("The odd numbers are ");
		for (i=1;i<=num;i++)
		{
			System.out.println(2 * i + 1);
		}
		
	}
}
