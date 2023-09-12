package Bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class R2_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        System.out.println(st.countTokens());

        sc.close();
    }
}
