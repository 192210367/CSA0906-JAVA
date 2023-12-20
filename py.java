import java.io.*;
import java.util.*;
class py
{
public static void main(String args[])
{
int i,j,n;
Scanner b=new Scanner(System.in);
n=b.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("1 ");
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("1 ");
}
System.out.println();
}
}
}

