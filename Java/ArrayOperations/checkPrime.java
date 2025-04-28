package Java.ArrayOperations;

class checkPrime
{
	public static void main(String[] args)
	{
		int count = 0;
		int[] arr = {2,3,9,7,6,12,13};
		for(int i =0; i<arr.length; i++)
		{
			boolean flag = true;
			int item = arr[i];

			for (int j = 2; j < item; j++) {
				if (item % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				count++;
			}

		}
		
		System.out.println(count);
	}
}