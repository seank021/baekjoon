package Bronze;

import java.util.Scanner;

public class R1_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepInput = true;
        while (keepInput) {
            String num = Integer.toString(sc.nextInt());
            if (num.equals("0")) {
                keepInput = false;
            } else {
                int length = num.length();
                String[] arr = new String[length];
                for (int i = 0; i < length; i++) {
                    arr[i] = num.split("")[i];
                }
                boolean isPalindrome = true;
                for (int i = 0; i < length; i++) {
                    if (!arr[i].equals(arr[length - i - 1])) {
                        isPalindrome = false;
                    }
                }

                if (isPalindrome) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}
