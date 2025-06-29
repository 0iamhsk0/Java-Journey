import java.util.Scanner;

public class Arraynew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Ask user to enter elements for the array
        System.out.println("Enter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the elements entered by the user
        System.out.println("Elements entered by the user:");

        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        scanner.close(); // Close the scanner to release resources
    }
}
