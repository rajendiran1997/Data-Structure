class Queue{
    int data;
    Queue next;
}

public class MyClass {
    
    static Queue first = null;
    
    static void enqueue(int data){
        Queue node = new Queue();
        node.data = data;
        
        if(first == null){
            first = node;
        }else{
            Queue n = first;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
        System.out.println("Enqueued data is "+data);
    }
    
    static void dequeue(){
        System.out.println("Dequeued data is "+first.data);
        first = first.next;
    }
    
    static void display(){
        Queue n = first;
        System.out.print("   <-- | ");
        while(n != null){
            System.out.print(n.data+" | ");
            n = n.next;
        }
        System.out.println(" <--");
    }
    
    public static void main(String args[]) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        
        display();
        dequeue();
        enqueue(50);
        display();
    }
}
