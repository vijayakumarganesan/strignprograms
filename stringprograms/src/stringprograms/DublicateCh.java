package stringprograms;

public class DublicateCh {
	
	public static void main(String args[])
	{
		String st="";
		String str="vijayva";
		int count = 0,z = 0;
		char c1,c2,dup=' ';
		char[] duplicates = new char[10];
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++) {
				c1=str.charAt(i);
				c2 = str.charAt(j);
				if( c1 == c2) {
					dup = c1;
					duplicates[z] = c1;
					z = z + 1;
					count = count + 1;
				}
				//System.out.println(s);
				//int index = str.indexOf(s);
				//System.out.println(index);
				//str.contains(s);
				
			}
		}
		if(count > 0) {
			System.out.println("Duplication available, the chars are : ");
			for(int x=0;x<duplicates.length;x++) {
				System.out.println(duplicates[x]);
			}
		}else {
			System.out.println("No Duplication");
		}


	}
}