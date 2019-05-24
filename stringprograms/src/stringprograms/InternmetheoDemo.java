package stringprograms;

//its check the string available on scp area or not existing
//if existing returns string
public class InternmetheoDemo {
 
	public static void main(String args[])
	{
		String str1="vijay";
		String str2=new String("vijay");
		//System.out.println(str1==str2);
		//System.out.println(str1.equals(str2));
	    String str3=str2.intern();
	    System.out.println(str1==str3);	
	}
}
