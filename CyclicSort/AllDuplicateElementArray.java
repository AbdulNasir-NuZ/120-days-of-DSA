package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {4,3,2,7,8,2,3,1};
		  findDuplicate(arr);
	      System.out.println(Arrays.toString(arr));
		}
  
	
	static List  findDuplicate(int[] arr){
		int i = 0; 
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
			
		}
		
		List<Integer> ans = new ArrayList<>();
		for(int index = 0; index < arr.length; index ++) {
			if(arr[index] != index + 1);
			ans.add(arr[index]);
		}
		return ans;
	}
	
	static void swap(int[] arr, int first, int secound) {
		int temp = arr[first];
		arr[first] = arr[secound];
		arr[secound] = temp;
	}
}
