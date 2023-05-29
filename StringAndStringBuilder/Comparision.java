package StringAndStringBuilder;

public class Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   String a = "abdul";
                   String b = "abdul";
                   
                   System.out.println(a==b);
                   System.out.println();
                   String n = new String("abdul");
                   String m = new String("abdul");
                   System.out.println(n==m);  // refer address / memory location and value;
                   System.out.println(n.equals(m)); // refer value 
                   
                   System.out.println();
                   System.out.println(n.charAt(0));
                   
                   
	}

}
