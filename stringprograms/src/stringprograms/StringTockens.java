package stringprograms;
import java.util.StringTokenizer;

public class StringTockens {

	public static void main(String args[])
	{
		String str="vijayakumar learn java";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());

		}
		String str1="vijay*kumar";
		StringTokenizer st1=new StringTokenizer(str1,"*");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());

		}
		
	}
}
