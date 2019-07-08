package exercisejuly;
class Animal1
{
	void Walk()
	{
		System.out.println("Run fast");
	}
	
}
class Dog1 extends Animal1
{
	void sound()
	{
	System.out.println("Barks");
	}
}
class Cat1 extends Animal1
{
	void sound()
	{
	System.out.println("Meow");
	}
}


public class NoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 ca = new Animal1();
		//ca.sound();
		ca.Walk();
			}
	}


