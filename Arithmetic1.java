class Arithmetic1
{
int a=44,b=3;//Global variables or instance variables
Arithmetic1()//Default Constructor without arguments
{
 a=10;b=30;
}
Arithmetic1(int i,int j)//Constructor inside arguments with formal parameters
{
}
void add()//Method without Arguments
{
System.out.println("Addition is "+(a+b));
}
void sub(int i,int j)//Method with arguments or parameters
{
System.out.println("Subtraction is "+(i-j));
}   
void mul()
{
System.out.println("Multiplication is "+(a*b));
} 
void div(int i,int j)//Method with formal parameters
{
System.out.println("Division is "+(i/j));
}
void mod()
{
a=9;
b=4;
System.out.println("Modulator is "+(a/b));
}
} 