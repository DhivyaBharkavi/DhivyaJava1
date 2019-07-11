package exerciseSecond;

import java.util.Scanner;

public class IndianCurrency {
	int amount;
	String country;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter  value ");
		amount=scan.nextInt();
		System.out.println("Enter  Country ");
		country=scan.next();
	}
	void currency()
	{
		if(country.equals("American"))
		{
			System.out.println("American currency to Indian currency "+amount*0.1487);
		}
		else if(country=="Bangladesh")
		{
			System.out.println("Bangladesh currency to Indian currency "+amount*0.8572);
		}
		else if(country=="Cambodia")
		{
			System.out.println("Cambodia currency to Indian currency "+amount*0.01758);
		}
		else if(country=="China")
		{
			System.out.println("China currency to Indian currency "+amount*10.513);
		}
		else if(country=="Georgia")
		{
			System.out.println("Georgia currency to Indian currency "+amount*27.539);
		}
		else if(country=="Hong Kong")
		{
			System.out.println("Hong Kong currency to Indian currency "+amount*9.1813);
		}
		else if(country=="Indonesia")
		{
			System.out.println("Indonesia currency to Indian currency "+amount*0.005);
		}
		else if(country=="Japan")
		{
			System.out.println("Japan currency to Indian currency "+amount*0.6422);
		}
		else if(country=="Malaysia")
		{
			System.out.println("Malaysia currency to Indian currency "+amount*17.412);
		}
		else if(country=="South Korea")
		{
			System.out.println("South Korea currency to Indian currency "+amount*0.0642);
		}
		else if(country=="Sri Lanka")
		{
			System.out.println("Sri Lanks currency to Indian currency "+amount*0.4286);
		}
		else if(country=="Philippiness")
		{
			System.out.println("Philippiness currency to Indian currency "+amount*1.332);
		}
		else if(country=="Thailand")
		{
			System.out.println("Thailand currency to Indian currency "+amount*2.226);
		}
		else if(country=="Taiwan")
		{
			System.out.println("Taiwan currency to Indian currency "+amount*2.341);
		}
		else
		{
			System.out.println("No currency");
		}
	}
}
