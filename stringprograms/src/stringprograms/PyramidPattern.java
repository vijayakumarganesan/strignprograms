package stringprograms;

public class PyramidPattern {

 public static void main(String args[])
 {
	 Pattern();
 }
 public static void Pattern()
 {
	 int i,j,k,n=5;
	 for( i=1;i<=n;i++)
	 {
		 for( j=i;j<n;j++)
		 {
			 System.out.print(" ");
		 }
		 for(k=1;k<(i*2);k++)
		 {
			 System.out.print(k);
		 }
		 System.out.println("");
	 }
 }
}
