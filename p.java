import java.io.*;
import java.util.*;
class pattern
{
int n=5,i,j;
void display()
{
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.print("\n");
}
}
}
class p
{
public static void main(String args[])
{
pattern a=new pattern();
a.display();
}
}

