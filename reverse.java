import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
String str,rev="";
Scanner a=new Scanner(System.in);
System.out.println("enter the word");
str=a.nextLine();
int i;
int n=str.length();
for(i=n-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
System.out.println(rev);
}
}
