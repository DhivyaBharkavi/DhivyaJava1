package divyaday1.pratice;

import java.util.Scanner;

public class FindFor {
int value;
int i,n;
void printNo()
{
	
	for (i=1;i<=2;i++)
	{
		System.out.println("Welcome");
	}
}
void printNo1()
{
	for(i=1;i<=5;i++)
	{
		System.out.println("Hello");
	}
}
void printNo2()
{
	for(i=6;i>=1;i--)
	{
		System.out.println(i);
	}
}

void multiply()
{
	Scanner scan = new Scanner(System.in);
	//System.out.println("Enter i value");
	//i=scan.nextInt();
	
	System.out.println("Enter n value");
	n=scan.nextInt();
	System.out.println("Table is "+n);
	
	//for(i=0;i<=20;i++)
	for(i=1;i<=n;i++)
		
		
	{
		
		//System.out.println(i*n);
		System.out.println(+ i + " * " + n + " = " +(i*n));
	}	
	
}
}
