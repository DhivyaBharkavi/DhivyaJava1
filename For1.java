package exercise6july19;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1=1,m2=10;
		for(;m2>=1;m2--)
		{
			System.out.println(m2/m1);
			m1++;
		}
		for(int m=1;m<=10;m++)
		{
			if(m%2==0)
				System.out.println(m);
			
		}
		for(int n=1;n<=20;n++)
		{
			if((n%2==0)||(n%3==0))
				System.out.println(n);
			
		}
		
	}

}
