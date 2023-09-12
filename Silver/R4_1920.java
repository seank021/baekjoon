package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class R4_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            if (binarySearch(arr, sc.nextInt()) != -1) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

        sc.close();
    }

    public static int binarySearch(int[] arr, int key) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;

            if (key < arr[midIndex]) {
                rightIndex = midIndex - 1;
            } else if (key > arr[midIndex]) {
                leftIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }

        return -1;
    }
}
