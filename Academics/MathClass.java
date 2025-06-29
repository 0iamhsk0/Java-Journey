public class MathClass {
    public static void main(String[] args) {
        System.out.println("PI = " + Math.PI);
        System.out.println("sqrt(25) = " + Math.sqrt(25));
        System.out.println("pow(7,3) = " + Math.pow(7, 3));
        System.out.println("ceil(5.68) = " + Math.ceil(5.68));
        System.out.println("floor(5.68) = " + Math.floor(5.68));
        System.out.println("\nrournd(5.68) = " + Math.round(5.68));
        System.out.println("rournd(5.68) = " + Math.round(5.68));

        // random
        System.out.println("random = " + Math.random()); // 0-1
        int min = 0;
        int max = 100;
        System.out.println("random = " + Math.random() * (max - min + 1) + min); // 0-100

        // max and min
        System.out.println("max(15,20)" + Math.max(15, 20));
        System.out.println("min(15,20)" + Math.min(15.35343, 20));
    }
}
