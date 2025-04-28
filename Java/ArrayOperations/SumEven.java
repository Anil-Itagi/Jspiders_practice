package Java.ArrayOperations;

class SumEven
{
	public static void main(String[] args)
	{
		int sum = 0;
		int[] arr = {2,3,4,5,6,8};
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}