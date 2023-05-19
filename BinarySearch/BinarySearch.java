package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22,33,44,55,66};
		int ans = binarySearch(arr, 66);
       System.out.println(ans);
	}
	
	
	//returns the index
	// return -1  if doesn't exist
	
	static int binarySearch(int[] arr, int target) {
		 int start = 0; 
		 int end = arr.length -1;
		 
		 while(start <= end) {
			 // find the middle element
			 
			 //int mid = (start + end) / 2;  integer value may be exceeded 
			 int mid = start +(end - start) / 2;
			 
			 if (target < arr[mid]) {
				 end = mid - 1;
			 }
			 else if(target > arr [mid]) {
				 start = mid + 1;
			 }
			 else 
				 return mid;
		 }
		 return -1;
	}

}
