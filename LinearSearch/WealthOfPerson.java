package LinearSearch;

//  https://leetcode.com/problems/richest-customer-wealth/

public class WealthOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] accounts = {{2,3,5},
        					{3,5,6},
        					{5,6,7}
	};
        System.out.println(maximumWealth(accounts));
}
	 public static int maximumWealth(int[][] accounts) {
		  int ans = Integer.MIN_VALUE;
		  
		 for(int person = 0; person < accounts.length; person++) {
			 int sum = 0;
			 for(int account = 0; account < accounts[person].length; account++) {
				 sum += accounts[person][account];
			 }
			 //sum of account of person;  check with overall ans;
			 if(sum > ans) {
				 ans = sum;
			 }
		 }
		 return ans;
	 }
	

}
