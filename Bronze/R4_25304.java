package Bronze;

import java.util.Scanner;

public class R4_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
            num -= 1;
        }
        if (totalPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
