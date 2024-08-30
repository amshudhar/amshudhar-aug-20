package exam2;

public class Unicode {
	
	public static void main(String[] args) {
		
		String text = "Hello, 🌍! こんにちは";

        int start = 7;
        int end = 13; 

        int codePointCount = text.codePointCount(start, end);

        System.out.println("Number of Unicode code points in the range [" + start + ", " + end + "): " + codePointCount);
		
	}

}
