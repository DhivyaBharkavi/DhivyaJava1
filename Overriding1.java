package exercisejuly;
class Animal
{
	void Walk()
	{
		System.out.println("Run fast");
	}
	void sound()
	{
		System.out.println("Make a sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
	System.out.println("Barks");
	}
}
class Cat extends Animal
{
	void sound()
	{
	System.out.println("Meow");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat ca = new Cat();
ca.sound();
ca.Walk();
	}

}
