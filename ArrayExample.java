package exercisejulynew;

import java.util.Scanner;

public class ArrayExample {
	int n;
//	int[] marks = new int[n];
	int[] arrayIntialization()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n number");
	n=scan.nextInt();
	int[] marks = new int[n];
	return marks;
	}
	void input()
	{
	int[] assign = arrayIntialization();
	/*arrayIntialization ai = new arrayIntialization();
	ai.n();*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter marks");
	for(int i=0;i<n;i++)
	{
		assign[i]=scan.nextInt();
	}
	}
	void display()
	{
		int[] demo = arrayIntialization();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			demo[i] = scan.nextInt();
			System.out.println(i+ " place " +demo[i]);
		}
	}
}
