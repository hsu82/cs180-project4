import java.util.ArrayList;

/**
 * Created by jay on 2017/3/21.
 */
public class MyQueue extends Object{
    private Node head;
    private int count = 0; //Queue size
    private Object monitor;
    private ArrayList<Node> nodes = new ArrayList<Node>();

    //how even

    public MyQueue(){
        if(!isEmpty()) {
            nodes.add(head);
            count = 1;
        }
    }

    public Node add() {
        Node next = head.getNext();
        while(next.getNext() != null) {
            next = next.getNext();
        }
        nodes.add(next);
        count++;
        return next;
    }

    public Node remove() { //remove first element in Queue
        if(count == 0){
            return null;
        }
        Node remove = nodes.get(0);
        nodes.remove(0);
        count--;

        if(count >=1) {
            head = nodes.get(0);
        }
        else
            head = null;
        return remove;
    }

    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return count;
    }

    public void add(String s){

        Node sn = new Node(s);
        nodes.add(sn);
        //    for(int i = 0; i < count; i++){
        //        System.out.println("Add: " + nodes.get(i).getData());
        //    }
        count++;
    }

    public void add(int n){
        Node in = new Node(n);
        nodes.add(in);
        count++;
        //    for(int i = 0; i < count; i++){
        //       System.out.println("Add: " + nodes.get(i).getData());
        //    }
    }

    public Node peek() {
        return nodes.get(0);
    }
}
