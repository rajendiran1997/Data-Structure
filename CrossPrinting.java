import static java.lang.System.out;

public class CrossPrinting {
    
    static void crossPrint(char c[]) {
        
        boolean status = false;
      
        if(c.length%2 != 0) {
            int length = c.length;
            
            for(int i = 0; i < c.length; i++) {
                
                 if(length < 0)
                    status = true;
                
                if(!status)
                    length -= 2;
                else
                    length += 2;
                
                for(int k = i; k<=(c.length/2) && k > 0 && status==false ; k--) {
                        out.print(" ");
                }
                
                for(int k = i; k<(c.length-1)&& status == true; k++) {
                    out.print(" ");
                }
                
                
                out.print(c[i]);
                
                    
                for(int j = 0; j < length; j++)
                    out.print(" ");
                
                if(length > 0)
                    out.print(c[i]);
                
                
                out.println();
            }
        }
        else
        {
            out.println("Give me odd number of letters");
        }
       
    }
    
    public static void main(String args[]) {
        String title = "rajendran";
        crossPrint(title.toCharArray());
    }
}
