class pairs 
{
	public static void main(String args[])
	{
		int[]array={2,7,6,9,10};
        int sum=12;
        Count(array,sum);
    }
    public static void Count(int[] arr, int sum)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {    for(int j=i+1;j<arr.length;j++)
            {

            	if((arr[i]+arr[j])==sum)
        		System.out.println("Pair is "+arr[i]+","+arr[j]+"\n");
            }
       }
    }
}