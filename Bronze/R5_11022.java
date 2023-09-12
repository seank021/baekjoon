package Bronze;

import java.util.Scanner;

public class R5_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num + 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}
