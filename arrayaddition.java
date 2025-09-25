
public class arrayaddition {
    public static void main(String[] args) {
        // Define two arrays of the same size
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Create a result array to store the sum
        int[] result = new int[array1.length];

        // Perform element-wise addition
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        // Print the result array
        System.out.println("Resultant Array:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

