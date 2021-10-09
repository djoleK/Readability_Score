import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();

        System.out.println(lowestN(m));

    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int lowestN(long m) {
        int n = 2;
        while (factorial(n) <= m) {
            n++;
        }
        return n;
    }
}