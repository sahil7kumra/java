import java.util.*;
public class Account{
public static void main(String args[])
{
int id=1001;
int balance;
int c=1500;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
  public  void debit(int c)
{
if(a>=500)
{
c=c-a;
System.out.println(c);
}
if(a<=500)
{
System.out.println("Balance is inSufficient");
}
}

public  void credit(int c)
{
c=c+a;
System.out.println(c);
}
}
}


