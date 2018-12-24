import java.util.Scanner;
import static java.lang.System.out;

public class NQueen {

	static int arr[][];
	static int totalSolution = 0;

	static void printSolution() {
		for(int a = 0; a < arr.length; a++) {
		 	for(int b = 0; b < arr[0].length; b++){
		 		out.print(arr[a][b] + " ");
		 	}out.println();
		 }
		 out.println();
	}

	static boolean isSafe(int row, int col) {

		int i = 0, j = 0;

				for(i = 0; i < col; i++) 
        			if (arr[row][i] == 1) 
            			return false; 
  
			    for(i=row, j=col; i>=0 && j>=0; i--, j--) 
			        if (arr[i][j] == 1) 
			            return false; 
			  
			    for(i=row, j=col; j>=0 && i<arr.length; i++, j--) 
			        if (arr[i][j] == 1) 
			            return false; 

		return true;
	}

	static boolean findSol(int col) {
		if(col == arr.length) {
			totalSolution++;
		 	printSolution();
		 	return true;
		}
			boolean result = false;

			for(int row = 0; row < arr.length; row++) {
				if(isSafe(row, col)) {
					arr[row][col] = 1;
					result = findSol(col + 1) || result;
					arr[row][col] = 0;
				}
			}

		return result;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		out.println("Enter the number of row to be printed ");
		int size = sc.nextInt();
		
		arr = new int[size][size];
		out.println();

		if(findSol(0) == false)
			out.println("Solution does not exist");

		out.println("Number of solutions for NQ problem of size \"" + size + "\" is " + totalSolution);
	}
}