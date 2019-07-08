package exercise6july19;

public class Fibonacci {

	     public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonnaci Numbers");
		int f = 0, s = 1;
		System.out.print(f+" ");
		System.out.print(s+" ");
		int times = 5;
		// int t = 0;
		while (times > 0) {
			int t = f + s;
			System.out.print(t+" \t");
			f = s;
			s = t;
			times--;
		}

	}
	// System.out.print(" 0 1 "+t);

}
