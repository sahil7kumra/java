interface Drawable{
void draw();
}
class Rectangle implements Drawable{
public void draw()
{
System.out.println("Rectangle");
}
}
class TestInterface1{
public static void main(String args[])
{
Drawable d=new Rectangle();
d.draw();
}
}