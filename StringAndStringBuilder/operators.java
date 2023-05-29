package StringAndStringBuilder;

import java.util.ArrayList;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println('a'+'b');
	System.out.println("a"+"b");
	System.out.println((char)('a'+3));
	System.out.println("a"+1);
	// integer will be converted to Integer that will call toString()
	
	System.out.println("Kunal"+new ArrayList<>());
	
	System.out.println("Kunal"+ new Integer(50));
	
       //	System.out.println(new Integer(50)+ new ArrayList<>());   ERROR
	   // atleast one of the object should be of type String
	    
	System.out.println(new Integer(50)+" "+new ArrayList<>());
	// "+" in java is only  used in "Premitive"

	
	
	String ans = new Integer(56) + " " + new ArrayList<>();
	System.out.println(ans);
	
	
	}

}
