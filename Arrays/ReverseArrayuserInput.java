package Arrays;

import java.util.Scanner;
import java.util.Arrays;


public class ReverseArrayuserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int [] arr = new int[5];
		
		
		System.out.println("Enter the array element's to be reversed:");
		for (int i  = 0; i < arr.length; i++) {
		arr[i] = in.nextInt();
		}
		System.out.println("Reversed Elements are:");
		//for (int i  = 0; i < arr.length; i++) {
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	//}
	}
	 static void reverse(int[] arr) {
		 int start = 0;
		 int end = arr.length-1;
		 
		 while(start < end) {
			 // swapping
			 swap(arr, start, end);
			 start++;
			 end--;
		 }
		 }
		 static void swap(int[] arr ,int index1, int index2) {
				int temp = arr[index1];
				arr[index1] = arr[index2];
				arr[index2] = temp;
			}
		 
		}