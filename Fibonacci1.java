package exercise6july19;

import java.util.Scanner;

public class Fibonacci1 {
	int n;

		Scanner sc = new Scanner(System.in);
		void getInput()
		{
			System.out.println("Enter n value");
			n=sc.nextInt();
		}
		void fib()
		{
			System.out.println("Fibonnaci Numbers");
			int f = 0, s = 1;
			System.out.print(f+" ");
			System.out.print(s+" ");
			//int times = 10;
			// int t = 0;
			//while (times > 0) 
			for(int i=0;i<n;i++)
			{
				//int t = f + s;
				s = f+s;
				f = s-f;
				//times--;
				System.out.print(s+" \t");
			}

		}
	public static void main(String[] args) {
		Fibonacci1 f1 = new Fibonacci1();
		f1.getInput();
   f1.fib();   
}
}
