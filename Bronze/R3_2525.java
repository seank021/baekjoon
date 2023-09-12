package Bronze;

import java.util.Scanner;

public class R3_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        int MT = min + time;

        while (MT >= 60) {
            hour += 1;
            if (hour >= 24) {
                hour = 0;
            }
            MT -= 60;
        }

        sc.close();

        System.out.println(hour + " " + MT);
    }
}
