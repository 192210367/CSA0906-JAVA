import java.io.*;
import java.util.*;
class valid
{
public static void main(String args[])
{
String s1,s2;
Scanner s=new Scanner(System.in);
System.out.println("enter username to verify");
s1=s.nextLine();
System.out.println("enter valid username");
s2=s.nextLine();
if(s1.equals(s2))
{
System.out.println("valid user");
}
else
{
System.out.println("invalid user");
}
}
}

