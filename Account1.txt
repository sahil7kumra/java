import java.util.*;
public class circle
{
private double radius;
private String color;

circle()
{
	radius=1.0;
	color="red";
}
circle(double radius)
{
	this.radius=radius;
}
public double getRadius()
{
	return radius;
}
public double getArea()
{
	return(3.14*radius*radius);
}
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
circle c1=new circle();
double jk=sc.nextDouble();
circle c2=new circle(jk);
double r1=c1.getRadius();
double r2=c2.getRadius();
double a1=c1.getArea();
double a2=c2.getArea();
System.out.println(a1);
System.out.println(a2);


}
}