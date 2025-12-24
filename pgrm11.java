class A
{ 
int a;
void geta(int al)
{ 
a = al;
} 
void display()
{
System.out.println("a="+a);
}
} 
class B extends A
{ 
int b;
void getb(int b1)
{ 
b=b1;
} 
void display()
{
System.out.println("\nb="+b);
} 
} 
class pgrm11
{ 
public static void main(String n[])
{
B X=new B();
X.geta(10);
X.getb(20);
X.display();
}
}