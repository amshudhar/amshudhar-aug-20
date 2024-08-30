package exam2;
import java.util.Scanner;

public class Search {
	
	public static void main(String[] args) {
		
		int[] array = {10, 15, 20, 25, 30, 35, 40};
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int se = sc.nextInt();

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == se) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("Element found in array at index : " + index);
        } else {
            System.out.println("Element not found in the array");
        }
		
	}

}
