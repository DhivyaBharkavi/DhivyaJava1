package exerciseArray;

import java.util.Scanner;

public class Swap2No {
	int n,i;
	int[] number = new int[5];
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		for(i=0;i<5;i++)
		{
		number[i]=scan.nextInt();
		}
	}
	void display2and4()
	{
		System.out.println("2nd position value " +number[2]);
		System.out.println("4th position value "+number[4]);
	}
	void swap()
	{
		int x;
		x=number[2];
		number[2]=number[4];
		number[4]=x;
	}
	void displaySwap()
	{
		System.out.println("Swapping 2nd to 4th position value "+number[2]);
		System.out.println("Swapping 4nd to 2th position value "+number[4]);
	}
}
