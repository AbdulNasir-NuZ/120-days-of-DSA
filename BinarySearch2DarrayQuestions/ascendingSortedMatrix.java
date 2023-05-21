package BinarySearch2DarrayQuestions;

import java.util.Arrays;

public class ascendingSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[][] matrix = {
        		 {1,2,3},
        		 {4,5,6},
        		 {7,8,9},
         };
         System.out.println(Arrays.toString(search(matrix,8)));
	}
	//Search in the row provided between the column provided
   static int[] binarySearch(int[][] matrix,int r,int cstart, int cend, int target) {
		while(cstart <= cend) {
			int m = cstart+(cend-cstart) / 2;
			if(matrix[r][m] == target) {
				return new int[] {r,m};
			}
			if(matrix[r][m] < target) {
				cstart = m + 1;
			}
			else {
				cend = m-1; 
			}
		}
		return new int[] {-1,-1};
	}
	
	
   static int[] search(int[][] matrix, int target) {
	 int r = matrix.length;
	 int c = matrix[0].length; //cautious,Matrix may be empty;
	 
	 if(r == 1) {
		 return binarySearch(matrix, 0,0,c-1,target);
	 }
	 //run the loop till 2 rows are remaining;
	 int rstart = 0;
	 int rend = r -1;
	 int cm = c/2; 
	 while(rstart<rend-1) {//while its true it will have more than 2 rows
		 int mid = rstart + (rend-rstart)/2;
		 if(matrix[mid][cm] == target) {
			 return new int[] {mid,cm};
		 }
		 if(matrix[mid][cm] < target) {
			 rstart = mid;
		 }
		 else {
			 rend = mid;
		 }
	 }
	 // now we have 2 rows 
     //check whether the target is in column of 2 rows
      if(matrix[rstart+1][cm] == target) {
    	  return new int[] {rstart + 1,cm };  
      }
      
      
      //search in 1st half
      
      if(target <= matrix[rstart][cm-1]) {
   	    return binarySearch(matrix, rstart, 0, cm - 1,target);
      }
      
      //search in 2nd half,
      
       if(target >= matrix[rstart][cm+1] && target <= matrix[rstart][c - 1]) {
    	 return binarySearch(matrix, rstart, cm + 1, c-1,target);  
       }
      
      //3rd half,
       
       if(target <= matrix[rstart + 1][cm-1]) {
    	   return binarySearch(matrix, rstart + 1, 0, c-1,target);  
       }

      //4th half;
      
      /* if(target >= matrix[rstart + 1][cm-1]) {
	   
       }*/
       else {
    	   return binarySearch(matrix, rstart+1, cm + 1, c-1,target);  
       }
       
     }
}
