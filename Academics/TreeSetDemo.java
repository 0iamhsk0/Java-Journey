import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> playerSet = new TreeSet<String>();
        playerSet.add("Sachin");
        playerSet.add("Zahir");
        playerSet.add("Mahi");
        playerSet.add("Bhajji");
        playerSet.add("Viru");
        playerSet.add("Gautam");
        playerSet.add("Ishant");
        playerSet.add("Umesh");
        playerSet.add("Pathan");
        playerSet.add("Virat");
        playerSet.add("Sachin"); // This is duplicate element so will not be added again
        // below will print list in alphabetic order
        System.out.println("Original Set:" + playerSet);
        System.out.println("First Name: " + playerSet.first());
        System.out.println("Last Name: " + playerSet.last());
        TreeSet<String> newPlySet = (TreeSet<String>) playerSet.subSet("Mahi", "Virat");
        System.out.println("Sub Set: " + newPlySet);
    }
}
