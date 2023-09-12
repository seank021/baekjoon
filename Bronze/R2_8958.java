package Bronze;

import java.util.Scanner;

public class R2_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String testcase = sc.nextLine();
            int totalSum = 0;
            int sum = 0;
            String[] arr = testcase.split("");
            for (String s : arr) {
                if (s.equals("O")) {
                    sum += 1;
                    totalSum += sum;
                } else {
                    sum = 0;
                }
            }
            System.out.println(totalSum);
        }
        sc.close();
    }
}
