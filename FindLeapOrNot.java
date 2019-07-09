package exerciseSecond;

import java.util.Scanner;

public class FindLeapOrNot {
	int year;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year ");
		year=scan.nextInt();
	}
void findLeapYear()
{
	if(year%4 == 0)
	{
		System.out.println(year+ " is a leap year");
	}
	else
	{
		System.out.println(year+ " is not a leap year");
	}
}
void leap()
{
	if(year % 100==1)
	{
		System.out.println(year+ " this is not a leap year");
	}
	else if(year %4==0) 
	{
		System.out.println(year+ " this is a leap year");
	}
	else
	{
		System.out.println(year+ " Wrong leap year");
	}
	}
void leapyear()
{
	boolean leap = false;
	if(year % 4==0)
	{
	if(year % 100 ==0)
	{
	if(year % 400==0)
	{
		leap = true;
	}
	else
	{
		leap = false;
	}
	}
	else
	{
		leap = true;
	}
	}
	else
	{
		leap = false;
	}
	if(leap)
	{
		System.out.println(year+ "  is a leap year");	
	}
	else
	{
		System.out.println(year+ "  is not a leap year");	
	}
}
}
