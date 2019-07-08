package exercisejuly;
abstract class Abs
{
	int m()
	{
		return 1;
	}
	abstract int n();
}
class Xyz extends Abs
{
int n()
{
	return 2;
}
}
interface Van 
{
int a();	//method is terminated 
}
/*class Child implements Van
{
	int a()
	{
		return 0;
	}
}*/

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abs a = new Abs();
		Xyz x = new Xyz();
		x.m();
		x.n(); 	
	

		}

	}


