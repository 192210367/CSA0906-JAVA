import java.io.*;
import java.util.*;
class users
{
public static void main(String args[])
{
int tu,su,nsu,stu;
Scanner a=new Scanner(System.in);
System.out.println("Enter the total number of users in the college: ");
tu=a.nextInt();
System.out.println("enter staff users: ");
su=a.nextInt();
nsu=su/3;
stu=tu-(su+nsu);
System.out.println("student users="+stu);
System.out.println("non staff users="+nsu);
}
}