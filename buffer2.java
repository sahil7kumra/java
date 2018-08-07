import java.io.*;
public class buffer2{
public static void main(String args[])throws IOException
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
int i=0,sum=0;

//String n=br.readLine();
//n.toCharArray();
for(i=0;i<2;i++)

{
int n = Integer.parseInt(br.readLine());
sum=sum+n;
}
System.out.println(sum);
}
}