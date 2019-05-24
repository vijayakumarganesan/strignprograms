package stringprograms;

public class RecurtionUsingReverseString {
	
	public static void main(String args[])
	{
		String str="hello ";
		String str1=RecurtionUsingReverseString.reverseString( str);
		System.out.println(str1);
	}
	
	public static String reverseString(String str)
	{
		if(str.length()==0)
		  return str;
		else
		
			return reverseString(str.substring(1))+str.charAt(0);
			
	}
}
