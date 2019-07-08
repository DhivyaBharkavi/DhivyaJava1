package exercisejuly;
class Cpp
{
	void n()//It inherits to java class
	{
		System.out.println("C++");
	}
	void m()
	{
		System.out.println("I'm learning Core java");
	}
}
class Java extends Cpp
{
	void m()////It override with same method name
	{
		System.out.println("I'm learning Advanced java");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cpp cp = new Cpp();
	Java ja = new Java();
	//cp.m();
	ja.m();
	ja.n();
	}

}
