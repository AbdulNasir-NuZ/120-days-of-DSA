package CyclicSort;

import java.util.Arrays;


// check , swap , move

public class cyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {5,4,3,2,1};
      sort(arr);
      System.out.println(Arrays.toString(arr));
	}
     
	static void sort(int[] arr) {
		int i=0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		
		
	}
	
	static void swap(int[] arr, int first, int secound) {
		int temp = arr[first];
		arr[first] = arr[secound];
		arr[secound] = temp;
	}
}
