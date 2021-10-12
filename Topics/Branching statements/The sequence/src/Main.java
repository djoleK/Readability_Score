import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        ArrayList<Integer> list = calculateNum(input);
        for (int i = 0; i < input; i++) {
            System.out.print(list.get(i) + " ");
        }


    }

    public static ArrayList<Integer> calculateNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);

            }
        }
        return list;
    }
}