import java.io.*;
import java.util.*;
class octal
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
int i=1;
int sum=0;
int a;
while(num!=0)
{
a=num%8;
sum=sum+a*i;
num=num/8;
i=i*10;
}
System.out.println("binary="+sum);

}
}
