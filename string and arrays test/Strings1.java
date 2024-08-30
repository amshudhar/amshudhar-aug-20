package exam2;

public class Strings1 {
	
	public static void main(String[] args) {
		
		int[] originalArray = {1, 2, 3, 4, 5};
		
        
        int[] CopiedArr = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            CopiedArr[i] = originalArray[i];
        }

        System.out.print("Original Array : ");
        for (int element : originalArray) {
            System.out.print(element + " ");
        }

        System.out.print("\nCopied Array: ");
        for (int element : CopiedArr) {
            System.out.print(element + " ");
        }
		
	}

}
