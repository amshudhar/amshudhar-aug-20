package exam2;

public class Same {
	
	public static void main(String[] args) {
		
		 String s1 = "HelloWorld";
	     String s2 = "HelloWorld";
	     String s3 = "HelloWorld!";

	        boolean areEqual1 = s1.equals(s2);

	        boolean areEqual2 = s1.equals(s3);

	        System.out.println("String1 and String2 are equal: " + areEqual1);
	        System.out.println("String1 and String3 are equal: " + areEqual2);
		
	}

}
