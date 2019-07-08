package exercisejuly;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Calculator c = new Calculator();
		boolean b= true;
		while(b)
		{
			Calculator c = new Calculator();
			System.out.println("Menu");
			System.out.println("1. Addition ");
			System.out.println("2. Subtraction ");
			System.out.println("3. Multiplication ");
			System.out.println("4. Division");
			System.out.println("5. Module");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice ");
			int choice=scan.nextInt();
			c.getInput();
			if(choice ==1)
			{
				c.add();
			}
			else if(choice ==2)
			{
				c.sub();
			}
			else if(choice ==3)
			{
				c.mul();
			}
			else if(choice ==4)
			{
				c.div();
			}
			else if(choice ==5)
			{
				c.mod();
			}
			else 
			{
				System.out.println("Wrong Choice");
			}
			
			System.out.println("Do you want to continue (y/n)");
			char c1 = scan.next().charAt(0);
			if(c1=='n')
			{
				b=false;
				//break;
			}
	}

}
} 