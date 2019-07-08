package divyaday1.pratice;

public class Calculator {
	static
	{
		System.out.println("Inside static block");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		//cal.Close();
		System.out.println("Inside main block");

	}

	static
	{
		System.out.println("Inside static2 block");
	}
	
{
	System.out.println("Inside static block");
}
{
	System.out.println("Inside instance block");
}
static
{
	System.out.println("Inside static1 block");
}

}
