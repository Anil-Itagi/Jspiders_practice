package Java.ArrayOperations;

class MulOdd
{
	public static void main(String[] args)
	{
		int mul = 1;
		int[] arr = {3,4,5,7,1,4};
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==1)
			{
				mul = mul * arr[i];
			}
		}
		System.out.println(mul);
	}
}