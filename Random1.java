
import java.util.Random;
public class Random1{
public static void main(String[] args) {
Random obj=new Random();
int i=obj.nextInt(26)+1;
	int a=i+96;
char s=(char)a;
int c=0;
if(s=='a' || s=='b' || s=='c')
{
c=2;
}
if(s=='d'  || s=='e' || s=='f')
{
c=3;
}if(s=='g'  ||s=='h' || s=='i')
{
c=4;
}if(s=='j'  || s=='k' || s=='l')
{
c=5;
}if(s=='m'  || s=='n' || s=='o')
{
c=6;
}if(s=='p'  || s=='q' || s=='r' ||s=='s')
{
c=7;
}
if(s=='t'  || s=='u' || s=='v')
{
c=8;
}if(s=='w'  || s=='x' || s=='y'||s=='z')
{
c=9;
}



System.out.println(s);
System.out.println(c);
}
}


