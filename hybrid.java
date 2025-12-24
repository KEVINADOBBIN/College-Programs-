class student
{ 
int rollno;
void getnumber(int n)
{ 
rollno=n;
}
void putnumber()
{
System.out.println("rollno="+rollno);
}
}
class test extends student
{ 
float part1,part2;
void getmarks(float m1,float m2)
{
part1=m1; 
part2=m2;
}
void putmarks()
{
System.out.println("marks obtained"); 
System.out.println("part1="+part1);
System.out.println("part2="+part2);
}
}
interface sports
{ 
float sportwt=9.0F;
} 
interface sp extends sports
{ 
void putwt();
} 
class result extends test implements sp
{ 
float total; 
public void putwt()
{ 
System.out.println("sports weight is="+sportwt);
}
void display()
{
total=part1+part2+sportwt;
putnumber();
putmarks();
putwt();
System.out.println("total is="+total);
}
}
class hybrid
{ 
public static void main(String args[])
{
result rl=new result();
rl.getnumber(1234);
rl.getmarks (10.0F,20.0F);
rl.display();
}
}