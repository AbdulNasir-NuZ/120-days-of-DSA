package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int []arr = {20,12,19,10,100};
       int [] arr = {-1,-2,-3,-4,0,5};
      bubblesort(arr);
      System.out.println(Arrays.toString(arr));
	}
  static void bubblesort(int[] arr) {
	  
	  boolean swapped;
	  //run the steps n-1 times
	  
	  for(int i = 0; i<arr.length; i++) {
		  // for each step maximum item will come at the last respective index;
		  swapped = false;
		  
		  for(int j = 1; j<arr.length-i; j++) {
			  
			  //swap the previous element if it is smaller than next element;
			  
			  while(arr[j]<arr[j-1]) {
			  int temp = arr[j];
			  arr[j] =arr[j-1];
			  arr[j-1] = temp;
			  swapped = true;
		  }
			  
	  }
		  
		  //if you did not swap for particular value of i, it means the array is sorted hence stop the program;
	   if(!swapped) {   // !false = true;
		   break;
	   }
	  
	  }
  }
}
