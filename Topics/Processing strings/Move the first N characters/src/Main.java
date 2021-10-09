import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        System.out.println(moveN(input));

    }

    public static String moveN(String input) {
        final String[] strings = input.split(" ");
        final String string = strings[0];
        final int duzina = Character.getNumericValue(strings[1].charAt(0));
        if (duzina >= string.length()) {
            return string;
        }
        final String prviDeo = string.substring(0, duzina);
        final String drugiDeo = string.substring(duzina, string.length());
        return drugiDeo + prviDeo;
    }
}