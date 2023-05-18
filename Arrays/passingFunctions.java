package Arrays;

import java.util.Arrays;

public class passingFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,2,3,4,5,6};
       
        	System.out.println(Arrays.toString(nums));
        	change(nums);
        	System.out.println(Arrays.toString(nums));
        
	}
	static void change(int[] nums) {
		nums[0]= 10;
	}

}
