package stringprograms;

import java.util.HashSet;
import java.util.Set;

public class Removedublicates {
	
	public static void main(String args[])
	{
		String s="java";
		
		Set<Character> s1=new HashSet<>();
		//StringBuffer sf=new StringBuffer();
		char[] c=s.toCharArray();
		for (char d : c) {
			if(!s1.contains(d))
			{
				s1.add(d);
				//sf.append(d);
				
			}else
			{
			System.out.println("dublicate char:"+d);
			}
			
		}
		System.out.println("original string:"+s1.toString());
		
	}

}
