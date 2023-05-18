package Arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {18,23,24,55,1};
       swap(arr,4,0);
	
	System.out.println(Arrays.toString(arr));
}
	static void swap(int[] arr,int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
