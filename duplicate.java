import java.io.*;
import java.util.*;
class duplicate
{
public static void main(String args[])
{
int a[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
int n=s.nextInt();
int i,j;
System.out.println("enter numbers");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int temp[]=new int[10];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]==a[j])
{
a[j]=a[n-1];
n--;
j++;
}
}
}
System.out.println("remove duplicates");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
