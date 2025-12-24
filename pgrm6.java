class student
{ 
int roll_no;
String name;
int marks;
student(int x, String y, int z)
{ 
roll_no=x;
name=y;
marks=z;
} 
void display() 
{
System.out.println(roll_no+" "+name+" "+marks);
}
}
class pgrm6
{
public static void main(String args[]) 
{
student s[]=new student [3];
System.out.println("details of 3 students");
System.out.println("roll_no name marks");
s[0]=new student (101, "Dilip", 85);
s[0].display();
s[1]=new student(102,"diwakar", 90);
s[1].display();
s[2]=new student(103, "sudakar", 95);
s[2].display();
}
}