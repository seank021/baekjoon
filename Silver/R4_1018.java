package Silver;

import java.util.Scanner;

public class R4_1018 {
    public static void main(String[] args) {
        String[][] whiteBoard = new String[8][8];
        String[][] blackBoard = new String[8][8];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                whiteBoard[i * 2][j * 2] = "W";
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                whiteBoard[i * 2 + 1][j * 2] = "B";
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                whiteBoard[i * 2][j * 2 + 1] = "B";
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                whiteBoard[i * 2 + 1][j * 2 + 1] = "W";
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                blackBoard[i * 2][j * 2] = "B";
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                blackBoard[i * 2 + 1][j * 2] = "W";
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                blackBoard[i * 2][j * 2 + 1] = "W";
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                blackBoard[i * 2 + 1][j * 2 + 1] = "B";
            }
        }

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        String[][] board = new String[row][col];

        sc.nextLine();

        for (int i = 0; i < row; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = line.split("")[j];
            }
        }

        int result = 2500;
        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                int sum = 0;
                int tmpSum1 = 0;
                int tmpSum2 = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (!(board[i + k][j + l].equals(whiteBoard[k][l]))) {
                            tmpSum1++;
                        }
                        if (!(board[i + k][j + l].equals(blackBoard[k][l]))) {
                            tmpSum2++;
                        }
                    }
                    sum = Math.min(tmpSum1, tmpSum2);
                }
                if (sum < result) {
                    result = sum;
                }
            }
        }

        sc.close();

        System.out.println(result);
    }
}
