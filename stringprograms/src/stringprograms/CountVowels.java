package stringprograms;

public class CountVowels {
	
	public static void main(String args[])
	{
		int count=0;
		int count1=0;
		String s="vijayaikumariou";
		char[] c=s.toCharArray();
		
		for (char d : c) {
			switch(d)
			{
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
			       count++;
			       break;
			case 'o':
				count++;
				break;
			case 'u':
			    count++;
			    break;
			    default:
			    	System.out.println("consonent is:  "+d);
			    	count1++;
			    	
			}
		}
		System.out.println("No of consonent is:"+count1);
		System.out.println("no of vowels is:"+count);
				
	}

}
