import static java.lang.System.out;
import java.util.Scanner;

public class LoopPrint {
    
    static void print(char c[]) {
        for(int i = 0; i < c.length; i++) {
            int v = Integer.parseInt(""+c[++i]);
            for(int j = 0; j < v; j++)
                out.print(c[i-1]);
        }
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        String s = "a5b1c2";
        
        print(s.toCharArray());
        
    }
}
