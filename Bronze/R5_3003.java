package Bronze;

import java.util.Scanner;

public class R5_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();

        int kingNum = 1 - king;
        int queenNum = 1 - queen;
        int rookNum = 2 - rook;
        int bishopNum = 2 - bishop;
        int knightNum = 2 - knight;
        int pawnNum = 8 - pawn;

        sc.close();

        System.out
                .println(kingNum + " " + queenNum + " " + rookNum + " " + bishopNum + " " + knightNum + " " + pawnNum);
    }
}
