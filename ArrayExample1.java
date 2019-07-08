/*package exercisejulynew;

import java.util.Scanner;

public class ArrayExample1 {
	int n;
	int[] marks = new int[n];
	int[] get()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n number");
		int n=scan.nextInt();
		int[] marks = new int[n];
		for(int i=0;i<n;i++)
		{
			n=scan.nextInt();
		}
		return n;
	}
	void display()
	{
		int i;
		int[] num= get();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		for(i=0;i<n;i++)
		{
			num[i]=scan.nextInt();
		}
		System.out.println(marks[i]);
	}
	void add()
	{
		int add=0;
		for(int i=0;i<n;i++)
		{
			add = add + marks[i];
		}
		System.out.println(add);
	}
}
*/