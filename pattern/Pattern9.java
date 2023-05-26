package pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           pattern(5);
	}
	static void pattern(int n) {
		 
		n = 2*n;
		 for(int row=0; row<=n; row++) {
			 for(int col=0; col <=n; col++) {
				 int everyIndex =Math.min(Math.min(row, col),Math.min(n-row, n-col));
				 System.out.print(everyIndex + " ");
			 }
			 System.out.println();
		 }
	}

}
