package CyclicSort;

import java.util.Arrays;

public class firstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,8,9,11,12};
		  //firstMissingPostiveNumber(arr);
	      System.out.println(firstMissingPostiveNumber(arr));
		}
	
	static int firstMissingPostiveNumber(int[] arr) {
    int i=0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i]> 0 && arr[i]<= arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		
		}
	// for search first missing number
		
		for(int index=0; index<arr.length; index++) {
			if(arr[index] != index + 1) {
				return index+1;
			}
		}
		return arr.length+1;
	}
		
	static void swap(int[] arr, int first, int secound) {
		int temp =arr[first];
		arr[first] = arr[secound];
		arr[secound] = temp;
				
	}
} 
