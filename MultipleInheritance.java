package exercisejuly;
interface C
{
	public int add();
}
interface D
{
	public int add();
	public int sub();
}
class E implements C,D
{
	public int add()
	{
		return 1+3;
		
	}
	public int sub()
	{
		return 3-1;
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E z = new E();
		System.out.println(z.add());
		System.out.println(z.sub());

	}

}
