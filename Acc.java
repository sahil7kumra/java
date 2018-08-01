import java.util.*;
public class Acc{
private int acc;
private double balance;
int amount;
Acc()
{
}
public void credit(int amount)
{
balance+=amount;
}
public void debit(int amount)
{
if(balance>amount)
{
balance-=amount;
}
else
System.out.println("Amount is greater");
public setbalance(double balance)
{
return balance;}
public getbalance

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
a=sc.nextInt();

