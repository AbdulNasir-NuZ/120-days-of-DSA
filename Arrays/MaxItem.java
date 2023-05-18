package Arrays;

import java.util.ArrayList;

public class MaxItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {22, 999, 1334, 2};
     
     System.out.println(max(arr));
     System.out.println(MaxRang(arr, 0, 2));
	}
	static int max(int[] arr) {
		int maxVal = arr[0];
		 for (int i = 1; i < arr.length; i++) {
			 if(arr[i]>maxVal) {
				 maxVal = arr[i];
			 }
		 }
		 return maxVal; 
	}
	
	
	static int MaxRang( int[]arr, int start, int end) {
		 int maxVal = arr[start];
		 for (int i = start; i <= end; i++) {
		 if(arr[i] > maxVal) {
			 maxVal = arr[i];
		 }
	}
	    return maxVal;
       }
}