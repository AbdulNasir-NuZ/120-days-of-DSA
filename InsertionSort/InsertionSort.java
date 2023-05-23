package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {

	 int[] arr = {3,-1,5,-3,2,7};
	 inserationsort(arr);
	 System.out.println(Arrays.toString(arr));
 }

 static void inserationsort(int[] arr) {
	 for(int i=0 ; i<arr.length-1;i++) {
		 for(int j=i+1; j>0; j--) {
			 if(arr[j] < arr[j-1]) {
				 swap(arr,j,j-1);
			 }
			 else
			 {
				 break;
			 }
		 }
	 }
 }
 
 static void swap(int[] arr, int first, int secound) {
	 int temp = arr[first];
	 arr[first] = arr[secound];
	 arr[secound] = temp;	 
	 }
 }

