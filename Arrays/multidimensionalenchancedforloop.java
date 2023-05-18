package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class multidimensionalenchancedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [][] a = new int[3][3];

		
		System.out.println("Enter the value to the matrix:");
		for (int row = 0; row < a.length; row++) {
			for(int cols = 0; cols< a[row].length; cols ++) {
				 a[row][cols] = in.nextInt();
			}
		}
		
		// output 
		System.out.println("Given Matrix is :");
//		 for (int row = 0 ; row < a.length; row++) {
//			 for(int cols = 0; cols < a[row].length; cols++ ) {
//				 System.out.print(Arrays.toString(a[row])); 
//			 }
//			 System.out.println();
		
		for (int [] arr: a) {
			System.out.println(Arrays.toString(arr));
		 }
 
	}

}
