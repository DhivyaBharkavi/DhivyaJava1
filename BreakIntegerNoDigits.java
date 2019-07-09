package exercise2july19;

import java.util.Scanner;

public class BreakIntegerNoDigits {
	int n,i;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter n value ");
		n=scan.nextInt();
	}
	void breadToDigits()
	{
		//while(n<0)
		for(i=0;i<n;i++)
		{
		int rem=n%10;
		System.out.println("Digits "+rem);
		n=n/10;
		}
	}
}
