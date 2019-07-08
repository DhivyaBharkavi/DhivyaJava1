class ArithmeticTest1
{
public static void main(String [] divya)
{
Arithmetic1 a1=new Arithmetic1();
Arithmetic1 a2=new Arithmetic1(34,12);//Actual parameters
a1.add();
a2.sub(55,43);
a1.mul();//Calling method without arguments
a2.div(45,5);//Method overloading with arguments and inside is a actual parameter
a1.mod();
}
}