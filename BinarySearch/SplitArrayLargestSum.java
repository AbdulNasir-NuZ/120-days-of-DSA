package BinarySearch;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {7,2,5,10,8};
     System.out.println(splitArray(arr,2));
	}
	
 static int splitArray(int[] nums, int m) {
		int start = 0;
		int end = 0;
		for(int i = 0; i<nums.length; i++) {
			start = Math.max(start, nums[i]);
			// in the end of this loop, it contains maximum element for the array;
			end += nums[i];
		}
		
		while(start < end) {
			int mid = start + (end - start) /2;
			// try for the middle for the potiential answer;
			   
			//calculate how many pieces you can divide with this max sum
		 int sum = 0;
		 int pieces = 1;
		 
		 for(int num : nums) {
			 if(sum + num > mid) {
				//you cann't add this in sub array;
			   // say you add this num in sub array sum = num;
			 
				 sum = num;
				 pieces++;
			 }
			 else
			 {
				 sum += num;
			 }
		 }
		 
		 if(pieces > m) {
			 start = mid + 1;
		 }
		 else {
			 end = mid;
		 }
		
		
		
	}
		return end;

}
}