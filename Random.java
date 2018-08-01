
import java.util.Random;
public class Random{
public static void main(String[] args) {
Random obj=new Random();
for(int i=0;i<26;i++)
{
int a = obj.nextInt(100);

String str;
str = Character.toString((char)i);
System.out.println(i);

}
}
}

