  package exercisejuly;

import java.util.Scanner;

public class Factorial {
int fact =1,i,num;
void getInput()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number is ");
	num=sc.nextInt();
}
void factorial()
{
	for(i=1;i<=num;i++)
	{
		fact = fact * i;
	}
	System.out.println("Factorial of " +num+ " is "+fact);
}
}
