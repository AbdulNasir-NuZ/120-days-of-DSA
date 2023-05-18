package Arrays;

public class colNoFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[][] arr = {
		  {1,2,3,4 },
		  {1,2,3},
		  {1,2,3,4,5}
	};
	for(int row = 0; row < arr.length; row++) {
		for(int cols = 0; cols < arr[row].length; cols++) {
			System.out.print(arr[row][cols]+" ");
		}
		System.out.println();
	}

}
}
