package exerciseArray;

import java.util.Scanner;
public class StoreArrayNo {
	int i;
	int[] number = new int[5];
	double[] square = new double[5];
	double[] cube = new double[5];
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		for(i=0;i<5;i++)
		{
		number[i]=scan.nextInt();
		}
	}
		void square()
		{
			for(i=0;i<5;i++)
			{
			square[i]=Math.pow(number[i],2);
			System.out.println("Square  "+square[i]);	
			}
		}
		void cube()
		{
			for(i=0;i<5;i++)
			{
			cube[i]=Math.pow(number[i], 3);	
			//cube[i]= number[i] * number[i] * number[i];;
			System.out.println("Cube "+cube[i]);
			}
		}
		/*void display()
		{
			System.out.println("Square  "+square[i]+ " Cube "+cube[i]);	
		}*/
	}	
