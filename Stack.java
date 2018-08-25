class StackNode{
    StackNode next;
    int data; 
}

public class Stack{
    StackNode top;
    int length;
    int a;
    
    public void push(int data){
        StackNode temp = new StackNode();
        temp.data = data;
        temp.next = top;
        top = temp;
        length++;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("There is no data in the Stack");
            return -1;
        }
        else{
            a = top.data;
            top = top.next;
            length--;
            return a;
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("There is no data in the Stack");
            System.out.println();
        }
        else{
            System.out.println("Top is "+top.data);
            System.out.println();
        }
    }
    public boolean isEmpty(){
        if(top == null) 
            return true;
        else
            return false;
    }
    
    public Stack(){
        StackNode top = null;
        length=0;
        a=0;
    }

 public static void main(String []args){
         Stack s = new Stack();
         
         s.push(10);
         s.push(11);
         s.push(12);
         s.push(13);
         s.push(1001);
        
         System.out.println("Removed data is "+s.pop());
         System.out.println();
         s.peek();
        System.out.println("Length of the stack is "+ s.length);
        System.out.println();
     }
}
