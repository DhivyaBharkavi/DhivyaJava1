package exercise8july19;

import java.util.Scanner;

public class SumProductMinMax {
	int a,b,c,sum,prod,max,min;
	SumProductMinMax()
	{
		/*a=5;
		b=3;
		c=2;*/
	}
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		a=scan.nextInt();
		System.out.println("Enter b value");
		b=scan.nextInt();
		System.out.println("Enter c value");
		c=scan.nextInt();
	}
	void sumProd()
	{
		sum=a+b+c;
		prod=a*b*c;
	}
	void max()
	{
		if(a>b && a>c)
		{
			max=a;
		}
		else if(b>a && b>c)
		{
			max=b;
		}
		else
		{
			max=c;
		}

	}
	void min()
	{
		if(a<b && a<c)
		{
			min=a;
		}
		else if(b<a && b<c)
		{
			min=b;
		}
		else
		{
			min=c;
		}
	}
	void display()
	{
		System.out.println("Sum is "+sum);
		System.out.println("Product is "+prod);
		System.out.println("Maximum "+max);
		System.out.println("Minimum "+min);
	}
}
