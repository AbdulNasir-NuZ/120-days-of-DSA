package recursion;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         print(1);
	}

	static void print(int n) {
		//base condition
		if(n == 5) {
			System.out.println(5);
		    return;
		}
		System.out.println(n);
		print(n + 1);
	}
}
