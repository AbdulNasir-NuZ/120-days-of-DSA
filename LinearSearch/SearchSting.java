package LinearSearch;

import java.util.Arrays;

public class SearchSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String Name = "Abdul Nasir";
    char target  = 'N';
    System.out.println(search(Name, target));
     System.out.println(Arrays.toString(Name.toCharArray()));
	}
	
	static boolean search(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for(int i = 0; i <str.length(); i++) {
			if(target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean search1(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for(char ch: str.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
	return false;	
	}

}
