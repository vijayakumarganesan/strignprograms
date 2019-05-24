package stringprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DublicateOccurences {
	
	
	public static void main(String args[])
	{
		String str="vijayakumar welcome hi welcome vijayakumar hi howareyou";
		
	}
	public static void FindDublicate(String str)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String[] s=str.split(" ");
		for(String str1:s)
		{
			if(hm.get(str1)!=null)
			{
				hm.put(str1, hm.get(str1)+1);
			}else
			{
	
				hm.put(str1, 1);
			}
			
		}
	
		Iterator<String> i=hm.keySet().iterator();
		while(i.hasNext())
		{
		
			
		}
	}

}
