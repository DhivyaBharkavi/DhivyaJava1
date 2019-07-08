class Area
{
int radius=3;//Global variables or instance variables
	
void display()//Method without Arguments
{
double area=3.14*radius*radius;
System.out.println("Area of a circle is "+area);
}
void display1(int r1)//Method with arguments or parameters
{

double area1=3.14*r1*r1;
System.out.println("Area of a circle is "+area1);
}
}