package exam2;

public class Unique {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 20, 30, 40, 50, 50, 60};

        System.out.print("Unique elements in the array are : ");

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
		
	}

}
