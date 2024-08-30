package exam2;

public class End {
	
	public static void main(String[] args) {
		
		String os = "original string";
        String os2 = "string";

        boolean value = os.endsWith(os2);

        if (value) {
            System.out.println("The original string ends with other string");
        } else {
            System.out.println("The original string does not end with other string");
        }
		
	}

}
