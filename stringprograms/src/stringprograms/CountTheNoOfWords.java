package stringprograms;

public class CountTheNoOfWords {
	
	public static void main(String args[])
	{
		int count=0;
		String str="i am vijayakumar i am studied in psna college i have completed my mca degree";
		String[] str1=str.split(" ");
		for (String string : str1) {
			
			count++;
			
		}
		System.out.println("no of words in sendence:"+count);
		
	}

}
