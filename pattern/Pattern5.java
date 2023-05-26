package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(3);
	}
 
	static void pattern(int n) {
		for(int row=1; row<=2*n; row++) {
			int totalcolsInRow = row > n ? 2*n-row:row;
			for(int col=1; col<=totalcolsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
