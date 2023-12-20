import java.io.*;
import java.util.*;
class student
{
void display()
{
String stname="nare";
System.out.println("student name="+stname);
}
}
class calculate extends student
{
void display1()
{
int m1=56;
int m2=76;
int m3=78;
int m4=90;
int m5=89;
int m6=76;
int m=m1+m2+m3+m4+m5+m6;
float avg=(float)m/6;
}
}
class garde extends calculate
{
void display2()
{
if(m1>=50&&m2>=50&&m3>=50&&m4>=50&&m5>=50)
{
System.out.println("total marks: "+total);
System.out.println("avearage : "+avg);
if(avg>=90)
{
System.out.println("the grade is A+");
}
else if(avg>=80&&avg<90)
{
System.out.println("the grade is A");
}
else if(avg>=70&&avg<80)
{
System.out.println("the garde is B");
}
else if(avg>=60&&avg<70)
{
System.out.println("the grade is C");
}
else
{
System.out.println("the grade is D");
}
}
else
{
System.out.println("you failed the subjct");
}
}
}
class repor
{
public static void main(String args[]);
{
grade g=new grade();
g.display();
g.display1();
g.display2();
}
}

