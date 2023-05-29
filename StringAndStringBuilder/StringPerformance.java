package StringAndStringBuilder;

public class StringPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String series = "";
		for(int i = 0; i<26; i++) {
//			char ch = (char)(i); // integer to char with numerical value ;
			char ch = (char)('A'+i);  // based on the starting Charter its going to add next consequence number;
			System.out.println(ch);
			series = series + ch;
		}
		System.out.println();
		System.out.println(series);
	}

}
