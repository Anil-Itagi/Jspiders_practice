package Java.ArrayOperations;

class SumFact
{
	public static void main(String[] args)
	{
		
		int sum = 0;
		int[] arr = {2,3,5,2,3};
		for(int j = 0; j<arr.length; j++)
		{
			
			sum = sum+ facto(arr[j]);
		}
		System.out.println(sum);
	}
	public static int facto(int n)
	{
		int fact = 1;
		for(int i =2; i<=n; i++)
			{
				fact = fact*i;
			}
		return fact;
	}
}
			