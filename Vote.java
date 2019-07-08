package exercisejuly;

import java.util.Scanner;

public class Vote {
int age;
void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number ");
	age=scan.nextInt();
	/*System.out.println("Enter a number ");
	num2=scan.nextInt();*/
}
void output()
{
if (age >= 18)
{
	System.out.println("Eligible to vote");
}
else 
{
	System.out.println("Not eligible to vote");
}
}
}
