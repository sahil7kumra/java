import java.io.*;
public class Buffer{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i;
while((i=br.read())!=-1)
{
System.out.print((char)i);  
          }  
          br.close();  
}
}