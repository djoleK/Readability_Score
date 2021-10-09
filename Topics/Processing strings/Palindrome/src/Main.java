import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        if (isPalindrome(editedString(input))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static String editedString(String input) {
        String recenica = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                recenica += "";
            } else {
                recenica += input.charAt(i);
            }
        }
        return recenica.toLowerCase();
    }

    static boolean isPalindrome(String editedString) {
        for (int i = 0; i < editedString.length() / 2; i++) {
            if (editedString.charAt(i) != editedString.charAt(editedString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}