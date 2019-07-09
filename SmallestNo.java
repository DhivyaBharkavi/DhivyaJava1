package exercise2july19;

import java.util.Scanner;

public class SmallestNo {

	
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		void getInput()
		{
			System.out.println("Enter a value ");
			a=scan.nextInt();
			System.out.println("Enter b value ");
			b=scan.nextInt();
			System.out.println("Enter c rollno ");
			c=scan.nextInt();
		}
		void small()
		{
			if(a<b && a<c)
				System.out.println(a+" is Smallest Number");
			else if(b<a && b<c)
				System.out.println(b+" is Smallest Number");
			else
				System.out.println(c+" is Smallest Number");
		}
	}


