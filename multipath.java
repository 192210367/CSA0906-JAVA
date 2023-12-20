import java.io.*;
import java.util.*;
class GP
{
void display()
{
System.out.println("am having 10cr");
}
}
class F extends GP
{
void display1()
{
System.out.println("am having 5cr");
}
}
class  M extends GP
{
void display2();
{
System.out.println("am having 5cr");
}
}
class C extends F 
{
 void display3()
{
System.out.println("Father give  10cr");
}
}
class multipath
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
c.display2();
c.display3();
}
}
