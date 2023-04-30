import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    private ArrayList<T> arr_list;
    public MyArrayListQueue(){ // constructor that init ArrayList
        arr_list = new ArrayList<>();
    }
    //add element to the end of queue
    public void enqueue(T item){
        arr_list.add(item);
    }
    //remove and return element at the beginning of queue
    public T dequeue(){
        if (arr_list.isEmpty()){
            throw new NoSuchElementException();
        }
        return arr_list.remove(0);
    }
    // method that return element at the beginning without removing
    public T peek(){
        if(arr_list.isEmpty()){
            throw new NoSuchElementException();
        }
        return arr_list.get(0);
    }
    // check if queue is empty or not
    public boolean isEmpty(){
        return arr_list.isEmpty();
    }
    // return the size of the queue
   public int size(){
        return arr_list.size();
   }
}
