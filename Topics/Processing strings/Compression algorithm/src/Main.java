import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "";
        int sum = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                sum++;
            } else {
                output = output + input.charAt(i) + sum;
                sum = 1;
            }
        }
        output = output + input.charAt(input.length() - 1) + sum;
        System.out.println(output);

    }


}