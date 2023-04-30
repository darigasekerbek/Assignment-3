import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private LinkedList<T> link_list;
    public MyLinkedListQueue(){ // constructor that init queue for Linked list
        link_list = new LinkedList<>();
    }
    public void enqueue(T item){ // add item to the back of queue
        link_list.addLast(item);
    }
   public T dequeue(){ //remove element at the front of the queue and return it
        if (link_list.isEmpty()){
            throw new NoSuchElementException();
        }
        return link_list.removeFirst();
   }
   public T peek(){ // like dequeue but, without removing element
       if (link_list.isEmpty()){
           throw new NoSuchElementException();
       }
       return link_list.getFirst();
   }

}
