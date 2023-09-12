package Bronze;

import java.util.Scanner;

public class R3_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int order = 0;
        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                order = i;
            }
        }
        sc.close();

        System.out.println(max);
        System.out.println(order);
    }
}
