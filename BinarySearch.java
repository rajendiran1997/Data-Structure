public class BinarySearch{
    
    public static int binarySearch(String[] arr,int low, int high, String key){
        int mid=0;
        while(low<=high){
            mid =(low + high)/2;
            
            if(key.equals(arr[mid])) return mid;
            
            if(key.compareTo(arr[mid]) < 0)
                high = mid -1;
            else
                low = mid + 1;
                
        }
        return mid;
    }
    
    public static void main(String args[]){
        String []array = {"Dhanalakshmi","Gowri","Rajendiran","Venkat"};
        String key = "Rajendiran";
        int index = binarySearch(array,0,array.length-1,key);
        System.out.println(key + " is found at the position "+index);
    }
}

