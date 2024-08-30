package exam2;

public class Double {
	
	public static void main(String[] args) {
		
		String s = "Hello";

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            result.append(ch).append(ch);
        }
        
        String f = result.toString();
        System.out.println("Original string: " + s);
        System.out.println("Modified string: " + f);
		
	}

}
