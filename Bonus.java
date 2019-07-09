package exerciseSecond;

import java.util.Scanner;

public class Bonus {
	int amount;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount ");
		amount=scan.nextInt();
	}
	void display()
	{
		if(amount>1000)
		 {
			double total=amount/10;
			double result=amount-total;
			System.out.println(" Total of the cost is "+result);
		}
		else
		{
			System.out.println("Total of the cost is "+amount);
		}
	}
}
