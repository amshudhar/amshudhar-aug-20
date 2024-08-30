package exam2;

public class Positive {
	
	public static void main(String[] args) {
		
		int[] array = {10, -15, 20, -25, 30, -35, 40};

        System.out.print("Positive numbers in the array are : ");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {  
                System.out.print(array[i] + " ");
            }
        }
		
	}

}
