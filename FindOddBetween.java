import static java.lang.System.out;

public class FindOddBetween {
    
    static int[] findOdd(int start, int end) {
        int array[] = new int[(end-start)/2];
        int inc = 0;
        for(int i = start+1; i < end; i++) 
            if(i%2 != 0)
               array[inc++] = i;
               
        return array;
    }
    
    public static void main(String args[]) {
        int odd[] = findOdd(2,15);
        
        for(int i = 0; i < odd.length; i++) 
            out.print(odd[i] + " ");
        
    }
}
