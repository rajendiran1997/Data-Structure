import java.util.Scanner;
import static java.lang.System.out;

   public class Tictoc {
       
        static void printBoard(int board[][]) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                out.print(board[i][j] + " ");
            }
            out.println();
        }
    }
    
    static int[][] checkBoard(int board[][], int row, int col, boolean user) {
        if(user) {
            board[row][col] = 1;
        }
        else {
            board[row][col] = 2;
        }
        return board;
    }

    static boolean check(int board[][], boolean user) {
        boolean checker = false;
        if(user) {

            //check each row
            for(int i = 0; i < board.length; i++) {
                if(board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1) {
                    checker = true;
                    break;
                }
            }

            //check each col
            for(int i = 0; i < board.length; i++) {
                if(board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1) {
                    checker = true;
                    break;
                }
            }
            
            //check diagonal
            if((board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) || (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1))
                checker = true;

        }
        else {
            
            //check each row
            for(int i = 0; i < board.length; i++) {
                if(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2) {
                    checker = true;
                    break;
                }
            }

            //check each col
            for(int i = 0; i < board.length; i++) {
                if(board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2) {
                    checker = true;
                    break;
                }
            }
            
            //check diagonal
            if((board[0][0] == 2 &&  board[1][1] == 2 && board[2][2] == 2) || (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2))
                checker = true;

        }

        return checker;
    }
       
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int board[][] = new int[3][3];
        int start = 0;
        boolean user = true;
        printBoard(board);
        while(start != 9) {
            if(user) {
                out.println("User 1");
                out.println("Enter the row ");
                int row = sc.nextInt();
                out.println("Enter the col ");
                int col = sc.nextInt();
                board = checkBoard(board, row, col, user);
                printBoard(board);
                if(check(board, user)) {
                    out.println("User 1 is the winner");
                    break;
                }
                start++;
                user = false;
            }
            else {
                out.println("User 2");
                out.println("Enter the row ");
                int row = sc.nextInt();
                out.println("Enter the col ");
                int col = sc.nextInt();
                board = checkBoard(board, row, col, user);
                printBoard(board);
                if(check(board, user)) {
                    out.println("User 2 is the winner");
                    break;
                }
                start++;
                user = true;
            }
        }
        out.println("End of game");
        printBoard(board);
    }
}