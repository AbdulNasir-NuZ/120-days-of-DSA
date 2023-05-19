package BinarySearch;

public class RBSduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {2,2,2,2,9};
       System.out.println(findPiviot(arr)); // retuns the index number not the Element;
	}
	
	static int search(int[] nums, int target) {
		int pivot = findPiviot(nums);
		
		//if you d'not find a pivot, it means the array is not rotated;
		
		if(pivot == -1) {
			// just binary search
	       		return binarySearch(nums, target, 0, nums.length-1);
		}
		
		// if pivot is found , you  have 2 asc sorted array;
		
		if(nums[pivot] == target) {
			return pivot;
		}
		
		if (target > nums[0]) {
			return binarySearch(nums, target, 0, pivot -1);
		}
		return binarySearch(nums, target, pivot +1, nums.length-1);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
	 
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
	
	
	
	static int findPiviot(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		while(start <= end) {
			int mid = start + (end -start) / 2;
		 // 4 case's:
		if(mid < end && arr[mid] > arr[mid+1]) {
			return mid;
		}
		if(mid > start && arr[mid] < arr[mid-1]) {
			return mid-1 ;
		}
		
		// if elements at mid, start, end are equal just skip duplicates;
		if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
			//skip the duplicates
			
			// note: elements are at start and end are pivot ?
			//check if start is pivot
			if(arr[start] > arr[start+1]) {
				return start;
			}
			start++ ;
			 
			//check whether End is pivot are not ?
			if(arr[end] < arr[end-1])
			{
				return end - 1;
			}
		
			end-- ; 
		}
		else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                   		start = mid +1;
		}
                   	else {
                   		end = mid - 1;
                   	}
		}
		return -1;
		}
 
}