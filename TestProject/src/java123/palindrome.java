package java123;

import java.util.Scanner;

public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String org = sc.next();
		String rev = "";
		
		for (int i = org.length()-1; i>=0; i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
		if (org.equals(rev))
		{
			System.out.println("is pallindrome");
		} 
		else
		{
			System.out.println("is not pallindrome");
		}
	}
}
