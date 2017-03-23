/**
 * Created by jay on 2017/3/21.
 */
public class MyQueue {
    Node head;
    
    public MyQueue(){
        if(!isEmpty()) {
            queue.add(head);
        }
        count = 0;

    }
    
    public Node add() {
        Node next = head.getNext();
        while(next.getNext() != null) {
            next = next.getNext();
        }
        queue.add(next);
        count++;
        return next;
    
    }
    public Node remove() {  //remove first element in Queue
        this.head = null;
        count--;
    }
    public boolean isEmpty() {
        if(count = 0 || head = null){
            return true;
        }
        return false;
    }
}
