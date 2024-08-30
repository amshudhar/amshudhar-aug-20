package exam2;

import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Canon {
	
	public static void main(String[] args) {
		
		 String originalString = "e~"; 

	        String canonicalForm = Normalizer.normalize(originalString, Form.NFC);

	        System.out.println("Original string: " + originalString);
	        System.out.println("Canonical representation: " + canonicalForm);

	        boolean isCanonical = originalString.equals(canonicalForm);
	        System.out.println("Is the original string canonical? " + isCanonical);
		
	}

}
