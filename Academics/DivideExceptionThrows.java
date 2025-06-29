import java.util.Scanner;

public class DivideExceptionThrows {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter first number(numerator): ");
        int numerator = inputDevice.nextInt();
        System.out.print("Please enter second number(denominator): ");
        int denominator = inputDevice.nextInt();
        try {
            new DivideExceptionThrows().doDivide(numerator, denominator);
        } catch (Exception e) {
            System.out.println("Exception Condition Program is ending ");
            /*or
            System.out.println(e.getMessage());*/

        }
        inputDevice.close();
    }

    public void doDivide(int a, int b) throws Exception {
        float result = a / b;
        System.out.println("Division result of " + a + "/" + b + "= " + result);
    }
}
