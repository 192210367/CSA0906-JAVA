import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
int n,i,f=1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("factorial="+f);
}
}
