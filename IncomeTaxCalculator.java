package exercise8july19;

import java.util.Scanner;

public class IncomeTaxCalculator {
	int taxableincome;
	double taxpayable,taxpayable1,taxpayable2,taxpayable3,taxpayable4;
	void getInput()
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount");
		taxableincome=scan.nextInt();
	}
	void incomeTax()
	{
		if(taxableincome<=20000)
		{
			taxpayable1=taxableincome*0;
		//	System.out.println("Tax payable is "+taxpayable1);
		}
		else if((taxableincome>=20000)&&(taxableincome<=40000))
		{
			taxpayable1=(taxableincome-20000)*0.1;
			//System.out.println("Tax payable is "+taxpayable2);
		}
		else if((taxableincome>=40000)&&(taxableincome<=60000))
		{
			taxpayable1=(taxableincome-40000)*0.2+20000*0.1;
			//System.out.println("Tax payable is "+taxpayable3);
		}
		else if(taxableincome>=80000)
		{
			taxpayable1=(taxableincome-60000)*0.3+20000*0.1+20000*0.2;
			//System.out.println("Tax payable is "+taxpayable4);
		}
		else
		{
			System.out.println("No Tax");
		}
	}
	void income1()
	{
		if(taxableincome<=20000)
		{
			taxpayable=0;
		}
		else if(taxableincome<=40000)
		{
			taxpayable=(taxableincome-20000)*0.1;
		}
		else if(taxableincome<=60000)
		{
			taxpayable=20000*0.1+(taxableincome-40000)*0.2;
		}
		else
		{
			taxpayable=20000*0.1+20000*0.2+(taxableincome-60000)*0.3;
		}
	}
	void display()
	{
		//System.out.println("Tax payable is "+taxpayable);
		System.out.println("Tax payable is "+taxpayable1);
	}
}
