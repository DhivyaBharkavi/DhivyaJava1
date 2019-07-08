package com.redington.java.oops;
class X
{
	int a =6;// Instance variable or state or attribute or fields
	void display()//Method or behavior
	{
		System.out.println(a);
	}
}
class Y extends X
{
	int b =5;
	void print()
	{
		X a = new X();
		a.display();
		System.out.println(b);
	}
}
class Z extends Y
{
	int c=4;
	void display1()
	{
		Y b = new Y();
		b.print();
		b.display();
		System.out.println(c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z c = new Z();
		c.display();
		c.print();
		c.display1();	}

}
