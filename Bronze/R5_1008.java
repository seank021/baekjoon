package Bronze;

import java.util.Scanner;

public class R5_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double result = (double) a / (double) b;

        sc.close();

        System.out.println(result);
    }
}