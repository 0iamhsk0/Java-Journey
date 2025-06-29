/* 
public class VariableArguments {
    // private static void add(int n1, int n2){
    // return n1+n2;
    // }

    // private static void add(int n1, int n2, int n3){
    // // return n1+n2+n3;
    // return add(add(n1, n2), n3);
    // }

    // variable arguments --> varargs
    // ... -> elipses

    private static int add(String[] n02, int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static  void main (String[] args) {
        //variable arguments
        System.out.println(add("Hello", 10,23));
        System.out.println(add("Hello", 10, 23, 50, 90));
        System.out.println(add("hi", 90, 21));
}

*/

public class VariableArguments {
    private static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Variable arguments
        System.out.println(add(10, 23)); // Output: 33
        System.out.println(add(10, 23, 50, 90)); // Output: 173
        System.out.println(add(90, 21)); // Output: 111
    }
}
