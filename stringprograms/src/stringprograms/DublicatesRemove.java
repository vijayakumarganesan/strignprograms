package stringprograms;
import java.util.Map.*;
import java.util.*;

public class DublicatesRemove {
	public static void main(String args[])

	{
	String str= "vijayyyyyy";
	System.out.println(dublicatesRemove(str));

	}
	public static String dublicatesRemove(String str)
	{
		int count=0;
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
		Character c=str.charAt(i);
		if(!set.contains(c))
		{
			set.add(c);
			sf.append(c);
		}
		else
		{
			count++;
		}
	}
		System.out.println("Dublicate occurence:"+count);
		System.out.println("Dublicateless word");
		return sf.toString();
		}
}