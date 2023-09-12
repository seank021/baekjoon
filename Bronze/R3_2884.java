package Bronze;

import java.util.Scanner;

public class R3_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min - 45 < 0) {
            hour -= 1;
            if (hour < 0) {
                hour = 23;
            }
            min += 15;
        } else {
            min -= 45;
        }

        sc.close();

        System.out.println(hour + " " + min);
    }
}
