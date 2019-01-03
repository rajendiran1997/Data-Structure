import static java.lang.System.out;

public class FindSubString {
 
    static int find(char[] text, char[] sub_text) {
        boolean found = false;
        int index = -1;
        
        int lenOfSubText = sub_text.length;
        try {        
            for(int i = 0; i < text.length; i++) {
                if(text[i] == sub_text[0]) {
                    int recent_index = i;
                    int storeIndex = i;
                        for(int j = 0; j < sub_text.length; j++) {
                            if(sub_text[j] == text[recent_index++])
                                found = true;
                            else {
                                found = false;
                                break;
                            }
                        }
                    if(found) {
                        index = storeIndex;
                        break;
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            index = -1;
        }
        
        return index;
    }  
 
    public static void main(String args[]) {
        String text = "test123string";
        String sub_text = "123";
        
        out.println(find(text.toCharArray(), sub_text.toCharArray()));
    }
}


// Eg 1:Input:
//         String 1: test123string
//          String 2: 123
//         Output: 4
// Eg 2: Input:
//         String 1: testing12
//         String 2: 1234 
//         Output: -1
