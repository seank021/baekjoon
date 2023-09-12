package Bronze;

import java.util.Scanner;

public class R4_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int money;

        if (a == b && b == c) {
            money = 10000 + a * 1000;
        } else if (a == b && a != c) {
            money = 1000 + a * 100;
        } else if (a == c && a != b) {
            money = 1000 + a * 100;
        } else if (b == c && b != a) {
            money = 1000 + b * 100;
        } else if (a > b && (b > c || a > c)) {
            money = a * 100;
        } else if (b > a && (a > c || b > c)) {
            money = b * 100;
        } else
            money = c * 100;

        System.out.println(money);

        sc.close();
    }
}
