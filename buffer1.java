import java.io.*;
public class buffer1{
public static void main(String args[])throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);

String n=br.readLine();
System.out.println("Welcome "+n);
}
}