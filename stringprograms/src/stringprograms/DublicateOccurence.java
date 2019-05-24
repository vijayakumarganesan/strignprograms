package stringprograms;
import java.util.*;
import java.util.Map.*;

public class DublicateOccurence {

	public static void main(String[] args) {
		
	String str="javaaj";
	displayDublicates(str);
	
	}
	public static void displayDublicates(String str)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}else
			{
				map.put(c,map.get(c)+1);
			}
			
		}
		Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
		for (Entry<Character, Integer> entry : entryset) {
			if(entry.getValue()>1)
			{
				System.out.printf(""+entry.getKey(),entry.getValue());
			}
			
		}
		
		
		}
		
		
		
	}
