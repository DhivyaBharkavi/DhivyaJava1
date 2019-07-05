package exerciseArray;

import java.util.Scanner;

public class SumAver {
	int n,i,average;
	int sum = 0;
	//int[] number = new int[10];
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		n=scan.nextInt();
		int[] number = new int[n];
		System.out.println("Enter numbers of elements ");
		for(i=0;i<n;i++)
		{
		number[i]=scan.nextInt();
		sum = sum + number[i];
		average = sum/n;
		}
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);
		}
		/*void total()
		{
			for(i=0;i<n;i++)
			{
			
			}
		}
		*/
}
