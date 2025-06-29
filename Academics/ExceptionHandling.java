//statements are of two types:

class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed" + e);
        }
        System.out.println("Value of j is : " + j);
        System.out.println("Hi");
    }

}