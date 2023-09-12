package Silver;

import java.util.Scanner;

public class R5_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 666;
        int count = 1;

        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        sc.close();

        System.out.println(num);
    }
}
