package Java.ArrayOperations;

class MulArray
{
	public static void main(String[] args)
	{
		int mul =1;
		int[] arr = {3,5,6,7,8,9};
		for(int i = 0; i<arr.length; i++)
		{
			mul = mul*arr[i];
		}
		System.out.println(mul);
	}
}