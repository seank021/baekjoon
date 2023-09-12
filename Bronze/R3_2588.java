package Bronze;

import java.util.Scanner;

public class R3_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = a * (b % 10);
        int result2 = a * (b % 100 - b % 10);
        int result3 = a * (b - b % 100);

        sc.close();

        System.out.println(result1);
        System.out.println(result2 / 10);
        System.out.println(result3 / 100);
        System.out.println(result1 + result2 + result3);
    }
}
