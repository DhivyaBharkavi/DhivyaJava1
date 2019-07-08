/**
 * 
 */
package divyaday1.pratice;

/**
 * @author Redington
 *
 */
public class Student {
	String name;
	int mark1,mark2,mark3,mark4,mark5;
	String address;


	
	public Student(String string, int i, int j, int k, int l, int m, String string2) {
		System.out.println("Student information");
		// TODO Auto-generated constructor stub
		name=string;
		mark1=i;
		mark2=j;
		mark3=k;
		mark4=l;
		mark5=m;
		address=string2;
		int total=mark1+mark2+mark3+mark4+mark5;
		System.out.println("total is "+total);
	}
	public Student() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("No student information");
//		int mark1=10;
//		int mark2=80;
//		int tot1=mark1+mark2;
//		System.out.println("Total is "+tot1);
	}
	

	public Student(String string, int i, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	name=string;
	mark1=i;
	mark2=j;
	mark3=k;
	mark4=l;
	mark5=m;
	int total=i+j+k+l+m/5;
	System.out.println("Total is "+total);
	}

	public Student(String name, int mark1, int mark2, int mark3, int mark4) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.mark1=mark1;
	this.mark2=mark1;
	this.mark3=mark1;
	this.mark4=mark1;
	this.mark5=mark1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("dhivya",67,87,98,65,56,"Tirunelveli");//instance specific data 
		Student s2 = new Student("gure",56,67,68,89,90,"Pavoor");
		Student s3 = new Student();
		Student s4 = new Student("gure",56,67,68,89,90);
		Student s5 = new Student("gure",67,68,89,90);
		//Student s5 = new Student();
		
		
	
	s1.display();
	s2.display();
	s3.display();
	s4.display();
	s5.display();
	}
	

	private void display() {
		System.out.println("Name "+name);
		System.out.println("Mark1 "+mark1);
		System.out.println("Mark2 "+mark2);
		System.out.println("Mark3 "+mark3);
		System.out.println("Mark4 "+mark4);
		System.out.println("Mark5 "+mark5);
		System.out.println("Address is "+address);
		
		// TODO Auto-generated method stub
		
	}
	
}