import java.io.*;
import java.util.*;
class factor
{
public static void main(String args[])
{
int num,c=0,i,j=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number: ");
num=s.nextInt();
System.out.println("enter nth value: ");
int n=s.nextInt();
System.out.println("factors=");
for(i=1;i<=num;i++)
{
if(num%i==0)
{
c++;
System.out.println(i);
if(c==n)
{
j=i;
}
}
}
System.out.println("no of factors= "+c);
System.out.println("nth factor is= "+j);
}
}