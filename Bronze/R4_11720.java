package Bronze;

import java.util.Scanner;

public class R4_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += (nums.charAt(i) - '0');
        }
        System.out.println(sum);

        sc.close();
    }
}
