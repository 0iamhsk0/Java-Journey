import java.util.Scanner;

public class TryandCatch {
    static void divide() {
        Scanner scanner = new Scanner(System.in);
        int no1, no2;
        int result = 0;

        try {
            System.out.print("Enter the first number: ");
            no1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            no2 = scanner.nextInt();

            result = no1 / no2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        divide();
    }
}
