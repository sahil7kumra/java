



class find
{

	public static void main(String[] args)
	 {
		int arr[]=new int[]{12,14,16,18,20,19};
		int s=arr[0];
		int l=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>l)
				l=arr[i];
			else if(arr[i]<s)
				s=arr[i];
		}
		System.out.println("Largest Number is : " + l);
		System.out.println("Smallest Number is : " + s);
	}
}







