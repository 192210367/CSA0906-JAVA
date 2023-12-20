import java.io.*;
import java.util.*;
class circle
{
float ar(int a)
{
return (float)(3.14*a*a);
}
float ar(float b)
{
return (float)(2*3.14*b);
}
}
class circlemol
{
public static void main(String args[])

{
circle m=new circle();
System.out.println(m.ar(5));
System.out.println(m.ar(4.5f));
}
}

