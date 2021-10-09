import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       final Scanner scanner = new Scanner(System.in);
       final String alphabet = "abcdefghijklmnopqrstuvwxyz";
       final String input = scanner.nextLine();
        System.out.println(containsPiece(alphabet, input));
    }

    static boolean containsPiece(String alphabet, String input) {
        if (alphabet.contains(input)) {
            return true;
        }
        return false;
    }
}