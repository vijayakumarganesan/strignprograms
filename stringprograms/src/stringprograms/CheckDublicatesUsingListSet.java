package stringprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDublicatesUsingListSet {
	
	public static void main(String args[])
	{
		String[] string=new String[] {"java","python","c","c++"};
	   List dublicates=Arrays.asList(string);
	   Set origianlset=new HashSet (dublicates);
	   if(dublicates.size()!=origianlset.size())
	   {
		   System.out.println("dublicates are mixed");
	   }else
	   {
		   System.out.println("No dublicates !... only originals strings");
	   }
	   
	    
		
	}

}
