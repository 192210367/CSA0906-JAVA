import java.io.*;
import java.util.*;
final class P
{
final int x=5;
final void display()
{
System.out.println("parent");
System.out.println(x++);
}
}
class C extends P 
{
void display()
{
System.out.println("child");
}
}
class mow
{
public static void main(String args[])
{
C c=new C();
c.display();
P p=new P();
p.display();
}
}
