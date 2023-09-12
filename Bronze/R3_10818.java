package Bronze;

import java.util.Scanner;

public class R3_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }
        int max = -1000001;
        int min = 1000001;
        for (int i : numArr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        sc.close();

        System.out.println(min + " " + max);
    }
}
