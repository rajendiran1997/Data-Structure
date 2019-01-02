import static java.lang.System.out;
import java.util.Scanner;

class AntiSpiral {
    
    static void antispiral(int x[][]) {
        
        //3 * 3 matrix only
        int left = 0, right = 1, top = 0, bottom = 0;
        int row = 1, col = 1;
        int done = 0;
        while(done != (x.length*x.length)) {
            if(left == 1) {
                out.print(x[row][col] + " ");
                col--;
                done++;
                if(col == 0) {
                    left = 0;
                    top = 1;
                }
            }
            
            if(right == 1) {
                out.print(x[row][col] + " ");
                col++;
                done++;
                if(col == 2) {
                    right = 0;
                    bottom = 1;
                }
            }
            
            if(top == 1) {
                out.print(x[row][col] + " ");
                row--;
                done++;
                if(row == 0) {
                    top = 0;
                    right = 1;
                }
            }
            
            if(bottom == 1) {
                out.print(x[row][col] + " ");
                row++;
                done++;
                if(row == 2) {
                    bottom = 0;
                    left = 1;
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
