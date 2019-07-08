package exercise6july19;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reverse");
		for(int i=5;i>=1;i--)
		{
			System.out.print(i +"\t");
		}
		System.out.println("");
		System.out.println("Correct");
		for(int i=1;i<=5;i++)
		{
			System.out.print(i +"\t");
		}
		System.out.println("");
		System.out.println("Two Tables");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i * 2 +"\t");
		}
		System.out.println("");
		System.out.println("Divide by 2 or by 3");
		for(int i=0;i<=10;i++)
		{
			if((i%2==0)||(i%3==0))
			System.out.print(i +"\t");
		}
		System.out.println("");
		System.out.println("Divide by 3 or by 5");
		for(int i=0;i<=10;i++)
		{
			if((i%3==0)||(i%5==0))
			System.out.print(i +"\t");
		}
		System.out.println("");
		System.out.println("Prime Number");
		for(int i=5;i<=50;i=i++)
		{
			if((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0))
			System.out.print(i +"\t");
			i++;	
		}
		System.out.println("");
		System.out.println("Factorial");
		int fact=1;
		for(int i=1;i<=12;i++)
		{
			fact=fact * i;  
			System.out.println(fact);
		}
	}

}
