package Java.ArrayOperations;

class SumOdd
{
	public static void main(String[] args)
	{
		int sum = 0;
		int[] arr = {3,4,5,7,1,4};
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==1)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}