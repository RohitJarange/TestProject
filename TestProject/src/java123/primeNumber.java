package java123;

import java.util.Scanner;

public class primeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		for (int i = 2; i <= num/2; i++)
		{
			if (num % 2 == 0)
			{
				flag = true;
				break;
			}
		}
		if (!flag) 
		{
			System.out.println("is prime");
		} 
		else
		{
			System.out.println("is not prime");
		}
 	}
}
