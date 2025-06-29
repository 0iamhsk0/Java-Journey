public class StringBuilderClass {

    public static void main(String[] args) {
        // Create a string string builder object
        // these are synchronized
        // and are mutable

        StringBuffer sb = new StringBuffer("Bienvenido");
        System.out.println("Length = " + sb.length());
        System.out.println("Capacity = " + sb.capacity());

        System.out.println("append = " + sb.append(" ! tu eres espaniol maestro?"));
        System.out.println("char at 10 = " + sb.charAt(9));
        System.out.println("index of o = " + sb.indexOf("o"));
        System.out.println("reverse = " + sb.reverse());
    }
}