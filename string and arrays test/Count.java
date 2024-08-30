package exam2;

public class Count {
	
	public static void main(String[] args) {
		
		String text = "Hello World! This is a Java Program.";

        // Variables to store counts of uppercase and lowercase letters
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Loop through each character in the string
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        // Print the results
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
		
	}

}
