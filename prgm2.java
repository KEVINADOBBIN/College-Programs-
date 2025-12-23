class D
{
int a;
void read(int d)
{
a=d;
} 
void print()
{ 
System.out.println("a="+a);
}
}
class prgm2
{ 
public static void main(String args[])
{
D z1=new D();
z1.read(5);
z1.print();
}
}