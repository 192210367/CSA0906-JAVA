import java.io.*;
import java.util.*;
class inverted
{
public static void main(String args[])
{
int n,i,j;
Scanner a=new Scanner(System.in);
System.out.println("enter no of rows");
n=a.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==1||i==n||j==1||j==n)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
