import java.io.*;
import java.util.*;
class binary
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
int n=num;
int i=1;
int sum=0;
int a;
while(num!=0)
{
a=num%2;
sum=sum+a*i;
num=num/2;
i=i*10;
}
System.out.println("binary="+sum);

}
}
