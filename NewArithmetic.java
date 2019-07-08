class NewArithmetic
{
int number1,number2;
float result;
NewArithmetic()
{
number1=24;
number2=13;
}
void total()
{
//Scanner in = new Scanner(System.in);
     
  //   x = in.nextInt();
    //  y = in.nextInt();
result=number1+number2;
System.out.println("Addition is "+result);
result=number1-number2;
System.out.println("Subtraction is "+result);
result=number1*number2;
System.out.println(" Multiplication is "+result);
float result1=number1/number2f;
System.out.println("Division is "+result1);
}
}