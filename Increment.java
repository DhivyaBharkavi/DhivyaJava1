package exercise6july19;

public class Increment {
	public static void main(String [] args)
	{
int a=5,b=6,c=7;
/*System.out.println((a++) + (a++) + (a++));
System.out.println(a);
System.out.println((b--) + (b--) + (b--));
System.out.println(b);
System.out.println((a++) + (a) + (++a) + (a));
System.out.println(a);*/
System.out.println((a++) + (++a) + (++b) + (c--));
System.out.println((a++) + (++b) + (++c));
System.out.println((++c) + (++c) + (c--) + (--c));
System.out.println((b++) + (b++) + (++b));
System.out.println(a);
System.out.println(b);
System.out.println(c);
	}
}