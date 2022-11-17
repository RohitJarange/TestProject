package java123;

import java.util.Arrays;

public class arraysort
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
		}
	}
}
