import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] customArray = new int[size];

        // Ask the user to enter elements for the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            customArray[i] = scanner.nextInt();
        }

        // Display the entered array
        System.out.println("Entered Array:");
        printArray(customArray);

        // Reverse the array
        reverseArray(customArray);

        // Display the reversed array
        System.out.println("Reversed Array:");
        printArray(customArray);

        scanner.close();
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }
}
