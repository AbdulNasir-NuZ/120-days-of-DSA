package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr = new int[][]
		//{ {},};
		
		
                     int[][] arr = {{23, 4, 1},
                    		 {18, 12, 3, 9},
                    		 {78, 99, 35, 4},
                    		 {18,12}
                     };
                     int target = 12;
                     int[] ans = search(arr, target);
                     System.out.println(Arrays.toString(ans));
                     
	}
	
	
	static int[] search(int[][] arr, int target) {
		for(int row = 0; row < arr.length; row++) {
			for(int cols = 0; cols < arr[row].length; cols++) {
				 if(arr[row][cols] == target) {
					 return new int[] {row, cols};
				 }
			}
		}
		return new int[] {-1, -1};
		
	}

}
