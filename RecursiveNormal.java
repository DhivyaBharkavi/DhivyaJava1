package exercise20july19;

public class RecursiveNormal {
	int a=1;
	 public void get()
	{
		System.out.println(a);
		if(a<3)
		{
			a++;
			get();
			
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveNormal rn = new RecursiveNormal();
		rn.get();
		
	}

}
