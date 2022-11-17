package java123;

public class stringSwap
{
	public static void main(String[] args)
	{
		String a = " Rohit";
		String b = "Jarange";
		
		a=a+b;
		b=a.substring(0 ,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a+b);
	}
}
