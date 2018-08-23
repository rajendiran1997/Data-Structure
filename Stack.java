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
        if(isEmpty())
            System.out.println("There is no data in the Stack");
        else
            System.out.println(top.data);
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
         s.pop();
        
         System.out.println("Removed data is "+s.pop());
         s.peek();
        System.out.println("Length is "+ s.length);
     }
}
