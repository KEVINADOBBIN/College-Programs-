class outer
{
int m=10;
class inner
{ 
int n=20;
void display()
{ 
System.out.println("m="+m);
System.out.println("n="+n);
}
}
}
class nested
{
public static void main(String args[])
{ 
outer outobj=new outer();
outer.inner inobj=outobj.new inner();
inobj.display();
}
}