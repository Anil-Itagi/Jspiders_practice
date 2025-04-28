package Java.ArrayOperations;

class MulEven
{
	public static void main(String[] args)
	{
		int mul = 1;
		int[] arr = {2,3,4,5,6,8};
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				mul = mul * arr[i];
			}
		}
		System.out.println(mul);
	}
}