import java.io.*;
import java.util.*;
class bonus
{
double sa;
char ch;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the salary");
sa=s.nextInt();
System.out.println("enter the grade of employee");
ch=s.next().charAt(0);
double b=0;
if(ch=='A')
{
b=sa*0.05;
}
else
if(ch=='B')
{
b=sa*0.1;
}
else
{
System.out.println("invalid grade");
}
if(sa<10000)
{
b=b+sa*0.02;
}
System.out.println("bonus="+b);
sa=sa+b;
System.out.println("total salary="+sa);
}
}
class emp
{
public static void main(String args[])
{
bonus a=new bonus();
a.display();
}
}
