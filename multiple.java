import java.io.*;
import java.util.*;
class F
{
int x=5;
void display()
{
System.out.println("father");
}
}
interface M
{
void display1()
{
System.out.println("mother");
}
}
class C extends F,M
{
void display2()
{
Sytem.out.println("child");
}
}
class multiple
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
c.display2();
}

}
