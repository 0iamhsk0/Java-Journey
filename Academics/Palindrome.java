import java.util.Scanner;

public class Palindrome {
    public static int isPalindromeHelper(int n, int temp) {
        // Base case
        if (n == 0) {
            return temp;
        }

        // Recursively call with the next digit and build the reverse number
        return isPalindromeHelper(n / 10, temp * 10 + n % 10);
    }

    public static boolean isPalin(int n) {
        // Use a helper function to reverse the number
        return n == isPalindromeHelper(n, 0);
    }

    // Example usage
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(isPalin(n) ? 1 : 0);
    }
}