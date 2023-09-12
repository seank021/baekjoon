package Bronze;

import java.util.Scanner;

public class R5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        } while (a != 0 || b != 0);
        sc.close();
    }
}
