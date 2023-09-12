package Bronze;

import java.util.Scanner;

public class R1_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] scores = new double[num];
        for (int i = 0; i < num; i++) {
            scores[i] = sc.nextInt();
        }
        double M = 0;
        for (double score : scores) {
            if (M < score) {
                M = score;
            }
        }
        double sum = 0;
        for (double score : scores) {
            score = score / M * 100;
            sum += score;
        }

        sc.close();

        System.out.println(sum / num);
    }
}
