package recursion;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    msg();
    
	}
 static void msg() {
	 System.out.println("Hello World");
	 msg1();
 }
 static void msg1() {
	 System.out.println("Hello World");
	 msg2();
 }
 static void msg2() {
	 System.out.println("Hello World");
	 msg3();
 }
 static void msg3() {
	 System.out.println("Hello World");
	 msg4();
 }
 static void msg4() {
	 System.out.println("Hello World");
 }
}
