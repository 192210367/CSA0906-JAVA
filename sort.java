import java.io.*;
import java.util.*;
class sort
{
public static void main(String args[])
{
String name[]=new String[10];
int i,j;
Scanner b=new Scanner(System.in);
for(i=1;i<=5;i++)
{
name[i]=b.nextLine();
}
int n=name.length;
for(i=1;i<=n;i++)
{
for(j=i+1;j<=n;j++)
{
if(name[i].compareTo(name[j])>0)
{
String temp=name[i];
name[i]=name[j];
name[j]=temp;
}
}
}
for(i=1;i<=n;i++)
{
System.out.println(name[i]);
}
}
}
