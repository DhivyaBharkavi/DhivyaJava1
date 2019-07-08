package divyaday1.pratice;

import java.util.Scanner;

public class OddEven {
	int num,result;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scan.nextInt();
	}
	void odd()
	{
		System.out.println("The odd numbers are ");
		for(int i=1;i<=num;i++)
		{
		if(i % 2 !=0)
		//num =i%2;
		//if(num !=0)
		System.out.println(i);
		}
	}
	void even()
	{
		System.out.println("The even numbers are ");
		for(int i=1;i<=num;i++)
		{
		if(i % 2 ==0)
		//num =i%2;
		//if(num !=0)
		System.out.println(i);
		}
	}
}
