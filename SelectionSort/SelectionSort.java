package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
	 int []arr = {3,5,6,7,2,1,0,3};
	 search(arr);
	 System.out.println(Arrays.toString(arr));
 }
 
 static void search(int[] arr) {  
	 for( int i=0; i<arr.length; i++) {
		 // find the max element in the remaining array and swap with correct index
	     int last = arr.length-i-1;
	     int max = getMaxIndex(arr,0, last);
	     swap(arr, max, last);  
	 }
 }
 static void swap(int[] arr, int first, int secound) {
	 int temp = arr[first];
	 arr[first] = arr[secound];
	 arr[secound] = temp;
 }
 
 static int getMaxIndex(int[] arr, int start, int end) {
	// TODO Auto-generated method stub
	int max = start;
	
	for(int i=start; i<=end; i++) {
		if(arr[max] < arr[i]) {
			max = i;
		}
	}
	return max;
 }
}
