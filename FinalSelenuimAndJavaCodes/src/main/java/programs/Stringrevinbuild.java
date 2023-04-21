package programs;

public class Stringrevinbuild
{
	public static void main(String[] args) 
	{
		String str = "Rohit";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb.length());
	}
}
