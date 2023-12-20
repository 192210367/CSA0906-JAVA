import java.io.*;
import java.util.*;
class eligible
{
public static void main(String args[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("enter age:");
age=s.nextInt();
if(age>=18)
{
System.out.println("eligible for vote");
}
else
{
System.out.println("not eligible "+(18-age)+"years left to be eligible");
}
}
}
