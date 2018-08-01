
import java.util.*;

public class Author{
private String name,email;
private char gender;
Author(String n,String e,char g)
{
name=n;
email=e;
gender=g;
}
public String getName()
{
return name;
}


public  String getEmail()
{
return email;
}
public void setEmail(String e)

{
email=e;
}
public void setGender(char g)
{
gender=g;
}
public char getGender()

{
	return gender;
}
public String toString()
{

System.out.println("Author[name="+name+" ,email="+email+" ,gender="+gender+"]");
return null;
}

}
 class Book {
private double price;
private String name;
private Author author;
private  int qty;
public Book(String n,Author a,double p,int q)
{
name=n;
author=a;
price=p;
qty=q;
}
public String getName()
{
return name;
}
public Author getAuthor()
{
return author;
}
public double getPrice()
{
return price;
}
public void SetPrice(double p)
{
price=p;

}
 public int  getqty()
{
return qty;
}
public void SetQty(int q)
{
qty=q;
}
public String toString()
{
	System.out.println("Book[name="+name+" ,Author[name="+this.author.getName()+" ,email="+this.author.getEmail()+" ,gender="+author.getGender()+"],price="+price+" ,qty="+qty+"]");

	return null;
}


public static void main(String args[])
{
Author a=new Author("SAhil","sa@hmail.com",'m');
Book b= new Book("Sa",a,100,150);
b.getName();



b.toString();
}
 }



 