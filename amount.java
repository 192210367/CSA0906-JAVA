import java.io.*;
import java.util.*;
class amount
{
public static void main(String args[])
{
int ta,wa,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter available amount");
ta=s.nextInt();
System.out.println("enter withdrawl amount");
wa=s.nextInt();
System.out.println("enter 1st denomination and no of notes");
int d1=s.nextInt();
int nd1=s.nextInt();
System.out.println("enter 2nd denomination and no of notes");
int d2=s.nextInt();
int nd2=s.nextInt();
System.out.println("enter 3rd denomination and no of notes");
int d3=s.nextInt();
int nd3=s.nextInt();
System.out.println("enter 4th denomination and no of notes");
int d4=s.nextInt();
int nd4=s.nextInt();
int a=d1*nd1+d2*nd2+d3*nd3+d4*nd4;
if(wa<500)
{
System.out.println("insufficient balance");
}
else
if(wa==a)
{
System.out.println("withdrawl successfull");
int avl=ta-wa;
System.out.println("available amount="+avl);
}
else
{
System.out.println("insufficient notes");
}
}
