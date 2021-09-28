import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        List<Integer> listDist = new ArrayList<>();
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        int minDist = Integer.MAX_VALUE;
        int dist;

        for (String s : str.split("\\s")) {
            list.add(Integer.parseInt(s));
        }

        for (Integer i : list) {
            dist = Math.abs(n - i);

            if (dist < minDist) {
                listDist.clear();
                listDist.add(i);
                minDist = dist;
            } else if (dist == minDist) {
                listDist.add(i);
            }
        }
        Collections.sort(listDist);
        listDist.forEach(var -> System.out.print(var + " "));
    }
}
