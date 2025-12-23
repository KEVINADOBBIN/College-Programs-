class Room
{ 
int length;
int breadth;
Room(int x, int y)
{
length=x;
breadth=y;
} 
int area()
{ 
return(length*breadth);
}
}
class Room1 extends Room
{
int height;
Room1(int x, int y, int z)
{
super(x,y);
height=z;
} 
int volume()
{ 
return(length*breadth*height);
}
}
class prgm5
{ 
public static void main(String args[])
{ 
Room1 place=new Room1(14,15,20);
int areal=place.area();
int volumel=place.volume(); 
System.out.println("areal="+areal);
System.out.println("volumel="+volumel); 
}
}