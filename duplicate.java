import java.util.Scanner;

public class duplicate{

	int[] check=new int[199];
	
	public void remove_duplicate(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			check[arr[i]]++;
			if(check[arr[i]]>1)
				arr[i]=0;
			
		}
	}

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array:");
	int size=sc.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the elements one by one:");
	for(int i=0;i<size;i++)
	{
		array[i]=sc.nextInt();
	}
	duplicate dup=new duplicate();
	dup.remove_duplicate(array);
	System.out.println("The array after removing duplicate is:");
	for(int i=0;i<size;i++)
	
		System.out.println(array[i]+"\t");

	
}
}
