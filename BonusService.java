package exerciseSecond;

import java.util.Scanner;
	public class BonusService {
		int year,salary;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter salary ");
		salary=scan.nextInt();
		System.out.println("Enter service year ");
		year=scan.nextInt();
	}	
	void output()
	{
		if(salary <=15000 )
		{
			double total=salary + salary/5;
			System.out.println(" Total of the cost is "+total);
		}
	}
	void display()
	{
		System.out.println(" Total of the cost is "+year);	
	}
}
