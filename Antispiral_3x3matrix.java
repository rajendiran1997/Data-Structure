import static java.lang.System.out;
import java.util.Scanner;

public class AntiSpiral {
    
    static void antispiral(int x[][]) {
        
        //3 * 3 matrix only
        boolean left = false, right = true, top = false, bottom = false;
        int row = 1, col = 1;
        int done = 0;
        while(done != (x.length*x.length)) {
            if(left) {
                out.print(x[row][col] + " ");
                col--;
                done++;
                if(col == 0) {
                    left = false;
                    top = true;
                }
            }
            
            if(right) {
                out.print(x[row][col] + " ");
                col++;
                done++;
                if(col == 2) {
                    right = false;
                    bottom = true;
                }
            }
            
            if(top) {
                out.print(x[row][col] + " ");
                row--;
                done++;
                if(row == 0) {
                    top = false;
                    right = true;
                }
            }
            
            if(bottom) {
                out.print(x[row][col] + " ");
                row++;
                done++;
                if(row == 2) {
                    bottom = false;
                    left = true;
                }
            }
        }
        
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int x[][] = new int[3][3];
        
        for(int i = 0; i < x.length; i++) 
            for(int j = 0; j < x[0].length; j++) {
                x[i][j] = sc.nextInt();
            }
        
        antispiral(x);
    }
}
