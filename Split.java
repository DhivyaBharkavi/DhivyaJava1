package exerciseArray;

import java.util.Scanner;

public class Split {
	int n,i,j;
	int[] number = new int[10];
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		for(i=0;i<10;i++)
		{
		number[i]=scan.nextInt();
		}
	}
	void split1()
	{
		for(i=0;i<10;i++)
		{
			int[] split1 = null;
			split1[i]=number[i];
			System.out.println("Split1 "+split1[i]);
		}
	}
	void split2()
	{

		int s=number.length/2;
		for(j=0;j<10;j++)
		{
			int[] split2=null;
			split2[j]=number[j+s];
			System.out.println("Split1 "+split2[j]);
		}
	}
	/*void display()
	{
		System.out.println("Split1 "+split1[i]);
		System.out.println("Split1 "+split2[j]);
	}
	*/
}
