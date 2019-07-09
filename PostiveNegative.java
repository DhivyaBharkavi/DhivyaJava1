package exercise2july19;

import java.util.Scanner;

public class PostiveNegative {
	int a,i;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter a value ");
		a=scan.nextInt();
	}
	/*void posti()
	{
		for(i=0;i<a-1;i++)
		{
		if(a==0)
				System.out.println("Positive number is "+a);
		}
	}
	void nega()
	{
		for(i=0;i>a;i--)
		{
			if(a>0)
				System.out.println("Negative number is "+a);
		}
	}*/
	void postneg()
	{
		if(a>0)
		{
			System.out.println(a+" is a positive number");
		}
		else
		{
			System.out.println(a+" is a negative number");
		}
	}
}
