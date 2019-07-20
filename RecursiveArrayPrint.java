package exercise20july19;

import java.util.Scanner;

public class RecursiveArrayPrint {
	private int[] a = new int[5];
	//private int i=0;
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		int i=0;
		System.out.println("Enter a value");
		a[i]=scan.nextInt();
		if(a[i]<5)
		{	
			i++;
			getInput();	
			//System.out.println(a[i]+" "+i);
		}
		System.out.println(a[i]+" "+i);
	}
	public void getOutput()
	{
		int i=0;
		if(a[i]<5)
		{
			i++;
			getOutput();
		}
		System.out.println(" a[i]1 "+a[i]+" "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveArrayPrint r = new RecursiveArrayPrint();
		r.getInput();
		r.getOutput();
	}

}
