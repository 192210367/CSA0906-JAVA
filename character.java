import java.io.*;
import java.util.*;
class character
{
public static void main(String args[])
{
String s;
Scanner b=new Scanner(System.in);
System.out.println("enter the string");
s=b.nextLine();
int n=s.length();
int i;
System.out.println("lowercase=");
for(i=0;i<n;i++)
{
if(s.charAt(i)>='a'&&s.charAt(i)<='z')
{
System.out.print(s.charAt(i)+" ");
}
}
System.out.println("uppercase=");
for(i=0;i<n;i++)
{
if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
{
System.out.print(s.charAt(i)+" ");
}
}
System.out.println("7],numbers=");
for(i=0;i<n;i++)
{
if(s.charAt(i)>='0'&&s.charAt(i)<='9')
{
System.out.print(s.charAt(i)+" ");
}
}
}
}
