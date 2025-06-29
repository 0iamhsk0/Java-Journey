public class NestedTryblockDemo {
    public static void main(String[] args) {
        try {
            // some code which can throw Exception
            try {
                // Some code which can throw Arithmatic exception
                try {
                    // Some code which can throw number format exception
                } catch (NumberFormatException n) {
                    // Number format Exception handling
                }
            } catch (ArithmeticException a) {
                // ArithmeticException Handling
            }
        } catch (Exception e) {
            // General Exception(SuperClass of all Exception) Handling
        }
    }
}
