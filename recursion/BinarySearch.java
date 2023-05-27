package recursion;

//Binary Search in recursion
// f(n) = 0(1) + f(n/2) 


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12, 31, 41, 54, 64, 65, 66, 89}; // should be in ascending order or descending order for binary Search
		int target = 12;
		System.out.println("The length of array is " + arr.length);
        System.out.println("The Target found in the postion : "+search(arr, target, 0, arr.length-1));
	} 

	static int search(int[] arr, int target,int start, int end) {
     if(start>end) {
    	 return -1;
     }
     int mid = start+(end-start)/2;
     if(arr[mid] == target) {
    	 return mid;
     }
     
     if(target<arr[mid]) {
    	 return search(arr,target,start, mid -1);
     }
     
     return search(arr,target,mid+1, end);

	}
}
