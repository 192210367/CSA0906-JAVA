import java.io.*;
import java.util.*;
class pascal
{
public static void main(String args[])
{
int i,j,k,n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}
int c=1;
for(k=1;k<=i;k++)
{
System.out.print(c+" ");
c=c*(i-k)/k;
}
System.out.println();
}
}
}
