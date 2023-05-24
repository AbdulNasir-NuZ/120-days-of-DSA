package LinearSearch;

public class SearchingInArrray {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
		int[] nums = {23, 45, 1, 15, 33, 78, -11};
		int target = 23;
		int ans = linearSearch(nums,target);
		int ans1 = linearSearch1(nums,target);
		boolean ans2 = linearSearch2(nums,target);
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}
	
    static int linearSearch(int[]arr, int target) {
    	 if(arr.length == 0) {
    		 return -1;
     }
    	 
    	 //Run a for Loop
    	 for(int index = 0; index < arr.length; index++) {
    		 //check for element at every index if it is = target
    		  int element = arr[index];
    		  if(element == target) {
    			  return index;
    		  }
    	 }
    // target not found;
    	 return -1;
    } 
    //----------------------------------------------------------------------------------------------//
    static int linearSearch1(int[]arr, int target) {
   	 if(arr.length == 0) {
   		 return -1;
    }
   	 
   	 //Run a for Loop
   	 for(int element: arr) {
   		 //check for element at every index if it is = target
   		  if(element == target) {
   			  return element;
   		  }
   	 }
   // target not found;
   	 return -1;
   }
    
    //---------------------------------------------------------------------------------------------------//
    
    static boolean linearSearch2(int[]arr, int target) {
      	 if(arr.length == 0) {
      		 return false;
       }
      	 
      	 //Run a for Loop
      	 for(int element: arr) {
      		 //check for element at every index if it is = target
      		  if(element == target) {
      			  return true;
      		  }
      	 }
      // target not found;
      	 return false;
      } 
}
