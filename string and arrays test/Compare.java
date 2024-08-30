package exam2;

public class Compare {
	
	public static void main(String[] args) {
		
		 String s1 = "HelloWorld";

	     CharSequence c1 = "Hello World";
	        
	        boolean value = s1.contentEquals(c1);

	        if (value) {
	            System.out.println("The string and character sequence are equal");
	        } else {
	            System.out.println("The string and character sequence are not equal");
	        }
		
	}

}
