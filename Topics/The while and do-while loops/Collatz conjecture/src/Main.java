import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int input = scanner.nextInt();
        collatz(input);
    }

    public static void collatz(int input) {
        int current = input;
        System.out.print(current + " ");
        while (current != 1) {
            if (current % 2 == 0) {
                current = current / 2;
                System.out.print(current + " ");
            } else if (current % 2 != 0) {
                current = current * 3 + 1;
                System.out.print(current + " ");
            }
        }
    }
}