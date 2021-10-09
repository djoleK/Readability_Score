import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String string = scanner.nextLine();
        final String subString = scanner.nextLine();
        int count = 0, fromIndex = 0;

        while ((fromIndex = string.indexOf(subString, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }

        System.out.println(count);

    }
}