import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int intMax = 0;
        while (scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (intMax < input) {
                intMax = input;
            }

        }
        System.out.println(intMax);
    }
}