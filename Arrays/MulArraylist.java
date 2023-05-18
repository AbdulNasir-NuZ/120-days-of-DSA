package Arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class MulArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  ArrayList <ArrayList <Integer>> al = new ArrayList<>();
  Scanner in = new Scanner(System.in);
 
  // initialization , initially value is "Null"
  for (int i = 0; i <3; i++){
	  al.add(new ArrayList<>());
  }
  
  //add elements 
  
  for (int i = 0; i <3; i ++) {
	  for(int j = 0; j<3; j++) {
		  al.get(i).add(in.nextInt());
 	   }
     }
  System.out.println(al);
}

}
