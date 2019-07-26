package exercise26jyly19;

import java.util.Scanner;

public class SumOfDigit {
	private int i;
	private int[] numbers = new int[5];
	private int[] sum = new int[5];
	private int[] reverse = new int[5];
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<5;i++)
		{
		System.out.println("Enter a numbers "+i);
		numbers[i]=scan.nextInt();
		sum[i]=numbers[i];
		reverse[i]=numbers[i];
		}
		
	}
	public void reverse()
	{
		for(i=0;i<5;i++)
		{
			int sum2=0,rev=0;
			//while(reverse[i]>0)
			for(int j=1;j<=numbers[i];j++)
			{
				rev=numbers[i]%10;
				
				rev=rev*10+numbers[i]/10;
				
				sum2=sum2+rev;
			}
			reverse[i]=rev;
			//System.out.println("Sum2 "+sum2+" rev "+rev+" reverse "+reverse[i]);
			//System.out.println("Reverse numbers is "+reverse[i]);
		}
	
	
	
	}
	public void sumOfDigit()
	{	
		for(i=0;i<5;i++)
		{
		int sum1=0;			
			while(sum[i]>0)
			{
				int result=sum[i]%10;
				sum1=sum1+result;
				sum[i]=sum[i]/10;
			}
			System.out.println("Sum of digit is "+sum1);
			sum[i]=sum1;
		}			
	}
	public void display()
	{
		for(i=0;i<5;i++)
		{
			System.out.println("Given array ["+numbers[i]+"] Sum of digit ["+sum[i]+"] Reverse numbers in array ["+reverse[i]+"]");
		}
	}
}
