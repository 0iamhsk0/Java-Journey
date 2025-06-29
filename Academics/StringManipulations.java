public class StringManipulations {
    // there is no destructor in java
    // simultaneously there will be a garbage collector which will take care of
    // memory management.
    // stringPool();
    // immutable();

    // stringMethods()
    public static void main(String[] args) {
        String str1 = "Hola buenas norches!";
        String str2 = "Hola Tu hablas Ingles?";

        System.out.println("Length = " + str1.length());
        System.out.println("char at 5 = " + str1.charAt(5));
        System.out.println("Compare to = " + str1.compareTo(str2));
        System.out.println("compare to ignorecase: " + str1.compareToIgnoreCase("norches"));
        System.out.println("concat = " + str1.concat("Mucho gusto!"));
        System.out.println("contains = " + str1.contains("s!"));
        System.out.println("index of = " + str1.indexOf("o"));
        System.out.println("last index of = " + str1.lastIndexOf("o"));

        System.out.println(str1);
        System.out.println("trimmed: " + str1.trim());

    }
}