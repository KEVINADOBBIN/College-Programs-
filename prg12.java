class D
{
int a=10;
} 
class L extends D
{
int b=20;
}
class P extends L
{ 
int c=30;
void show()
{ 
System.out.println("A="+a+"\n B="+b+"\nC="+c);
} 
} 
class prg12
{ 
public static void main(String args[])
{ 
P Z=new P();
Z.show();
}
}