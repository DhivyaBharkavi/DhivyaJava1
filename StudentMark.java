package exerciseSecond;

import java.util.Scanner;

public class StudentMark {
	int mark1,mark2,mark3;
	int sum=0,average;
	String grade;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter tamil mark ");
		mark1=scan.nextInt();
		System.out.println("Enter english mark ");
		mark2=scan.nextInt();
		System.out.println("Enter computer mark ");
		mark3=scan.nextInt();
	}
	void calcualte()
	{
		sum=mark1+mark2+mark3;
		average=sum/3;
	}
	void grade()
	{
		if(average < 25)
		{
			grade="F";
		}
		else if(average < 25 && average > 45)
		{
			grade="E";
		}
		else if(average < 45 && average > 50)
		{
			grade="D";
		}
		else if(average < 50 && average > 60)
		{
			grade="C";
		}
		else if(average < 60 && average > 80)
		{
			grade="B";
		}
		else if(average  <= 80)
		{
			grade="A";
		}
		else
		{
			grade="O";
		}
	}
	void display()
	{
		System.out.println("Total " +sum+ " Average " +average+ " Grade " +grade);
	}
}
