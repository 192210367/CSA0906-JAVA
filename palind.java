import java.io.*;
import java.util.*;
class palind
{
public static void main(String args[])
{
int x;
Scanner s=new Scanner(System.in);
System.out.println("enter your choice 1-String,2-number");
x=s.nextInt();
switch(x)
{
case 1:
System.out.println("enter the string");
Scanner d=new Scanner(System.in);
String str=d.nextLine();
int n=str.length();
String rev="";
int i;
String temp=str;
for(i=n-1;i>n;i--)
{
rev=rev+str.charAt(i);
}
if(rev.equals(temp))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
break;
case 2:
System.out.println("enter a number");
Scanner c=new Scanner(System.in);
int num=c.nextInt();
int temp1=num;
int sum=0;
int a;
while(num!=0)
{
a=num%10;
sum=sum*10+a;
num=num/10;
}
if(temp1==sum)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
break;
}
}
}


