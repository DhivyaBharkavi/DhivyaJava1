package exercise6july19;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Square
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*i +"\t\n");
			//System.out.println("\n");
		}
		//Cube
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*i*i +"\t\n");
			//System.out.println("\n");
		}
		for(int i=3;i<=10;i=i*3)
		{
			System.out.print(i +"\t\n");
			i++;
			//System.out.println("\n");
		}
		for(int i=3;i<=10;i=i*3)
		{
			System.out.print(i +"\t");
		}
		System.out.println("");
		System.out.println("Odd");
		for(int i=1;i<=10;i=i+2)
		{
			if(i%2==1)
			System.out.print(i +"\t");
		}
		System.out.println("");
		System.out.println("Even");
		for(int i=0;i<=10;i=i+2)
		{
			if(i%2==0)
			System.out.print(i +"\t");
		}

	}

}
