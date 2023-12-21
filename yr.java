import java.io.*;
import java.util.*;
class yr
{
public static void main(String args[])
{
int num,years,rd,weeks,days;
Scanner s=new Scanner(System.in);
System.out.println("enter number of days");
num=s.nextInt();
years=num/365;
rd=num%365;
weeks=rd/7;
days=rd%7;
System.out.println("no of years="+years);
System.out.println("no of remaining days="+rd);
System.out.println("no of weeks="+weeks);
System.out.println("no fo days="+days);
}
}
