public class StringBufferClass {

    public static void main(String[] args) {
        // Create a string buffer object
        // these are synchronized
        // and are mutable

        StringBuffer buffer = new StringBuffer("Bienvenido");
        System.out.println("Length = " + buffer.length());
        System.out.println("Capacity = " + buffer.capacity());

        System.out.println("append = " + buffer.append(" ! tu eres espaniol maestro?"));
        System.out.println("char at 10 = " + buffer.charAt(9));
        System.out.println("index of o = " + buffer.indexOf("o"));
        System.out.println("reverse = " + buffer.reverse());
    }
}