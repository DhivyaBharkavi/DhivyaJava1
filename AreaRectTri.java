package divyaday1.pratice;

public class AreaRectTri {
int length,breadth,area;
AreaRectTri()
{
	this.length=length;
	this.breadth=breadth;
}
AreaRectTri(int l,int b)
{
	length=l;
	breadth=b;
}
void rectangle()
{
	area=length*breadth;
	System.out.print("Area of a rectangle is"+area);
}
void triangle()
{
	area=2*length*breadth;
	System.out.print("Area of a Triangle is"+area);
}
}
