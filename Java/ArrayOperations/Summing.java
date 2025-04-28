package Java.ArrayOperations;

class Summing
{
	public static void main(String[] args)
	{
		int sum = 0;
		int arr[] = {10,2,3,5,6,4};
		for(int i = 0; i<arr.length; i++)
		{
			sum = sum+ arr[i];
		}
		System.out.println(sum);
	}
}
			