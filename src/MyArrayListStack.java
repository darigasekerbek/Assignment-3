import java.util.ArrayList;
public class MyArrayListStack<T> {
    private ArrayList<T> arr_list;
    public MyArrayListStack(){
        arr_list = new ArrayList<>();
    }
    //  add an item on the top of stack
    public void push (T item){
        arr_list.add(item);
    }

}
