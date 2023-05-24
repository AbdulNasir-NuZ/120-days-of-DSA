package LinearSearch;

import java.util.Arrays;

public class MaxItem2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] [] arr = new int[] [] {
    	                    {12,1,4,55},
    	                    {3,5,6},
    	                    {154,66,77,9},
    	                    {943,9999}
    };    
          int target = 9999;
          int[] ans = Max(arr,target);System.out.println(max(arr));
          System.out.println(Arrays.toString(ans));
          System.out.println(max(arr));
          
          System.out.println(Integer.MIN_VALUE);
    
	}
	
	static int[] Max(int[][] arr, int target) {
		
		for(int row = 0; row<arr.length; row++)
			
		//for (int[] ints: arr){
			// for(int  element:ints){
			// if(element >max) {
			// max = element;
			//}}
			
			
			{
			for(int cols = 0; cols<arr[row].length; cols++) {
				if(arr[row][cols] == target) {
					return new int[] {row,cols};
				}
			}
			
		}
		return new int[] {-1,-1};
	}
	
	
static int max(int[][] arr) {
	 int max=Integer.MIN_VALUE;
		
		for(int row = 0; row<arr.length; row++) {
			for(int cols = 0; cols<arr[row].length; cols++) {
				if(arr[row][cols]>max) {
					max= arr[row][cols];
				}
			}
		}
		return max;
	}
}
