package LinearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigitQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] nums = {12,345,2,6,7896,-12};
	    
		System.out.println(findNumber(nums));
		System.out.println(digits(134));
	    System.out.println(digits1(-12334));
		
	}
     static int findNumber(int[] nums) {
    	 int count = 0;
    	    for (int num : nums) {
    	    	if(even(num)) {
    	    		count++;
    	    	}
    	    }
    	 return count;
     }
     
     //function to check even or not in numbers;
     static boolean even(int num) {
     int numberOfDigits = digits(num);
     if(numberOfDigits % 2 == 0) {
    	 return true;
     }
     return false;
    
     // return numberOfDigirts % 2 == 0;
    	  
     }
     
     static int digits(int num) {
    	 
    	 if(num<0) {
    		 num = num * -1;
    	 }
    	 
    	 if(num == 0) {
    		 return 1;
    	 }
    	 
    	 int count = 0;
    	 while(num > 0) {
    		 count++;
    		 num = num/10;   // num/ =10;
    	 }
    	 return count;
     }
     
     static int digits1(int num) {
    	 if(num<0) {
    		 num = num * -1;
    	 }
    	 
    	 if(num == 0) {
    		 return 1;
    	 }
    	 return (int)(Math.log10(num)) + 1;
     }
}
