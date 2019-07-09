package exerciseSecond;

import java.util.Scanner;

public class AddnEven {
	int n,i,sum=0;
	int[] num = new int[n];
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter  value ");
		n=scan.nextInt();
	}
	void display()
	{
		System.out.println("The Even numbers");
		for(i=0;i<n;i++)
		{
			num[i]=scan.nextInt();
		}	
		
	}
	void calculate()
	{
		for(i=0;i<n;i++)
		{
			int result = i%2;
			if(result==0)
			{
			sum=sum+num[i];		
			}
		}	
		System.out.println("Sum is "+sum);
	
	}
}
