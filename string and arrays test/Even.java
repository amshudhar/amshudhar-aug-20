package exam2;

public class Even {
	
	public static void main(String[] args) {
		
		int[] array = {10, 15, 20, 25, 30, 35, 40};

        System.out.print("Even array elements : ");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { 
                System.out.print(array[i]+" ");
            }
        }
		
	}

}
