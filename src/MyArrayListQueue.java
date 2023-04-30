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



}
