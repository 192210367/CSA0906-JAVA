import java.io.*;
import java.util.*;
class simple
{
public static void main(String args[])
{
double p;
int t;
float si;
Scanner s=new Scanner(System.in);
System.out.println("enter principle amount");
p=s.nextInt();
System.out.println("enter time period:");
t=s.nextInt();
System.out.println("senior citizen(Y/N)");
String a=s.next();
if(a.equals("y"))
{
si=(float)(p*t*12)/100;
}
else
{
si=(float)(p*t*10)/100;
}
System.out.println("si="+si);
}
}
