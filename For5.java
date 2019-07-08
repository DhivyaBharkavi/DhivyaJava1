package exercise6july19;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		//int n;
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//System.out.println("");
		int n;
		boolean ifentry = false;
		System.out.println("Prime Number or not");
		System.out.println("Enter n value");
		n=sc.nextInt();
		//int n=16,i=2;
		int i = 2;
		while(i<Math.sqrt(n))
		//while(i<n/2)
		//while(i<n)
		{
			if(n%i == 0)
			{
				
				System.out.println(n+ " is not a prime");
				ifentry=true;
				break;//that breaks no of time is execution
			}
			i++;
		}
	if(ifentry==false)
	{
		System.out.println(n+" is a prime Number");
	}
	}

}
