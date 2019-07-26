package exercise26jyly19;

import java.util.Scanner;

public class Name {
	private int i;
	String[] s = new String[5];
	
	String s1; 
	String s2;
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<5;i++)
		{
		System.out.println("Enter a names ");
		s[i]=scan.next();
		}
	}
	public void uppLow()
	{	
		
		for(i=0;i<5;i++)
		{
			
		if(s[i].charAt(0)=='u'&& s[i].charAt(0)!='l')
		{
			s1=s[i].toUpperCase();
		}
		}
	}	
	public void Low()
	{
		for(i=0;i<5;i++)
		{
		 if(s[i].charAt(s[i].length()-1)=='l')
		{
			 s2=s[i].toLowerCase();
		}
		}
	}
	public void display()
	{
		//for(i=0;i<s.length();i++)
		{
			System.out.println("Name starts with 'u' "+s1);
			System.out.println("Name ends with 'l' "+s2);
		}
		
	}
}
