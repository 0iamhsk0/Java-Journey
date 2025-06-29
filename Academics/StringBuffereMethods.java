public class StringBuffereMethods {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hemanth sai kumar");
        System.out.println("Before appending : " + sb);

        // Appends a string to the existing string buffer object
        sb.append(" is doing Java programming.");
        System.out.println("\nAfter Appending using append() method: " + sb);

        // Creates a new StringBuffer object and appends it with an existing one
        StringBuffer sbf = new StringBuffer("Java is fun!");
        sb.append(sbf);
        System.out.println(
                "\nAfter appending another StringBuffer Object using append() of first StringBuffer Object: " + sb);
        System.out.println("\nAfter appending another StringBuffer Object: " + sb);

        int index = 5;// Gives the position where we want to insert the substring
        String str = "World";// The string which will be inserted in place of old character
        sb.insert(index, str);
        System.out.println("\nAfter inserting a string at a particular Index using insert() method: " + sb);

        /*
         * The delete() method removes the specified range of characters from this
         * string buffer. If the beginIndex is equal to endIndex, then no copy of chars
         * are removed
         */
    }
}