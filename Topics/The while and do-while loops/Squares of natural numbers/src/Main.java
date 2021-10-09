import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printSquare(N);
    }

    public static void printSquare(int N) {
        int n = 1;
        while (n * n <= N) {
            System.out.println(n * n);
            n++;

        }
    }
}
