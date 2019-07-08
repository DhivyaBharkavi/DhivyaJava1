package com.redington.java.oops;

public class Overloading {
	int add(int a,int b)
	{
		int c = a + b;
		System.out.println("Sum of two vatiables "+c);
		return b;
	}
	double add(double a,double b)
	{
		double c = a + b;
		System.out.println("Sum of two vatiables "+c);
		return c;
	}	
	int add(int a,int b,int c)
	{
		int d = a + b + c;
		System.out.println("Sum of two vatiables "+d);
		return d;
	}
	double average()
	{
		double a = add(6,7)/2;
		System.out.println("Sum of two vatiables "+a);
		return a;
	}
	public static void main(String [] args)
	{
		Overloading o = new Overloading();
		o.add(5, 6);
		o.add(4, 5, 6);
		o.average();
	}
}
