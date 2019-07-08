package exercisejuly;

import java.util.Scanner;

public class Reverse {
	int num,result,reverse,i;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scan.nextInt();
	}
	void reverse()
	{
		System.out.println("The reverse numbers is");
		for (i=10;i>=1;i--)
		{
		System.out.println(i);	
		}
	}
	void reverse1()
	{
		System.out.println("The reverse numbers is");
		for (i=1;i!=0;i++)
		{
		result=num%2;
		reverse=reverse*10+result;
		System.out.println(reverse);	
		}
	}
}
