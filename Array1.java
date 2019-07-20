package exercise20july19;

public class Array1 {
	//final int length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,2,3,4};// in version of java 1.5
		//int a[]={1,2,3,4};
		int b[]=new int[a.length];//object can store heap memory// copy array is one by one// b[] also in heap memory
		b=a;//no copy and it refer a a[] object then b[] has unreachable object
		a[0]=20;//a=null; a null reference it disconnect a unreachable code 
		System.out.println(b[0]);
		System.out.println(b[0]+b[1]+b[2]+b[3]);
		System.out.println(b);
	}

}
