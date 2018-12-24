import static java.lang.System.out;
import java.util.Scanner;

public class Sudoko {

	static int board[][];

	static void printBoard() {
		out.println();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				out.print(board[i][j] + " ");
			} 
			out.println();
		}
		out.println();
	}

	static boolean isSafe(int row, int col, int num) {

		//Checking for rows
		for(int i = 0; i < board.length; i++) {
			if(board[i][col] == num)
				return false;
		}

		//checking for cols
		for(int i = 0; i < board.length; i++) {
			if(board[row][i] == num)
				return false;
		}

		//checking for the 3*3 grid for the particular row and col
		for(int i = row-(row%3); i < row-(row%3)+3; i++) {
			for(int j = col-(col%3); j < col-(col%3)+3; j++) {
				if(board[i][j] == num)
					return false;
			}
		}
		return true;
	}

	static boolean solve(int row, int col) {

		if(col == 9) {
			col = 0;
			row = row + 1;
		}

		if(!unassigned()) {
			// Below function prints all the posibilities of sudoko by comments the return call in this function
			// printBoard(); 
			return true; // first solution alone be displayed
		}

		for(int i = 1; i <= board.length; i++) {
				if(isSafe(row, col, i)) {
					board[row][col] = i;
					if(solve(row, col+1)) 
						return true;
					board[row][col] = 0;
				}
		}
		return false;
	}

	static boolean unassigned() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] == 0)
					return true;
			} 
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		out.println("Default sudoko size is 9*9");

		board = new int[9][9];

		//Starts from row and col zero
		if(solve(0,0))
			printBoard();
		else
			out.println("Solution not found");

	}
}