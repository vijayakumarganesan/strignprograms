package stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class DublicateStrings {
	public static void main(String[] args) 
	//int i=1;
	
		
	{
		String str="hi hello hi hello hi hello hi hello original";
		//[hi,hello,hi,am,vijay,am,studying,mca,hi]
		
		String[] strarr=str.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();

		
		for (String string : strarr) {
		if(map.get(string)!=null)
			{
				map.put(string,map.get(string)+1 );
			}else
			{
				map.put(string, 1);
			}
			
		}
		//System.out.println(map);
		

			/*if(map.get(string)!=null)
			{
			   map.put(string, 1);
			   }else
			   {
				   int i=1;
				   map.put(string,);
				   
			   }		
		}*/
		Set<Map.Entry<String, Integer>> set=map.entrySet();
		for (Entry<String, Integer> entry : set) {
			if(entry.getValue()>1)
			{
			System.out.println("dublicate string is:"+entry.getKey());
			System.out.println("dublicate occurence is:"+entry.getValue());
			}
			else
			{
				System.out.println("original string is:"+entry.getKey());
				System.out.println("occurence is:"+entry.getValue());
			}
		}
		}
	}
			
		//}
		
