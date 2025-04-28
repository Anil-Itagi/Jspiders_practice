package Java.ArrayOperations;

class numCount
{
	public static void main(String[] args)
	{
		int count = 0;
		int[] arr = {4,5,6,7,8,2};
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
