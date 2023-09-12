package Bronze;

import java.util.Scanner;

public class R1_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int N_factorial = 1;
        for (int i = 1; i <= N; i++) {
            N_factorial *= i;
        }
        int K_factorial = 1;
        for (int i = 1; i <= K; i++) {
            K_factorial *= i;
        }
        int NminusK_factorial = 1;
        for (int i = 1; i <= (N - K); i++) {
            NminusK_factorial *= i;
        }

        sc.close();

        System.out.println(N_factorial / (K_factorial * NminusK_factorial));
    }
}
