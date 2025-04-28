package Java.ArrayOperations;

class oddCount
{
	public static void main(String[] args)
	{
		int count =0;
		int[] arr = {3,4,5,6,8,1};
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
		