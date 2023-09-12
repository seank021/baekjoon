package Bronze;

import java.util.Scanner;

public class R2_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean hasNum = false;
        for (int i = 0; i < num; i++) {
            String[] arr = String.valueOf(i).split("");
            int sum = i;
            for (String s : arr) {
                sum += Integer.parseInt(s);
            }
            if (sum == num) {
                System.out.println(i);
                hasNum = true;
                break;
            }
        }
        if (!hasNum)
            System.out.println("0");

        sc.close();
    }
}
