package exerciseSecond;

import java.util.Scanner;

public class ExerciseSecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		while(b)
		{
		System.out.println("Menu");
		System.out.println("1. Leap or Not");
		System.out.println("2. Rectangle result to find square or not ");
		System.out.println("3. Bonus");
		System.out.println("4. Bonus for year of service");
		System.out.println("5. Student Marks and Grade");
		System.out.println("6. Expression");
		System.out.println("7. Add N Numbers");
		System.out.println("8. Add N Odd Numbers");
		System.out.println("9. Add N EvenNumbers");
		System.out.println("10. Indian Currency");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch=scan.nextInt();
		if(ch==1)
		{
		FindLeapOrNot fl = new FindLeapOrNot();
		fl.getInput();
		fl.findLeapYear();
		//fl.leap();
		fl.leapyear();
		}
		else if(ch==2)
		{
			RectFindSquareOrNot rs = new RectFindSquareOrNot();
			rs.getInput();
			rs.area();
			rs.display();
		}
		else if(ch==3)
		{
		Bonus bo = new Bonus();
		bo.getInput();
		bo.display();
		}
		else if(ch==4)
		{
			BonusService bs = new BonusService();
			bs.getInput();
			bs.output();
			bs.display();
		}
		else if(ch==5)
		{
			StudentMark sm = new StudentMark();
			sm.getInput();
			sm.calcualte();
			sm.grade();
			sm.display();
		}
		else if(ch==6)
		{
			Expression e = new Expression();
			e.getInput();
			e.calculate();
		}
		else if(ch==7)
		{
			AddnNos an = new AddnNos();
			an.getInput();
			an.display();
		}
		else if(ch==8)
		{
			AddnOdd ao = new AddnOdd();
			ao.getInput();
			ao.display();
		}
		else if(ch==9)
		{
			AddnEven ae = new AddnEven();
			ae.getInput();
			ae.display();
		}
		else if(ch==10)
		{
			IndianCurrency ic = new IndianCurrency();
			ic.getInput();
			ic.currency();
		}
		else
		{
			System.out.println("Wrong choice ");
		}
		System.out.println("Do you want continue (y/n)");
		char c = scan.next().charAt(0);
		if(c == 'n')
		{
		 b= false;
		
		}	

		}
	}
}
