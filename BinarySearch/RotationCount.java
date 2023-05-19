package BinarySearch;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr = {1,2,3,4,5};
   System.out.println(countRotation(arr));
	}
    
	static int countRotation(int[] arr) {
	int pivot = findPiviot(arr);
		return pivot + 1;
	}
	
	
		//duplicates
		
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
