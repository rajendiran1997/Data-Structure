public class ValidateParenthesis {
    
    static void validate(char c[]) {
        
        char stack[] = new char[c.length];
        int stackCount = 0;
        
        for(int i = 0; i < stack.length; i++) {
            stack[i] = '-';
        }
        
        try{
            for(int i = 0; i < c.length; i++) {
                if(c[i] == '{') {
                    stack[stackCount] = c[i];
                    stackCount++;
                }
                else
                {
                    if(stack[stackCount-1] == '{') {
                        stack[stackCount-1] = '-';
                        stackCount--;
                    }   
                    else 
                    {
                        System.out.println("Invalid");
                        return;
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid");
            return;
        }
        if(stackCount != 0) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("valid");
    }
    
    public static void main(String args[]) {
        String data = "{{{{}}}";
        validate(data.toCharArray());
    }
}
