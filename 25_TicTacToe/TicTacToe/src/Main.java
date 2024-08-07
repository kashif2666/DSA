
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            int row, col;

            while (true) {
                System.out.print("Player " + player + ", enter your coordinates (row and column): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    break;
                } else {
                    System.out.println("Invalid move. Try again!");
                }
            }

            board[row][col] = player;
            gameOver = haveWon(board, player);

            if (gameOver) {
                printBoard(board);
                System.out.println("Player " + player + " has won!");
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("The game is a tie!");
                gameOver = true;
            } else {
                player = (player == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < board[row].length - 1) System.out.print(" | ");
            }
            System.out.println();
            if (row < board.length - 1) System.out.println("---------");
        }
    }

    private static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

