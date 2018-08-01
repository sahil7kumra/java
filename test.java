import java.util.Scanner;
class test
{
	public static void main (String[] args) 
	{
		int a[]=new int[] {1,5,2,7,3};
		int k;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		int c=0;
		for(int i=0;i<a.length-1;i++)
    	{
        	for(int j=0;j<a.length-i-1;j++)
        	{
        		
           	 	if(a[j]>a[j+1])
           	 	{
           	 		
           	   		c=a[j];
           	   	  	a[j]=a[j+1];
           	     	a[j+1]=c;
           	 	}
        	}
    	}
    	System.out.println (k+" Smallest element is "+a[k-1]);
		
	}
}