class A extends Thread
{ 
public void run()
{ 
System.out.println("This is from thread class"); }
} 
class B implements Runnable
{ 
public void run()
{ 
System.out.println("This is from runnable interface");
}
}
class kenn
{ 
public static void main(String n[])
{
A obj1=new A();
obj1.start();
B obj2=new B();
Thread tb=new Thread(obj2);
tb.start();
}
}
