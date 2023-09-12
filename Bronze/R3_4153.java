package Bronze;

import java.util.Scanner;

public class R3_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                keepGoing = false;
            } else {
                if ((a >= b && b >= c) || (a >= c && c >= b)) {
                    if (b * b + c * c == a * a) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                } else if ((b >= a && a >= c) || (b >= c && c >= a)) {
                    if (a * a + c * c == b * b) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                } else {
                    if (a * a + b * b == c * c) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                }

            }
        }

        sc.close();
    }
}
