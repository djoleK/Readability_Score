import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> list = new ArrayList<>();
        final List<Integer> list1 = new ArrayList<>();
        while (scanner.hasNext()) {
            int current = scanner.nextInt();
            list.add(current);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                list1.add(list.get(i));
            }
        }
        Collections.reverse(list1);

        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }


    }
}