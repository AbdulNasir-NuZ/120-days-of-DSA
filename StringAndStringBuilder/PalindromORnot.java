package StringAndStringBuilder;

public class PalindromORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 System.out.println("Enter the user String:");
//         Scanner s = new Scanner(System.in);
		String s = " ";
         System.out.println(isPalindrome(s));
	}
	
	
	static boolean isPalindrome(String str) {
		if(str == null || str.length() == 0 ) {
			return true;
		}
		str = str.toLowerCase();
		for (int i=0; i<str.length(); i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i); // i = 0; 
			
			if(start  != end) {
				return false;
			}
			}
		return true;
		}
	}


