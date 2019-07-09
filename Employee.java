package exercise2july19;

import java.util.Scanner;

public class Employee {
	int age;
	String area;
	String mari;
	char sex;//1='F',sex2='M';
	Scanner sc = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter sex F or M");
		sex=sc.next().charAt(sex);
		System.out.println("Enter Marital Status");
		mari=sc.next();
	}
	void employee()
	{
		if(age=='F')
		{
		if((age>=10)||(age<=80))
			System.out.println(sex+ " works only in urban areas");
		}
	}
	void employee1()
	{
		if(age=='M')
		{
		if((age>=20)&&(age<=40))
			System.out.println(sex+ " works anywhere");
		else if((age>=40)&&(age<=60))
			System.out.println(sex+ " works in urban areas only");
		else
			System.out.println("ERROR");
		}
	
	}
	void display()
	{
		System.out.println("Age "+age);
		System.out.println("Sex "+sex);
		System.out.println("Marital Status "+mari);
	}
}
