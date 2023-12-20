import java.io.*;
import java.util.*;
class lcm
{
public static void main(String args[])
{
int n,m,gcd=0,i;
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
n=s.nextInt();
m=s.nextInt();
for(i=1;i<=n&&i<=m;i++)
{
if(n%i==0&&m%i==0)
{
gcd=i;
}
}
int lcm=(n*m)/gcd;
System.out.println("lcm="+lcm);
System.out.println("gcd="+gcd);

}
}
