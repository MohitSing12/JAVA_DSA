import java.util.Scanner;

public class n_Queen_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        Queen(board, 0, n);
    }

    public static void Queen(boolean[][] board, int row, int tq) {
        if (tq == 0) {
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isitsafe(board, row, col)) {
                board[row][col] = true;
                Queen(board, row + 1, tq - 1);
                board[row][col] = false;
            }
        }

    }

    public static boolean isitsafe(boolean[][] board, int row, int col) {
        //up wala
        int r = row;
        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }

        //left diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;

            }
            r--;
            c--;
        }

        //right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
//            System.out.println(r);
            if (board[r][c]) {

                return false;

            }
            r--;
            c++;
        }
        return true;
    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
