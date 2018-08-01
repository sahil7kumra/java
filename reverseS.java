import java.util.*;
public class reverseS{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String s="";
int n=a.length();
int i;
for(i=n-1;i>=0;i--)
{
s=s+a.charAt(i);
}
System.out.println(s);
}
}