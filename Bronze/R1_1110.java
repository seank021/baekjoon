package Bronze;

import java.util.Scanner;

public class R1_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNum = sc.nextInt();
        int copiedNum = originalNum;
        int changedNum;
        int cycle = 1;
        boolean end = false;
        while (!end) {
            changedNum = ((copiedNum / 10) + (copiedNum % 10)) % 10 + (10 * (copiedNum % 10));
            copiedNum = changedNum;
            if (changedNum == originalNum) {
                end = true;
            } else {
                cycle += 1;
            }
        }
        sc.close();

        System.out.println(cycle);
    }
}
