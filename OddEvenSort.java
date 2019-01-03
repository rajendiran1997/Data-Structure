import static java.lang.System.out;

public class OddEvenSort {
 
    static void sort(int num[]) {
        int len = num.length;
        int oddlen = len/2;
        int evenlen = len - oddlen;
        
        int oddele[] = new int[oddlen];
        int evenele[] = new int[evenlen];
        
        int a = 0, b = 0;
        
        //Assigning values to the appropriate array's
        for(int i = 0; i < len; i++) 
            if(i%2 == 0) 
                evenele[a++] = num[i];
            else
                oddele[b++] = num[i];
        
        
        a = 0; b = 0;
        
        //Sorting in descending order
        for(int i = 0; i < evenlen; i++)
            for(int j = i; j < evenlen; j++) 
                if(evenele[i] < evenele[j])
                {
                    int temp = evenele[i];
                    evenele[i] = evenele[j];
                    evenele[j] = temp;
                }
            
        //Sorting in ascending order    
        for(int i = 0; i < oddlen; i++)
            for(int j = i; j < oddlen; j++) 
                if(oddele[i] > oddele[j])
                {
                    int temp = oddele[i];
                    oddele[i] = oddele[j];
                    oddele[j] = temp;
                }
            
            
        for(int i = 0; i < len; i++) 
            if(i%2 == 0) 
                num[i] = evenele[a++];
            else
                num[i] = oddele[b++];

        for(int i = 0; i < len; i++) 
            out.print(num[i] + " ");
            
    }
 
    public static void main(String args[]) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        sort(num);
        
        // Input : 13,2,4,15,12,10,5
        // Output : 13,2,12,10,5,15,4
        
        // Input: 1,2,3,4,5,6,7,8,9
        // Output: 9,2,7,4,5,6,3,8,1
    }
}
