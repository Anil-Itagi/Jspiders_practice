package Java.ArrayOperations;
class binaryNum
{
	public static void main(String[] args)
	{
		int count = 0;
		int[] arr = {1,2,1,0,3,2,0};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==1 || arr[i]==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
				
			