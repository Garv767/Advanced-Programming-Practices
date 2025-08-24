public class Increment {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Original x = " + x);
        System.out.println("Post-increment x++ = " + (x++)); // uses then increments
        System.out.println("After post-increment, x = " + x);
        System.out.println("Pre-increment ++x = " + (++x));  // increments then uses
        System.out.println("After pre-increment, x = " + x);
    }
}
