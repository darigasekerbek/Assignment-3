import java.util.ArrayList;

public class MyArrayListQueue<T> {
    private ArrayList<T> arr_list;
    public MyArrayListQueue(){ // constructor that init ArrayList
        arr_list = new ArrayList<>();
    }
    public void enqueue(T item){
        arr_list.add(item);
    }



}
