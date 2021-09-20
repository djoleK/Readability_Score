package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        if (input.isEmpty() || input.length() <= 100) {
            System.out.println("EASY");
        } else {
            System.out.println("HARD");
        }

    }
}
