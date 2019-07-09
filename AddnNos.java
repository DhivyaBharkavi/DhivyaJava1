package exerciseSecond;

import java.util.Scanner;

public class AddnNos {
	int n,i,sum=0;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter  value ");
		n=scan.nextInt();
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			sum=sum+i;		
		}
		System.out.println("Sum is "+sum);
	}	
}