package exam2;

public class Maximum {
	
	public static void main(String[] args) {
		
		 String s1 = "Apple";
	     String s2 = "Banana";

	        int com = s1.compareTo(s2);

	        if (com > 0) {
	            System.out.println("The maximum string is : " + s1);
	        } else if (com < 0) {
	            System.out.println("The maximum string is : " + s2);
	        } else {
	            System.out.println("Both strings are equal.");
	        }
		
	}

}
