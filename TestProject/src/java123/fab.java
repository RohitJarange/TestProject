package java123;

public class fab
{
	public static void main(String[] args) 
	{
		int n = 30;
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 1; i <= n; i++)
		{
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
