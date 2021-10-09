import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] number = input.toCharArray();
        boolean lucky = isLucky(number);

        if (lucky) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }


    }

    public static boolean isLucky(char[] number) {
        int sumfirst = 0;
        int sumsecond = 0;
        for (int i = 0; i < number.length; i++) {
            if (i < number.length / 2) {
                sumfirst += Character.getNumericValue(number[i]);
            } else {
                sumsecond += Character.getNumericValue(number[i]);
            }
        }
        return sumfirst == sumsecond;
    }
}