package exercise6july19;

import java.util.Scanner;

public class SwapThreeNo {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter n value");
		a=sc.nextInt();
		System.out.println("Enter n value");
		b=sc.nextInt();
		System.out.println("Enter n value");
		c=sc.nextInt();
	}
	void swap()
	{
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a= a-(b+c);
	}
	void display()
	{
		System.out.println("A "+a);
		System.out.println("B "+b);
		System.out.println("C "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		SwapThreeNo st = new SwapThreeNo();
		st.getInput();
		st.swap();
		st.display();
	}

}
