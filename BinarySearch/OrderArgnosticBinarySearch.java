package BinarySearch;

public class OrderArgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] arr = {-10, -7, -5, -2, -1, 0, 3, 5, 8, 10, 89};
		            // 0    1   2   3   4  5  6  7  8  9   10
		int [] arr = {99, 87, 65, 22, 10, 8, -3, -5, -8, -10, -89};
		int ans = BinarySearch(arr, 87);
		System.out.println(ans);

	}

	
	static int BinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		
		//find whether array sorted in asc / desc
		
		boolean isAsc = arr[start] < arr[end];
		
		/* 
		 *  boolean isAsc;
		 *  
		 *  if(arr[start] < arr[end]){
		 *  isAsc = true;
		 *  else
		 *  isAsc = false;
		 * }
		 */
		
		
		while(start <= end) {
			int mid = start +(end - start) / 2;
			
			
			if(arr[mid] == target) {
				return mid;
			}
				
		if(isAsc) {
				
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else 
			{
				start = mid + 1;
			}
			
		}
		else 
			{
				if(target > arr[mid]) {
					end = mid - 1;
				}
				else
				{
					start = mid + 1;
				}
			
		}
		
	}
		return -1;
		
}
}