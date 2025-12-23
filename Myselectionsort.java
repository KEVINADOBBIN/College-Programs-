public class Myselectionsort
{
public static void main(String args[])
{
String[]arr={"DDD", "FFF","CCC","AAA", "BBB"};
for(int i=0;i<arr.length;i++)
{
int index=i;
for(int j=i+1;j<arr.length;j++)
if(arr[j].compareTo(arr[index])<0)
index=j;
String temp=arr[index];
arr[index]=arr[i];
arr[i]=temp;
}
System.out.println("/n the sorted bit is...."); 
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
}
}
}