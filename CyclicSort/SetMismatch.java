package CyclicSort;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {2,1,4,2,6,5};
      setMismatch(arr);
      System.out.println(Arrays.toString(arr));
	}
	
	static int[] setMismatch(int[] arr) {
//	    int i = 0;
//		while(i<arr.length) {
//			int correct = arr[i]-1;
//			if(arr[i] != correct) {
//				swap(arr, i, correct);
//			}
//			else {
//				i++;
//			}
			
			
	    int i=0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		
		}
	// for search first missing number
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != index + 1) {
				return new int[] {arr[index],index+1};
			}
		}
		
		return new int[] {-1,-1};
	
	}
	static void swap(int[] arr, int first, int secound) {
		int temp =arr[first];
		arr[first] = arr[secound];
		arr[secound] = temp;
				
	}
}
