public class FunnyArray{
  public static void main(String args[]){
    int []array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int evenCount = 0, oddCount = 0;
    int addEven = 0, addOdd = 0;
    int countI = 0, countJ = 0;
    int evenArr[], oddArr[];
    
    for(int i = 0;i < array.length;i++){
      if(array[i]%2 == 0)
        evenCount++;
      else
        oddCount++;
    }
    
    evenArr = new int[evenCount];
    oddArr = new int[oddCount];
    
    System.out.println("Even count is "+evenCount+" & Odd count is "+oddCount);
    System.out.println();
    
    for(int i = 0;i < array.length;i++){
      if(array[i]%2 == 0){
        evenArr[countI] = array[i];
      	countI++;
      }
      else{
        oddArr[countI] = array[i];
      	countJ++;
      }
    }  
    
    System.out.println("Even Array ");
    for(int i = 0; i<evenArr.length; i++){
      System.out.print(evenArr[i] +" ");
      addEven += evenArr[i];
   }System.out.println();
   System.out.println();
   
    System.out.println("Odd Array ");
    for(int i = 0; i<oddArr.length; i++){
      System.out.print(oddArr[i] +" ");
      addOdd += oddArr[i];
   }System.out.println();
   System.out.println();
   
    System.out.println("Addition of even numbers in array is "+addEven);
    System.out.println();
    System.out.println("Addition of odd numbers in array is "+addOdd);
  }
}
