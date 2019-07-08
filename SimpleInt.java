class SimpleInt
{
int p,no_of_year,rate;//Global variables or instance variables
SimpleInt()
{
p=10;
no_of_year=4;
rate=15000;
}
SimpleInt(int i,int j,int k)
{
}

void simpleInterest()
{
int interest;
interest=(p*no_of_year*rate)/100;
System.out.println("Simple Interest is "+interest);
}

void  simpleInterest1(int i,int j,int k)//Method with formal parameters
{
int interest;
//p=i;
//j=no_of_year;
//k=rate;
interest=(p*no_of_year*rate)/100;
System.out.println("Simple Interest is "+interest);
}
}