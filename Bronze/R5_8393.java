package Bronze;

import java.util.Scanner;

public class R5_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num;
            num -= 1;
        }
        sc.close();

        System.out.println(sum);
    }
}
