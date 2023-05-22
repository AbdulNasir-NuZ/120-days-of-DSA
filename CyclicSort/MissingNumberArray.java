package CyclicSort;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * if range[0,N]
 * Every Element will be at the index = value
 * if range[1,N]
 * Every element will be at the index = value -1 
 * 
 * Q> [4,3,2,7,8,2,3,1]  N=8
 * */
public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,0,2,1};
		findDisappearedNumbers(nums);
		System.out.println(Arrays.toString(nums));	 
	}
	

	  static List  findDisappearedNumbers(int[] nums){
		int i=0;
		while(i < nums.length) {
			int correct = nums[i] - 1;
			if(nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}
		//just find missing numbers
		
	Object ans = new ArrayList();
		for(int index=0; index<nums.length; index++) {
			if(nums[index] != nums[index-1]) {
				((List) ans).add(null, index + 1);
			}
		}
		return (List) ans;
	}
	
	static void swap(int[] nums, int first, int secound) {
		int temp = nums[first];
		nums[first] =nums[secound];
		nums[secound] = temp;
	}

}
