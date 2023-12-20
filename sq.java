import java.io.*;
import java.util.*;
class sq
{
public static void main(String args[])
{
int i,j,n;
Scanner a=new Scanner(System.in);
n=a.nextInt();
int c=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(c*c+" ");
c++;
}
System.out.println();
}
}
}
