import java.io.*;
import java.util.*;
class pa
{
public static void main(String args[])
{
int n,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of rows");
n=s.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
