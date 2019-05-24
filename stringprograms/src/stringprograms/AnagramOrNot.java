package stringprograms;

public class AnagramOrNot {
	
	public static void main(String args[])
	{
		String str1="java";
		String str2="avaja";
		
		boolean decision=AnagramOrNot.checkAnagram(str1, str2);
		if(decision)
		{
			System.out.println("the String is Anagram");
		}
		else
		{
			System.out.println("the string is not Anagram");
		}
		
	}
	
	public static boolean checkAnagram(String str1,String str2)
	{
		char[] ch=str1.toCharArray();
        StringBuilder sb=new StringBuilder(str2);
        for (char c : ch) {
        	int index=sb.indexOf(String.valueOf(c));
        	if(index!=-1)
        	{
        		sb.deleteCharAt(index);
        	}else
        	{
        		return false;
        	}	
		}
        return sb.length()==0;
	}

}
