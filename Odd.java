package exercise26jyly19;

import java.util.Scanner;

public class Odd {
	private int i;
	private int[] numbers = new int[5];
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<5;i++)
		{
		System.out.println("Enter a numbers "+i);
		numbers[i]=scan.nextInt();
		}
	}
	public void findOdd()
	{
		int count=0;
		System.out.println("================================");
		System.out.println("Find odd numbers in given array ");
		System.out.println("================================");
		for(i=0;i<5;i++)
		{
			if(numbers[i]%2!=0)
			{
				count++;
				System.out.println("Odd numbers are "+numbers[i]+" then position is "+i);
			}
		}
		System.out.println("Numbers of times of odd numbers is "+count);
	}
}
