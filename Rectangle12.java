class Rectangle
{
int height;
int width;
Rectangle()
{
System.out.println("simple construction value are initialized...");
height=10;
width=20;
}
Rectangle(int h,int w)
{
System.out.println("parameterized construction value are initialized...");
height=h;
width=w;
} 
void area()
{
System.out.println("Now the function /method is not required");
int result=height*width;
System.out.println("area="+result);
}}
class Rectangle12
{
public static void main(String args[])
{
Rectangle obj1=new Rectangle (11,20);
obj1.area();
}}