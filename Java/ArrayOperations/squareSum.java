
package Java.ArrayOperations;
class squareSum
{
	public static void main(String[] args)
	{
		int sum = 0;
		int[] arr = {1,3,2,5,6};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + (arr[i]*arr[i]*arr[i]);
			}
			else
			{
				sum = sum + (arr[i]*arr[i]);
			}
		}
		System.out.println(sum);
	}
}