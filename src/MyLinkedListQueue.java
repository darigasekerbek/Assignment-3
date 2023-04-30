import java.util.LinkedList;

public class MyLinkedListQueue<T> {
    private LinkedList<T> link_list;
    public MyLinkedListQueue(){ // constructor that init queue for Linked list
        link_list = new LinkedList<>();
    }
    public void enqueue(T item){ // add item to the back of queue
        link_list.addLast(item);
    }

}
