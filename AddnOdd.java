package exerciseSecond;

import java.util.Scanner;

public class AddnOdd {
	int n,i,sum=0;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter  value ");
		n=scan.nextInt();
	}
	void display()
	{
		System.out.println("The odd numbers");
		for(i=0;i<n;i++)
		{
			int result = i%2;
			if(result==1)
			{
			sum=sum+i;		
			}
		}	
		System.out.println("Sum is "+sum);
	}
}