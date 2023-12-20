import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
int i,j;
Scanner a=new Scanner(System.in);
int x[]=new int[10];
System.out.println("enter size of array");
int n=a.nextInt();
System.out.println("enter numbers");
for(i=0;i<n;i++)
{
x[i]=a.nextInt();
}
int count=0;
int c=0;
int p=0;
System.out.println("prime numbers=");
for(i=0;i<n;i++)
{
count=0;
for(j=1;j<=x[i];j++)
{
if(x[i]%j==0)
{
count++;
}
}
if(count==2)
{
p++;
System.out.println(x[i]+" ");
}
}
System.out.println("no of prime numbers="+p);
System.out.println("composite numbers");
for(i=0;i<n;i++)
{
count=0;
for(j=1;j<=x[i];j++)
{
if(x[i]%j==0)
{
count++;
}
}
if(count>2)
{
c++;
System.out.println(x[i]+" ");
}
}
System.out.println("no of composite="+c);
}
}
