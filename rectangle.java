import java.io.*;
import java.util.*;
class rectangle
{
public static void main(String args[])
{
int r,c,i,j;
Scanner a=new Scanner(System.in);
System.out.println("enter rows and columns");
r=a.nextInt();
c=a.nextInt();
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
