public class StringClass {
    public static void main(String[] args) {
        // immutable - we cannot change its value
        // using literals
        // String str1 = new String("Hello");

        // using new' keyword
        // String str2 = new String("Hello");
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        if (str3 == str4) {
            System.out.println("Str3 and str3 are equal");
        } else {
            System.out.println("Str3 and str4 are not equal");
        }

    }

}