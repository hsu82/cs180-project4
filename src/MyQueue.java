/**
 * Created by jay on 2017/3/21.
 */
public class MyQueue extends Object{
    private Node head;
    private int count = 0; //Queue size
    private Object monitor;



    public MyQueue(){

    }

    public Node add() {


        Object o = new Object();
        Node sn = new Node(o);

        if(head == null){
            head = sn;
            count++;
            return head;

        }

        Node next = head.getNext();

        if(next == null){
            head.setNext(sn);
            count++;
            return head.getNext();

        }else {
            while (next.getNext() != null) {
                next = next.getNext();
                if(next.getNext() == null){
                    next.setNext(sn);
                    count++;
                    return next.getNext();
                }
            }
        }

        return next.getNext();
    }

    public Node remove() { //remove first element in Queue
        //returns removed Node
        // System.out.println("--------Remove MEthod-------------");
        //  System.out.println(head);

        if(count == 0){
            return null;
        }
        if(head == null){
            count = 0;
            return head;
        }

        Node remove = head;
        head = head.getNext();
        count--;
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

    public void add(Object o){
        // System.out.println("============Add Method==============");

        Node sn = new Node(o);

        if(head == null){
            head = sn;
            //   System.out.println("head: " + head);
            count++;
            return;
        }

        Node next = head.getNext();
        if(next == null){
            head.setNext(sn);
            count++;
            //   System.out.println("next-null");
            return;

        }else {
            while(next.getNext() != null){

                next = next.getNext();

            }
            next.setNext(sn);
            count++;

        }

    }


    public Node peek() {

        return head;
    }
}
