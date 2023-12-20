import java.io.*;
import java.util.*;
class even
{
public static void main(String args[])
{
int n,i,a,b,c,e=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
a=0;
b=1;
for(i=0;i<2*n;i++)
{
c=a+b;
if(c%2==0)
{
e=e+c;
}
a=b;
b=c;
}
System.out.println("evensum="+e);
}
}
