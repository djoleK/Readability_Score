import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        System.out.println(output(input));

    }

    static String output(String input) {
        final String[] words = input.split(" ");
        String biggerWord = words[0];
        for (String word : words) {
            if (word.length() > biggerWord.length()) {
                biggerWord = word;
            }
        }
        return biggerWord;
    }
}