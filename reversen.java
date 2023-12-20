import java.io.*;
import java.util.*;
class reversen
{
public static void main(String args[])
{
int n,rev=0,a;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
while(n!=0)
{
a=n%10;
rev=rev*10+a;
n=n/10;
}
System.out.println("revere="+rev);
}
}


