package Arrays;


import java.util.Scanner;
import java.util.ArrayList;

public class arraylistUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> list = new ArrayList <>(10);
		
   Scanner in = new Scanner(System.in);
   
   //Input
		 for(int i = 0 ; i < 5; i++) {
	    	 list.add(in.nextInt());
		 }
		 //Output 
		 
		 for(int i = 0 ; i < 5; i++) {    
		 System.out.print(list.get(i));
		 }
		 System.out.println();
		 System.out.println(list);
	}

}
