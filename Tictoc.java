import java.util.Scanner;
import static java.lang.System.out;

   public class Tictoc {

        static char[][] createBoard() {
            char board[][] = new char[3][3];
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[0].length; j++) {
                    board[i][j] = '-';
                }
            }
            return board;
        }
       
        static void printBoard(char board[][]) {
            for(int i = 0; i < board.length; i++) {
                for(int j = 0; j < board[0].length; j++) {
                    out.print(board[i][j] + " ");
                }
                out.println();
            }
            out.println("\n");
        }
    
        static char[][] checkBoard(char board[][], int row, int col, boolean user) {
            if(user && board[row][col] != 'X' && board[row][col] != 'O') {
                board[row][col] = 'X';
            }
            else if(!user && board[row][col] != 'X' && board[row][col] != 'O'){
                board[row][col] = 'O';
            }
            return board;
        }

        static boolean check(char board[][], boolean user) {
            boolean checker = false;
            if(user) {

                //check each row
                for(int i = 0; i < board.length; i++) {
                    if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                        checker = true;
                        break;
                    }
                }

                //check each col
                for(int i = 0; i < board.length; i++) {
                    if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                        checker = true;
                        break;
                    }
                }
                
                //check diagonal
                if((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
                    checker = true;

            }
            else {
                
                //check each row
                for(int i = 0; i < board.length; i++) {
                    if(board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                        checker = true;
                        break;
                    }
                }

                //check each col
                for(int i = 0; i < board.length; i++) {
                    if(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                        checker = true;
                        break;
                    }
                }
                
                //check diagonal
                if((board[0][0] == 'O' &&  board[1][1] == 'O' && board[2][2] == 'O') || (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'))
                    checker = true;

            }

            return checker;
        }
       
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char board[][] = createBoard();
        int start = 0;
        boolean user = true;
        printBoard(board);
        while(start != 9) {
            if(user) {
                out.println("User 1");
                int row = 0, col = 0;
                boolean repeat = false;
                do {
                    if(repeat)
                        System.err.println("Please don't overwrite\n");
                    out.println("Enter the row ");
                    row = sc.nextInt();
                    out.println("Enter the col ");
                    col = sc.nextInt();
                    repeat = true;
                } while(board[row][col] != '-');
                board = checkBoard(board, row, col, user);
                printBoard(board);
                if(check(board, user)) {
                    out.println("User 1 is the winner\n");
                    break;
                }
                start++;
                user = false;
            }
            else {
                out.println("User 2");
                int row, col;
                boolean repeat = false;
                do {
                    if(repeat)
                        System.err.println("Please don't overwrite\n");
                    out.println("Enter the row ");
                    row = sc.nextInt();
                    out.println("Enter the col ");
                    col = sc.nextInt();
                    repeat = true;
                } while(board[row][col] != '-');
                board = checkBoard(board, row, col, user);
                printBoard(board);
                if(check(board, user)) {
                    out.println("User 2 is the winner\n");
                    break;
                }
                start++;
                user = true;
            }
        }
        out.println("End of the game\n");
        if(start == 9)
            out.println("Draw the match\n");
        printBoard(board);
    }
}
