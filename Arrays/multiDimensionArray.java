package Arrays;

import java.util.Scanner;
public class multiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*
    *  1 2 3
    *  4 5 6
    *  7 8 9
    */
		
		Scanner in = new Scanner(System.in);
		//int[][] arr = new int[3][];
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
	};
		
		int[] [] num = { {1,2,3},
				{4,5},
				{6,7,8}
		};
		
		int [][] m = new int[3][3];
		
		System.out.println("The length of 2d array is :"+m.length);
		
		//input rows:
		System.out.println("Enter the input for matrix:");
		for ( int row = 0; row< m.length; row ++) {
			for (int col = 0; col < m[row].length; col ++) {
				m[row][col] = in.nextInt();
			}
		}
		
		// output rows:
		for(int row = 0; row < m.length; row ++) {
			for (int col = 0; col < m[row].length; col ++) {
				 System.out.print( m[row][col] + " "); 
			}
			
			System.out.println();
		}
	}

}
