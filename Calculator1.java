  package divyaday1.pratice;

public class Calculator1 
{
	public static void main(String[] args) {//void is return data type and method name is main and this line is method signature and inside a (String [] args )is arguments
		// TODO Auto-generated method stub
Calculator1 calc =  new Calculator1();
calc.add();
//calc.sub();
//calc.sub();//Method Calling Function
//int result=calc.sub();// calc.sub() double times calling a method
System.out.println("The value of total is "+calc.sub());
int per= calc.per(+calc.sub());//result is a parameter
//System.out.println("The value of percentage is "+per);
calc.mul();
calc.div();
//result=calc.div();
calc.mod();

/*int num1=14, num2=16; //Global Variables
int no=6,no1=7;
int total=num1+num2;*/
/*total=num1-num2;
total=num1*num2;
total=num1/num2;
total=num1%num2;
System.out.println("Normal is "+num1+num2);
System.out.println("Addition is "+(num1+num2));
System.out.println("Addition is "+ total);
System.out.println("Subtraction is "+total);
System.out.println("Subtraction is "+(no+no1));
System.out.println("Multiplication is "+total);
System.out.println("Multiplication is "+(no*no1));
System.out.println("Division is "+total);
System.out.println("Division is "+(no/no1));
System.out.println("Modulator is "+total);
System.out.println("Modulator is "+(no%no1));*/
	}

	private int per(int result) {//per(int result) in inside a int result is argument and this line is a Method signature
		// TODO Auto-generated method stub
		int percentage=result/2;//Method definition or method body
		System.out.println("Average is " +percentage);
		return percentage;
	}

	 
	private void add() {//add() ia a argument list or empty argument and method name
		int num=12,num1=13;//Local Variables
		int total=num+num1;
		System.out.println("Addition is "+total);
		// TODO Auto-generated method stub
		
	}
	private int sub() {
		int num=52,num1=13;
		int total=num-num1;
		System.out.println("Subtraction is "+total);
		return num;
		// TODO Auto-generated method stub
		
	}private void    mul() {// void is return data type
		int num=12,num1=13;
		int total=num*num1;
		System.out.println("Multiplication is "+total);
		// TODO Auto-generated method stub
		
	}private int div() {
		int num=12,num1=13;
		int total=num/num1;
		System.out.println("Division is "+total);
		return total;
		// TODO Auto-generated method stub
		
	}private void mod() {
		int num=12,num1=13;
		int total=num%num1;
		System.out.println("Modulator is "+total);
		// TODO Auto-generated method stub
		
	}
} 