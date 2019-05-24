package stringprograms;

public class TotalNoOccerencesCh {
	
	public static void main(String args[])
	{
		int count=0;
		char c='v';
		String s="vijayakumar vijay vj vk gvk";
		char[] ch=s.toCharArray();
		for (char d : ch) {
			
			if(d==c)
			{
				count++;
			}else
			{
				//System.out.println("no occur");
			}
			
		}
		System.out.println("no of occur"+count);
	}

}
