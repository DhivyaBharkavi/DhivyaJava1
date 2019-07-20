package exercise20july19;

public class NormalClass {
int rollno;
String name;

public static void main(String [] args)
{
	NormalClass nm1 = new NormalClass();
	//System.out.println(nm1.rollno=10);
	NormalClass nm2 = new NormalClass();
	//System.out.println(nm2.rollno=20);
	NormalClass nm[]={nm1,nm2};
	for(int i=0;i<nm.length;i++)
	{
		System.out.println(nm[i].rollno=10);
	
	}
	
}
}