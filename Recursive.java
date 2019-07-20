package exercise20july19;

public class Recursive {
	public void get()
	{
		get();//Method call himself//method calling that load in stack time take a heap memory but run in stack memory
		set();//
	}
	public void set()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive r = new Recursive();//
		r.get();
	}

}
