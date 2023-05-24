package LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr = {18,23,4,5,0,-2,9};
           int target = 14;
           System.out.println(range(arr, target, 2, 5));
	}
    static int range(int [] arr, int target, int start, int end) {
    	if(arr.length == 0) {
    		return -1;
    	}
    	
    	for(int index = start; index < end; index ++) {
    		int element = arr[index];
    		if(element == target) {
    			return index;
    		}
    	}
    	
    	return -1;
    }
}
