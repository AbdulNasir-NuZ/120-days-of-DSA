package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class introArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int [] a = new int[5];
//		System.out.println(a[1]);
//		
//		int[] b = new int[3];
//	     b[1] = 17;
//	     b[0] = 33;
//	     System.out.println(b[1]);
//	     
//	     
//	     int[] c = new int[5];
//	     
//	     for( int i = 0; i<c.length;i++) {
//	    	 System.out.print("Enter the array Element:");
//	    	  c[i] = in.nextInt();
//	    	  
//	     }
//	     
//	     for( int i = 0; i<c.length;i++) {
//	    	 System.out.println(c[i] + " ");
//	     }
//	     
	     String[] str = new String[5];
	     for(int i = 0; i<str.length;i++) {
	    	 str[i] = in.next();
	     }
	     System.out.println("Array Element's are:");
	     System.out.println(Arrays.toString(str));
	}

}
