package Bronze;

import java.util.Scanner;

public class R2_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        for (int i = 0; i < cycle; i++) {
            int num = sc.nextInt();
            String str = sc.nextLine();
            for (int k = 0; k < str.strip().split("").length; k++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(str.strip().split("")[k]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
