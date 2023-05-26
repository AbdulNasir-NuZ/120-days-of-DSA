package pattern;

/*
 *    * *  * * 
 *    * * * *
 *    * * * *
 *    * * * *
 */



public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pattern(4);
	}
	
	static void pattern(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=n; col++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
