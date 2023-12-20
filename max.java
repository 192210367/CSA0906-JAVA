import java.io.*;
import java.util.*;
class max
{
public static void main(String args[])
{
int i,j,no,M,N;
Scanner s=new Scanner(System.in);
int a[]=new int[10];
System.out.println("enter size of array");
int n=s.nextInt();
System.out.println("enter m value");
M=s.nextInt();
System.out.println("enter nth value");
N=s.nextInt();
System.out.println("enter numbers");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Sorted array");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
int min=a[N-1];
int max=a[n-M];
int sum=max+min;
int diff=max-min;
System.out.println(M+"th max="+max);
System.out.println(N+"th min="+min);
System.out.println("diff="+diff);
System.out.println("sum="+sum);
}
}
