package stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedElement {
	
	public static char findFirstElement(String str)
	{
		char k;
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(char c:str.toCharArray())
		{
			map.put(c, map.containsKey(c)? map.get(c)+1:1);
			
		}
	for(Entry<Character,Integer> entry: map.entrySet()) 
	{
	 if(entry.getValue()==1)
	 {
	 return entry.getKey();		
	}}
	
	throw new RuntimeException("did'n find the non repeated char");

}}
