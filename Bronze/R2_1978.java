package Bronze;

import java.util.Scanner;

public class R2_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (isPrime(sc.nextInt())) {
                cnt++;
            }
        }

        sc.close();

        System.out.println(cnt);
    }

    public static boolean isPrime(int num) {
        boolean yesOrNo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                yesOrNo = false;
                break;
            }
        }
        return yesOrNo && num != 1;
    }
}
