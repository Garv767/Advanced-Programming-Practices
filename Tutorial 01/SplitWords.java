import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
