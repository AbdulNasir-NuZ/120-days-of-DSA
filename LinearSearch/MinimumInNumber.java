package LinearSearch;

public class MinimumInNumber {
	public static void main(String[] args) {
		int [] arr = {0,-1,233,4532,90,-10};
		System.out.print(min(arr));
	}
	
	static int min(int[] arr) {
		if(arr.length == 0) {
			return -1;
		}
		int ans = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
		
	}

}
