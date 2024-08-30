package exam2;

public class Negative {
	
	public static void main(String[] args) {
		
		 int[] array = {10, -15, 20, -25, 30, -35, 40};

	        int sum = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < 0) { 
	                sum += array[i];
	            }
	        }
	        
	        System.out.println("Sum of negative numbers in array : " + sum);
		
	}

}
