package exercise2july19;

import java.util.Scanner;

public class AllResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		while(b)
			{
		System.out.println("Menu");
		System.out.println("1. Check positive or negative given number");
		System.out.println("2. Find Biggest among 3 numbers ");
		System.out.println("3. Find Smallest among 3 numbers ");
		System.out.println("4. Employee Details ");
		System.out.println("5. Break the integer number into digits ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int cc = sc.nextInt();
		if(cc == 1)
		{ 
			PostiveNegative pn = new PostiveNegative();
			pn.getInput();
			//pn.posti();
			//pn.nega();
			pn.postneg();
		}
		if(cc == 2)
		{ 
			BiggestNo bn = new BiggestNo();
			bn.getInput();
			bn.big();
		}
		else if(cc == 3)
		{
			SmallestNo sn = new SmallestNo();
			sn.getInput();
			sn.small();
		}
		else if(cc==4)
		{
			Employee e = new Employee();
			e.getInput();
			e.employee();
			e.employee1();
			e.display();
		}
		else if(cc==5)
		{
			BreakIntegerNoDigits bi = new BreakIntegerNoDigits();
			bi.getInput();
			bi.breadToDigits();
		}
		else
		{
			System.out.println("Wrong choice ");
		}
		System.out.println("Do you want continue (y/n)");
		char cco = sc.next().charAt(0);
		if(cco == 'n')
		{
		 b= false;
		
		}	

			}
	}

	}
