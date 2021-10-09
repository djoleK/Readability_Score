import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();
        System.out.println(output(input));


    }

    public static int output(String input) {
        if (!input.toLowerCase().contains("the")) {
            return -1;
        }
        return input.toLowerCase().indexOf("the");
    }
}