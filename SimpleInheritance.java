//SIMPLE INHERITANCE
package com.redington.java.oops;
class A
{
	int a = 8;// Instance variable or state or attribute or fields
	void display()//Method or behavior
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b =9;
	void print()
	{
		A a = new A();
		a.display();
		System.out.println(b);
	}
}
public class SimpleInheritance extends A
{	
public static void main(String [] args)
{
	A a = new A();
	a.display();
	B bo = new B();
	bo.display();
	bo.print();
}
}
