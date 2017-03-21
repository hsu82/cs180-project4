/**
 * Created by jay on 2017/3/21.
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object obj) {
        this.data = obj;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
    public Object getData() {
        return data;
    }

}
