package Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class R5_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = s1.length() - s2.length();
                if (result == 0) {
                    return s1.compareTo(s2);
                } else {
                    return result;
                }
            }
        });
        System.out.println(arr[0]);
        for (int i = 1; i < num; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
