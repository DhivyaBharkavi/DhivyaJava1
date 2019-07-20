package exercise20july19;

import java.util.Scanner;

public class GetStringOutChar {
	char[] c = new char[4]; int n; 
	char[] cc = new char[4];
	String s = new String();
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		System.out.println("Enter a sentences");
		s=scan.next();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter a character");
		c[i]=scan.next().charAt(0);
		cc[i]=c[i];
		}
	
	}
	public void sort()
	{
		
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
		if(cc[i]>cc[j])
		{
			char temp=cc[i];
			cc[i]=cc[j];
			cc[j]=temp;
			//cc[i]=temp;
		}
		}
		System.out.println(cc[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
