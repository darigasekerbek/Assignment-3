import java.util.LinkedList;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    private LinkedList<T> link_list;
    public MyLinkedListStack(){
        link_list = new LinkedList<>();
    }
    //add item on the top of stack
    public void push (T item){
        link_list.addFirst(item);
    }
    //remove and return item at the top of the stack
    public T pop(){
        if(link_list.isEmpty()){
            throw new EmptyStackException();
        }
        return link_list.removeFirst();
    }
    // return item at the top without removing it
    public T peek(){
        if(link_list.isEmpty()){
            throw new EmptyStackException();
        }
        return link_list.getFirst();
    }
    //check if stack is empty or not empty
    public boolean isEmpty(){
        return link_list.isEmpty();
    }
    // return num of item in stack
    public int size(){
        return link_list.size();
    }


}
