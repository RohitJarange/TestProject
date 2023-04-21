package programs;

import java.util.Scanner;

public class evenodd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		
		if (Num % 2 == 0)
		{
			System.out.println("even");
		} 
		else 
		{
			System.out.println("odd");
		}
	}
}
