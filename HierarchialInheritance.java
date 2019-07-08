package com.redington.java.oops;

//import java.util.Scanner;

class RBI
{
	/*void getInput()
	{
		double balance,amount;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount ");
		amount=scan.nextDouble();
		System.out.println("Enter the balance ");
		balance=scan.nextDouble();
	}*/
	double debit(double balance, double amount)//method with parameters or arguments
	{
		balance=balance * amount;
		return balance;
	}
	double credit(double balance, double amount)
	{
		balance=balance * amount;
		return balance;
	}
	double rateofInterest(double balance)
	{
		balance=(balance * 7.1)/100;
		return balance;
		//System.out.println("Balance " +balance);
	}
	
	
}

class TMB extends RBI
{
	double rateofInterest(double balance)
	{
		balance=(balance * 7.1)/100;
		return balance;
	}
	double rateofIntereNew(double balance)
	{
		balance=(balance * 7.5)/100;
		return balance;
	}
}
class SBI extends RBI
{
	double rateofInterest(double balance)
	{
		balance=(balance * 7.3)/100;
		return balance;
	}
}
class IOB extends RBI
{
	double rateofInterest(double balance)
	{
		balance=(balance * 7.9)/100;
		return balance;
	}	
	boolean checkMinimumBalance(double balance)
	{
		if(balance >= 500)
		{
			return true;
		}
		else
		{
		return false;
		}
}
}
public class HierarchialInheritance {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
	IOB i = new IOB();
	//i.getInput();
	i.rateofInterest(10000);

	}

}

