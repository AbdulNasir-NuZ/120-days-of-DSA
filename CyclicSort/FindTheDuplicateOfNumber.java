package CyclicSort;

import java.util.Arrays;

// 287. find the duplicate of numbers;

public class FindTheDuplicateOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[]  nums = {5,4,3,2,1,2};
		  findDupNum(nums);
	      System.out.println(Arrays.toString(nums));
		}
	
	static int findDupNum(int[] nums) { 
		int i = 0;
		while(i < nums.length) {
			
		if(nums[i] != i+1) {
				int correct = nums[i] - 1;
			    if(nums[i] != nums[correct]) 
			    {
				   swap(nums, i, correct);
			    } 
			    else 
			    {
				       return nums[i];
			     }
		    }
		else 
		{
				i++;
		    }	
	}
		
      return -1;
	}
	
	static void swap(int[] nums, int first, int secound) {
		int temp = nums[first];
		nums[first] = nums[secound];
		nums[secound] = temp;
				}
}
