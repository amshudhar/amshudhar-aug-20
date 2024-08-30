package exam2;

public class Average {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double avg = sum / array.length;

        // Print the average value
        System.out.println("Average of array elements are : " + avg);
		
	}

}
