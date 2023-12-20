import java.io.*;
import java.util.*;
class encoun
{
public static void main(String args[])
{
int l=0,u=0,n=0;
Scanner s=new Scanner(System.in);
System.out.println("enter characters until*");
while(true)
{
char ch=s.next().charAt(0);
if(ch=='*')
{
break;
}
if(ch>='a'&&ch<='z')
{
l++;
}
else
if(ch>='A'&&ch<='Z')
{
u++;
}
else
{
n++;
}
}
System.out.println("lowercase="+l);
System.out.println("uppercase="+u);
System.out.println("numbers="+n);
}
}
