package Bronze;

import java.util.Scanner;

public class R3_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w >= x && h >= y) {
            int len1 = x;
            int len2 = h - y;
            int len3 = w - x;
            int len4 = y;
            int result_tmp1 = Math.min(len1, len2);
            int result_tmp2 = Math.min(len3, len4);
            int result = Math.min(result_tmp1, result_tmp2);
            System.out.println(result);
        } else if (w >= x) {
            System.out.println(y - h);
        } else {
            System.out.println(x - w);
        }

        sc.close();
    }
}
