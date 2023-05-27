package recursion;

public class FibonnaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  System.out.println(fibo(50));   wont get output as its calling/ doing the same work again and again
  System.out.println(fibo(8));
	}
	
	
	static int fibo(int n) {
		
		 if(n<2) {
			 return n;
		 }
		return fibo(n-1) + fibo(n-2);
	}

}
 