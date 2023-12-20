import java.io.*;
import java.util.*;
class matrix
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int s[][]=new int[3][3];
int i,j;
Scanner d=new Scanner(System.in);
System.out.println("enter a 1st matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=d.nextInt();
}
}
System.out.println("enter a 2nd matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=d.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
s[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("addition=");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(s[i][j]+"  ");
}
System.out.println();
}
}
}
