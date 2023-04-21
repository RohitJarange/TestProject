package programs;

import java.util.Scanner;

public class primenumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		
		for (int i = 2; i <= num/2; i++)
		{
			if (num % i==0)
			{
				flag = true;
			}
		}
		if (!flag)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("Not prime");
		}
	}
}
